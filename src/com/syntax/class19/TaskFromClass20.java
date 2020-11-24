package com.syntax.class19;

import com.syntax.class20.Task;

public class TaskFromClass20 {
    public static void main(String[] args) {
//        Task task1 = new Task("marta");//CE another package - private
//        System.out.println(task1.name);//CE because the fields are also private
//        System.out.println(task1.age);//CE because the fields are default
//        System.out.println(task1.salary);

        Task task2 = new Task(12);//default, BUT int --> double
//        Task task4 = new Task(12,'c');//char can not be public

//        System.out.println(task2.name);
//        System.out.println(task2.age);
//        System.out.println(task2.salary);

        Task task3 = new Task(120000.00);//public
//        System.out.println(task3.name);
//        System.out.println(task3.age);
//        System.out.println(task3.salary);
    }
}
