package zaawansowane.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.*;
import java.util.*;

public class Department {
    @JacksonXmlProperty(isAttribute = true)
    private String code;

    @JacksonXmlElementWrapper(localName = "teams")
    @JacksonXmlProperty(localName = "team")
    private List<Team> teams = new ArrayList<>();

    public Department() {}
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public List<Team> getTeams() { return teams; }
    public void setTeams(List<Team> teams) { this.teams = teams; }
}
