package zaawansowane.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.*;
import java.util.*;

public class Team {
    @JacksonXmlProperty(isAttribute = true)
    private String name;

    @JacksonXmlElementWrapper(localName = "members")
    @JacksonXmlProperty(localName = "member")
    private List<Member> members = new ArrayList<>();

    public Team() {}
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Member> getMembers() { return members; }
    public void setMembers(List<Member> members) { this.members = members; }
}
