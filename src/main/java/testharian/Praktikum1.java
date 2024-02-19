package testharian;
/*
IntelliJ IDEA 2023.3.3 (Ultimate Edition)
Build #IU-233.14015.106, built on January 25, 2024
@Author Cornelius
Java Developer
Created on 2/15/2024 15:10 PM
@Last Modified 2/15/2024 15:10 PM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan sebuah kata
        System.out.print("Masukkan Kata: ");
        String input = scanner.nextLine();

        // Menutup scanner setelah selesai digunakan
        scanner.close();

        // Menghitung hasil berdasarkan input yang diberikan
        int hasil = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int val = ch;
            if (val <= 96) {

                hasil += val;
            }
        }

        // Menampilkan hasil
        System.out.println("Hasil: " + hasil);
    }
}
    

