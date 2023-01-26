package dev.craftlr.exercice3;

import dev.craftlr.exercice3.EmployeeReport;

public class EmployeeReportTest {
    private static final EmployeeReport employees = buildEmployees();

    private static EmployeeReport buildEmployees() {
        return new EmployeeReport(new Employee("Max", 17), new Employee("Sepp", 18), new Employee("Nina", 15), new Employee("mike", 51));
    }


}
