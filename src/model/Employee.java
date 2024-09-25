package model;
/*
Необходимо создать класс Employee со следующими методами:
        •	getBaseSalary - получить базовую ставку
•	setBaseSalary
•	getName - получить имя
•	setName
•	getSalary - получить зарплату
        */

public class Employee {
    double baseSalary =100;
    String name;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
