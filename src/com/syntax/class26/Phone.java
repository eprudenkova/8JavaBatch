package com.syntax.class26;

public abstract class Phone {
    public void call(){ System.out.println("Phone can make calls"); }
    public void send(){ System.out.println("Phone can send text"); }
    public abstract void takePicture();
    public abstract void playMusic();
}
class Iphone extends Phone{

    Iphone(){
        System.out.println("Iphone constructor");
    }
    @Override
    public void takePicture() {
        System.out.println("can take good pictures in low light");
    }

    @Override
    public void playMusic() {
        System.out.println("can play music through Apple Music");

    }
}
class Samsung extends Phone{

    Samsung(){
        System.out.println("Samsung constructor");
    }
    @Override
    public void takePicture() {
        System.out.println("Can take pictures using telephoto");
    }

    @Override
    public void playMusic() {
        System.out.println("Can play music using Google music");
    }
    public void duo(){
        System.out.println("Can make video calls using Duo");
    }
}
