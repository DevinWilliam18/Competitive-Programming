/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.DataStructures;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        int[] angka;
        Scanner masuk = new Scanner(System.in);
        int panjang = masuk.nextInt();
        angka = new int[panjang];
        for (int i = 0; i < panjang; i++) {
            angka[i]  = masuk.nextInt();
        }
        masuk.close();
        for (int i = 0; i < panjang; i++) {
            System.out.println(angka[i]);
        }
        
    }
}
