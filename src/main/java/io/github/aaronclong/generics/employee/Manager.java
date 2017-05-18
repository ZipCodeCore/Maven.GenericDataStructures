package io.github.aaronclong.generics.employee;

public class Manager extends Employee {
  private double bonus;

  public Manager(String name, double theSalary) {
    super(name, theSalary);
    bonus = 0;
  }

  public void setBonus(double theBonus) {
    bonus = bonus;
  }

  public double getSalary() { // Overrides superclass method
    return super.getSalary() + bonus;
  }
}
