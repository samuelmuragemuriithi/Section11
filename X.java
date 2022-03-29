package com.awesam;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Enter number to times: ");
         this.x=x.nextInt();
    }
    public void x(){
        for (int x = 0; x < 12; x++) {
            System.out.println(x+" * "+ this.x +" = "+x*this.x);
        }
    }

    public static void main(String[] args) {
        X X=new X(new  Scanner(System.in));
        X.x();
    }
}
