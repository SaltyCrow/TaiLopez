/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tai.lopez;

import java.util.Scanner;

/**
 *
 * @author vymat7603
 */
public class TaiLopez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("How many fuel units would you like?");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        System.out.println(i + " fuel units will get you" + i/5 + "lambourghinis");
        
    }
    
}
