package com.syntax.classReview5;

public class StringClass {
    public static void main(String[] args) {
        String str1 = "Danilo";
        String str2 = new String("anything 123!@#");
        System.out.println(str2);//anything 123!@#
//      returns the number of characters in the String variable including spaces
        System.out.println(str1.length());//6
        System.out.println(str2.length());//15

        String name = "Mina 123!@#";
        System.out.println(name.toLowerCase());//mina 123!@#
        System.out.println(name.toUpperCase());//MINA 123!@#

        String newString = str1.concat(name);
        System.out.println(newString);//DaniloMina 123!@#
        System.out.println(str1 + name);//DaniloMina 123!@#
//      always prefer the + to combine 2 Strings
//      why? because we can get an error in some cases when using the concat method ...

        String var1 = null;//var1 - reference variable, String - type of the reference variable
//      when this line (22) will be executed, a box will be created, the type of the box will be String,
//      name of this box will be var, and we are storing nothing inside this box, this box will be empty.

        String var3 = new String();//new - keyword, String() - constructor
//      in line (25) we are saying pleas java create a box and I will be string the object of type String
//      in here and please call it var3, then create an object of the String class.
//      what happens when we create an object of the class?
//      Inside our RAM all of the fields whether they are static or instance,
//      all of the methods, all of the code from that String class will be loaded in our hard disc.
//      And then create "address" for achieve.
//      Reference variable and keyword new with constructor String() will be replaced in the memory
//      with the content with all of these addresses.

//      Everytime we write new keyword and name of the constructor all of the fields whether
//      they are instance or static or method - everything from that class will be loaded in
//      smaller chanks and as they hold the object it will be stored in HEAP area.
//      All our local variables we are holding in special area - STACK.
//      All of the objects first they will be loaded inside the memory
//      depending upon the size of the object
//

        String var2 = "Anna";
//      System.out.println(var1.concat(var2));//error NullPointerExeption
//      System.out.println(var2.concat(var1));//error NullPointerExeption
        System.out.println(var1 + var2);//nullAnna
        System.out.println(var2 + var1);//Annanull
    }
}
