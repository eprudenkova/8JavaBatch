package com.syntax.class32;

public abstract class Flower {

    String type;
    String color;

    Flower(String type, String color){
        this.type = type;
        this.color = color;
    }

    public abstract void bloom();

}

class Rose extends Flower{

    Rose(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(type+ " blooms in the March");
    }
}

class Tulip extends Flower{

    Tulip(String type,String color){
        super(type, color);
    }
    public void bloom(){
        System.out.println(type+" blooms in the April");
    }
}

class Sunflower extends Flower{


    Sunflower(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(type+" blooms in the August");
    }
}
