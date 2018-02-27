package learnbyexample.java8;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionIdentityExample {

    public static void main(String[] args) {
        functionIdentity();
    }

    public static void functionIdentity() {
        Function<Employee, String> funcEmpToString = Employee::getName;
        List<Employee> employeeList =
                Arrays.asList(new Employee("Tom Jones", 45),
                        new Employee("Harry Major", 25),
                        new Employee("Ethan Hardy", 65),
                        new Employee("Nancy Smith", 15),
                        new Employee("Deborah Sprightly", 29));

        List<Employee> empNameListInitials = applyIdentityToEmpList(employeeList, Function.identity());
        empNameListInitials.forEach(System.out::println);
    }

    public static List<Employee> applyIdentityToEmpList(List<Employee> employeeList, Function<Employee, Employee> funcEmpToEmp) {
        List<Employee> empNameList = new ArrayList<>();
        for (Employee emp : employeeList) {
            empNameList.add(funcEmpToEmp.apply(emp));
        }
        return empNameList;
    }

    @AllArgsConstructor
    @Data
    private static class Employee {
        String name;
        int age;
    }
}
