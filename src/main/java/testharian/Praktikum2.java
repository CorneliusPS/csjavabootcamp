package testharian;
/*
IntelliJ IDEA 2023.3.3 (Ultimate Edition)
Build #IU-233.14015.106, built on January 25, 2024
@Author Cornelius
Java Developer
Created on 2/20/2024 13:04 PM
@Last Modified 2/20/2024 13:04 PM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum2 {

    public static void main(String[] args) {
        float x = 0;
        int y = 0;
        boolean z = true;
        Scanner sc = new Scanner(System.in);
        try {
            while(z) {
                x += sc.nextInt();
                y += 1;
            }
        } catch(Exception e) {
            System.out.println("Rata - Rata = " + x/y);
        }
    }
}