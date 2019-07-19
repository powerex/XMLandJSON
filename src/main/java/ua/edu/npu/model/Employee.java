package ua.edu.npu.model;


import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
    @XmlAttribute(name = "number")
    private int id;
    private String name;
    private String secondName;
    @XmlElement
    private Department department;

    public Employee() {
    }

    public Employee(int id, String name, String secondName, Department department) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.department = department;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", department=" + department +
                '}';
    }
}
