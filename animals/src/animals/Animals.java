/*
ALYA SHALSABILLA
123180091
PLUG F
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import daftar.*;
import java.util.Scanner;

/**
 *
 * @author City
 */
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("MENU");
        System.out.println("1. Info");
        System.out.println("2. Daftar");
        
        Scanner menu = new Scanner(System.in);
        System.out.println("Pilih : ");
        int menuu = menu.nextInt();
        
        switch (menuu)
        {
            case 1 :
            {
                Info inf = new Info();
                inf.informasi();
            }
            break;
            case 2 :
            {
                Daftar customer = new Daftar();
                customer.pendaftaran();
            }
            default :
                System.out.println("Pilihan yang Anda masukkan SALAH");
        }
    }
}
