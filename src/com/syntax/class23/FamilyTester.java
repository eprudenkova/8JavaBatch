package com.syntax.class23;

public class FamilyTester {
    public static void main(String[] args) {
        Parent parent = new Child();

        Parent[] familyArray = new Parent[3];
        familyArray[0] = new Child();
        familyArray[1] = new Brother();
        familyArray[2] = new Sister();
        for(Parent par:familyArray){
            par.eat();
            par.sleep();
//            par.run();//parent have only 2 methods
        }

        parent = new Child();
        parent.sleep();
        parent.eat();

        parent = new Brother();
        parent.sleep();
        parent.eat();
//        parent.run();

        parent = new Sister();
        parent.sleep();
        parent.eat();
//        double var = 10;

    }
}
