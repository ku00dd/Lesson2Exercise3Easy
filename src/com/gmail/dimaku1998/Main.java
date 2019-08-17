package com.gmail.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter year = ");
        int year = sc.nextInt();
        if(year % 4 == 0){
           if (year % 100 == 0){
               if (year % 400 == 0){
                   System.out.println(" yes");
               }else
                   System.out.println(" no");
           }else
               System.out.println(" yes ");
        } else
            System.out.println(" no ");
    }
}
