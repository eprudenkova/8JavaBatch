package com.syntax.class14;

public class LaptopObject {
    public static void main(String[] args) {
        LaptopClass laptop1 = new LaptopClass();
        laptop1.make = "Mac";
        laptop1.model = "pro 16";
        laptop1.storage = 1;//tb
        laptop1.RAMCapacity =16;
        laptop1.color = "pink";
        laptop1.processor = "Core i7";
        laptop1.GPU = "Nvidia RTX 3090 with 12GB of GDDR6X";
        laptop1.playMovies();
        laptop1.browseInternet();
        laptop1.makeVideoCall("Mama");//method expects something from the user
        String model = laptop1.getModel();//alt+enter
        System.out.println(model);//pro 16
        System.out.println(laptop1.getModel());//pro 16
        System.out.println(laptop1.model);//pro 16
        System.out.println(model);//pro 16
        System.out.println(laptop1.getRAMCapacity());//16*2=32
        System.out.println(laptop1.upgradeRAM(2));//16*2=32

    }
}
