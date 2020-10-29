package com.syntax.class13;

public class Repl070_NestedForLoop {
    public static void main(String[] args) {
        for (int i=1;i<6;i++){//rows
            for(int j=1;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }
}
