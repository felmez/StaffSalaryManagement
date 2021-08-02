package com.company;

public class Employee {
    String name;
    int salary, workingHours, hireYear, incomeTax, taxedSalary, bonus, payRise;

    public Employee(String name, int salary, int workingHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workingHours = workingHours;
        this.hireYear = hireYear;
    }

    public void tax() {
        if (this.salary < 1000) {
            this.incomeTax = 0;
        } else {
            this.incomeTax = (int) (this.salary * 0.03);
            this.taxedSalary = this.salary - this.incomeTax;
        }
    }

    public void bonus() {
        if (this.workingHours <= 40) {
            this.bonus = 0;
        } else {
            for (int i = 41; i <= this.workingHours; i++) {
                this.bonus += 30;
            }
            this.taxedSalary += this.bonus;
        }
    }

    public void raiseSalary() {
        if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            this.payRise = (int) (this.salary * 0.1);
        } else if (2021 - this.hireYear > 19) {
            this.payRise = (int) (this.salary * 0.15);
        } else {
            this.payRise = (int) (this.salary * 0.05);
        }
    }

    @Override
    public String toString() {
        this.tax();
        this.bonus();
        this.raiseSalary();
        return "Name: " + this.name +
                "\nSalary: " + this.salary +
                "\nWorking Hours: " + this.workingHours +
                "\nHire Year: " + this.hireYear +
                "\nIncome Tax Amount: " + this.incomeTax +
                "\nBonus Amount: " + this.bonus +
                "\nPay Rise Amount: " + this.payRise +
                "\nTaxed and Bonus Added Salary: " + this.taxedSalary +
                "\nTotal Salary: " + (this.taxedSalary + this.payRise);
    }
}
