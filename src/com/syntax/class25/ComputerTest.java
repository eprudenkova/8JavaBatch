package com.syntax.class25;

public class ComputerTest {
    public static void main(String[] args) {

        Computer[] computerArray = new Computer[2];
        computerArray[0] = new Apple("Apple", "Grey", "GB", 1000.00, 18, 1.5, false);
        computerArray[1] = new Lenovo("Lenovo", "Black", "GB", 800.00, 16, 1.8, false);
        for (Computer c : computerArray) {
            c.getColor();
//            c.specialBehavior();
        }

        Lenovo lenovo = new Lenovo("Lenovo", "Black", "GB", 800.00, 16, 1.8, false);
        lenovo.specialBehavior();
    }
}
