package com.syntax.class20;

public class TaskTest {
    public static void main(String[] args) {
//        Task task1 = new Task();//CE as now Java will not create the default constructor
//        Task task1 = new Task("marta");//CE same package but different class - private
//        System.out.println(task1.name);//CE because the fields are also private
//        System.out.println(task1.age);
//        System.out.println(task1.salary);

        Task task2 = new Task(12);
        System.out.println(task2.name);
        System.out.println(task2.age);
        System.out.println(task2.salary);

        Task task3 = new Task(120000.00);
        System.out.println(task3.name);
        System.out.println(task3.age);
        System.out.println(task3.salary);
    }
}
