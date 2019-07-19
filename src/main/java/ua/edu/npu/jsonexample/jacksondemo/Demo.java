package ua.edu.npu.jsonexample.jacksondemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ua.edu.npu.model.Department;
import ua.edu.npu.model.Employee;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John", "Week", new Department(505, "Security"));

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = mapper.writeValueAsString(employee);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("json " + jsonString);

        Employee newEmployee = null;
        try {
            newEmployee = mapper.readValue(jsonString, Employee.class);
            System.out.println(newEmployee);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
