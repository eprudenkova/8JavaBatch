package com.syntax.class32;

public interface Beetle {

    int amount = 10;
    int a = 46;

    // Since Java 1.8 we can add STATIC and DEFAULT methods
    // in interface.

    public static void eatGrass(){

        System.out.println("Dogs shit");
    }
    public default void eatGrass2() {
        System.out.println();
    }

    public default void chew2(){

    }

    public int chew();
}

class A implements Beetle{

    @Override
    public int chew() {
        return 0;
    }

    @Override
    public void eatGrass2() {

    }
}

class B implements Beetle{

    @Override
    public int chew() {
        return 0;
    }
}

class C extends B{

}
