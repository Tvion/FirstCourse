package com.myfirm.first;

public class Employee {
    private static int nextId;
    private int id;
    private String name;
    private int salary;
// start id
    static {
        nextId = 0;
    }

    {
        this.id = nextId;
        nextId++;
    }

    public Employee(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

    public Employee(int salary) {
        this("Employee #" + nextId, salary);
    }


    public void getEmployee() {
        System.out.println("Id= " + this.id + " Name=" + this.name + " salary= " + this.salary);
    }
}
