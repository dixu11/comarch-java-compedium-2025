package zaawansowane.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.*;
import java.util.*;

@JacksonXmlRootElement(localName = "company")
public class Company {
    @JacksonXmlProperty(isAttribute = true)
    private String name;

    @JacksonXmlElementWrapper(localName = "departments")
    @JacksonXmlProperty(localName = "department")
    private List<Department> departments = new ArrayList<>();

    public Company() {}
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Department> getDepartments() { return departments; }
    public void setDepartments(List<Department> departments) { this.departments = departments; }
}
