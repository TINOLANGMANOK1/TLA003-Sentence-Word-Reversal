/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.allawan_tla003;

/**
 *
 * @author Students Account
 */
import java.util.*;

public class Allawan_TLA003 {

   public static void main(String[] args) {
       
        Stack<String> stack = new Stack<>();
        Scanner jm = new Scanner(System.in);
       
        System.out.print("How many words? ");
        int num = jm.nextInt();

        System.out.println("Enter each words:");
        for (int i = 0; i < num; i++) {
            String word = jm.next();
            stack.push(word);
        }

        System.out.print("Output: ");
        for (int i = 0; i < num; i++) {
            System.out.print(stack.pop());
            if (i < num - 1) {
                System.out.print(" ");
            }
        }
    }
}