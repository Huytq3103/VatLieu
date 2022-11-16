/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.Random;

/**
 *
 * @author Huy PC
 */
public class SendEmail {
    
    public static void main(String[] args) {
        Random random = new  Random();
        String pass = String.valueOf(random.nextInt(10000000, 99999999));
        System.out.println(pass);
    }
}
