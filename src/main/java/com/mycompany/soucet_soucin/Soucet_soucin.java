/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soucet_soucin;

import java.util.Scanner;

/**
 *
 * @author janho
 */
public class Soucet_soucin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nZadej 1. číslo: ");
        int a = sc.nextInt();
        
        System.out.print("\nZadej 2. číslo: ");
        int b = sc.nextInt();

        System.out.printf("\nSoučet: %d\nSoučin: %d", a+b, a*b);

    }
}
;