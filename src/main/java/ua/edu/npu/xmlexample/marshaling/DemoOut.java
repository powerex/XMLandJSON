package ua.edu.npu.xmlexample.marshaling;

import ua.edu.npu.model.Department;
import ua.edu.npu.model.Employee;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class DemoOut {
    public static void main(String[] args)
    {
        Employee employee = new Employee(1, "Name", "Smith", new Department(101, "IT"));
        jaxbObjectToXML(employee);
    }

    private static void jaxbObjectToXML(Employee employee)
    {
        try
        {
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File file = new File( "src/main/resources/output.xml" );
            jaxbMarshaller.marshal(employee, file);
        } catch (JAXBException exception) {
            exception.printStackTrace();
        }
    }
}
