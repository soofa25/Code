/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiftcpher;

import java.util.Scanner;

/**
 *
 * @author abdulmunemal-sultan
 */
public class ShiftCpher_Algoritham {

    int shift_key = 5;

    Scanner scn = new Scanner(System.in);

    String Alphbyt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    int x = 0;
    int z = 0;

    public void Shift() {

        char convertalphbyt[] = Alphbyt.toCharArray();
        System.out.println("Enter Letter :");
        String massage = scn.nextLine().toUpperCase();
        char usermassage[] = massage.toCharArray();
        
        for (int i = 0; i < usermassage.length; i++) {
            for (int y = 0; y < convertalphbyt.length; y++) {
                if (usermassage[i] == convertalphbyt[y]) {
                    x = y + shift_key;

                    if (x > 25) {
                        x--;
                        x = x - 25;
                    }
                }

            }
            System.out.print(convertalphbyt[x]);
        }

    }
}
