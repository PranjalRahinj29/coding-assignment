package com.supermoney.problem1;

public class Employee {
    private int id;
    private String name;
    private double basicSalary;

    private double HRA, DA, GS, incomeTax, netSalary;


    public Employee() {

    }

    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.calculate();
    }

    private void calculate() {
        this.HRA = (10.00 / 100.00) * this.basicSalary;
        this.DA = (73.00 / 100.00) * this.basicSalary;
        this.GS = this.basicSalary + this.DA + this.HRA;
        this.incomeTax = (30.00 / 100.00) * this.GS;
        this.netSalary = this.GS - this.incomeTax;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", basicSalary=").append(basicSalary);
        sb.append(", HRA=").append(HRA);
        sb.append(", DA=").append(DA);
        sb.append(", GS=").append(GS);
        sb.append(", incomeTax=").append(incomeTax);
        sb.append(", netSalary=").append(netSalary);
        sb.append('}');
        return sb.toString();
    }
}
