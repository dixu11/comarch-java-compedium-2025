package zaawansowane.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class XmlDemo {
    public static void main(String[] args) throws JsonProcessingException {
        String xml = """
                <company name="Acme Inc">
                  <departments>
                    <department code="IT">
                      <teams>
                        <team name="Platform">
                          <members>
                            <member>
                              <firstName>Ala</firstName>
                              <lastName>Nowak</lastName>
                              <email>ala@acme.io</email>
                              <salary>14500</salary>
                            </member>
                            <member>
                              <firstName>Bartek</firstName>
                              <lastName>Kowal</lastName>
                              <email>bk@acme.io</email>
                              <salary>17250</salary>
                            </member>
                          </members>
                        </team>
                        <team name="Data">
                          <members>
                            <member>
                              <firstName>Celina</firstName>
                              <lastName>Zięba</lastName>
                              <email>cz@acme.io</email>
                              <salary>16000</salary>
                            </member>
                          </members>
                        </team>
                      </teams>
                    </department>
                    <department code="HR">
                      <teams>
                        <team name="PeopleOps">
                          <members>
                            <member>
                              <firstName>Damian</firstName>
                              <lastName>Lis</lastName>
                              <email>damian@acme.io</email>
                              <salary>9800</salary>
                            </member>
                          </members>
                        </team>
                      </teams>
                    </department>
                  </departments>
                </company>
                """;

        XmlMapper mapper = new XmlMapper();

        // XML -> obiekt
        Company company = mapper.readValue(xml, Company.class);

        // Proste dojścia do pól (3 zagnieżdżenia): department->team->member
        String randomEmail = company.getDepartments().get(0).getTeams().get(0).getMembers().get(0).getEmail();
        System.out.println("Pierwszy email: " + randomEmail);

        // Streamy: lista maili z IT/Platform
        List<String> platformEmails = company.getDepartments().stream()
                .filter(d -> "IT".equals(d.getCode()))
                .flatMap(d -> d.getTeams().stream())
                .filter(t -> "Platform".equals(t.getName()))
                .flatMap(t -> t.getMembers().stream())
                .map(Member::getEmail)
                .toList();
        System.out.println("Platform emails: " + platformEmails);

        // Streamy: średnia pensja w IT
        double avgIt = company.getDepartments().stream()
                .filter(d -> "IT".equals(d.getCode()))
                .flatMap(d -> d.getTeams().stream())
                .flatMap(t -> t.getMembers().stream())
                .collect(Collectors.averagingInt(Member::getSalary));
        System.out.println("Średnia IT: " + avgIt);

        // Streamy: mapowanie imię+nazwisko -> salary (tylko > 10k), posortowane malejąco
        LinkedHashMap<String,Integer> rich = company.getDepartments().stream()
                .flatMap(d -> d.getTeams().stream())
                .flatMap(t -> t.getMembers().stream())
                .filter(m -> m.getSalary() > 10_000)
                .sorted(Comparator.comparingInt(Member::getSalary).reversed())
                .collect(Collectors.toMap(
                        m -> m.getFirstName()+" "+m.getLastName(),
                        Member::getSalary,
                        (a,b)->a,
                        LinkedHashMap::new
                ));
        System.out.println("Zarobki >10k: " + rich);

        // Mutacja pola w głębi i serializacja z powrotem do XML
        company.getDepartments().stream()
                .filter(d -> "HR".equals(d.getCode()))
                .flatMap(d -> d.getTeams().stream())
                .flatMap(t -> t.getMembers().stream())
                .findFirst()
                .ifPresent(m -> m.setEmail("hr-updated@acme.io"));

        String backToXml = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(company);
        System.out.println("\n=== Z powrotem do XML ===\n" + backToXml);
    }

}
