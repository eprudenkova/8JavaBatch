package com.syntax.class26;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone = new Iphone();
        iphone.call();
        iphone.send();
        iphone.playMusic();
        iphone.takePicture();

        Phone samsung = new Samsung();
        samsung.call();
        samsung.send();
        samsung.playMusic();
        samsung.takePicture();

        Phone[] allPhones = {new Iphone(), new Samsung()};
        for (Phone phone : allPhones) {
            phone.call();
            phone.send();
            phone.playMusic();
            phone.takePicture();
        }
    }
}
