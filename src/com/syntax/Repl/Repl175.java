package com.syntax.Repl;

public class Repl175 {
    public static void main(String[] args){
        Tea lemonTea = new LemonTea("Lemon Tea");
        Tea chaiTea = new ChaiTea("Chai Tea");

        lemonTea.addSugar();
        chaiTea.addSugar();
    }
}
abstract class Tea{

    String teaType;

    Tea(String teaType){
        this.teaType=teaType;
    }

    abstract void addSugar();
}
class LemonTea extends Tea{
    LemonTea(String teaType) {
        super(teaType);
    }

    void addSugar(){
        System.out.println("For "+teaType+" we need 2 spoons of sugar");
    }
}
class ChaiTea extends Tea{
    ChaiTea(String teaType) {
        super(teaType);
    }

    void addSugar(){
        System.out.println("For "+teaType+" we need 1 spoon of sugar");
    }
}