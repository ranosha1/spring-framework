package dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

public static Stream<Employee> readAll() {
            return Stream.of(
            new Employee(100, "Tom", "r@gmail.com", Arrays.asList("11111111", "11111111")),
            new Employee(101, "Bob", "b@gmail.com", Arrays.asList("22222222", "22222222")),
            new Employee(102, "Ozzy", "o@gmail.com", Arrays.asList("33333333", "33333333")),
            new Employee(103, "Kim", "k@gmail.com", Arrays.asList("44444444", "44444444")),
            new Employee(104, "Jon", "j@gmail.com", Arrays.asList("55555555", "55555555"))
            );

}


     }
