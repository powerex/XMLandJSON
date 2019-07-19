package ua.edu.npu.jsonexample.gsondemo;

import com.google.gson.Gson;
import ua.edu.npu.model.Department;
import ua.edu.npu.model.Employee;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Name", "Smith",
                new Department(101, "IT"));
        Gson gson = new Gson();
        String jsonString = gson.toJson(employee);
        System.out.println("json " + jsonString);

        Employee newEmployee = gson.fromJson(jsonString, Employee.class);
        System.out.println(newEmployee);
    }
}
