//ex3
package com.company;

public class EmployeeTestEx3 {
    public static void main(String[] args) {
        EmployeeEx3 emp1 = new EmployeeEx3("John", "Murphy", 2000);
        EmployeeEx3 emp2 = new EmployeeEx3("Bill", "Pearson", 3500);

        System.out.printf("%n%s have yearly salary: %.2f", emp1.getFirstName(), emp1.getSalary() * 12);
        System.out.printf("%n%s have yearly salary: %.2f%n", emp2.getFirstName(), emp2.getSalary() * 12);

        System.out.printf("%n%s have yearly salary: %.2f", emp1.getFirstName(), emp1.raiseSalary(emp1.getSalary()) * 12);
        System.out.printf("%n%s have yearly salary: %.2f", emp2.getFirstName(), emp2.raiseSalary(emp2.getSalary()) * 12);
    }
}