/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftar;

/**
 *
 * @author City
 */
public class Bayar {
    
    public void pembayaran(int jeniss,int caree,int lamaa){
        
        double hasil;
        if(jeniss==1)
        {
            if(caree==1)
            {
                hasil=lamaa*150000;
            }
            else
            {
                hasil=lamaa*100000;
            }
        }
        else if(jeniss==2)
        {
            if(caree==1)
            {
                hasil=lamaa*170000;
            }
            else
            {
                hasil=lamaa*110000;
            }
        }
        else
            if(caree==1)
            {
                hasil=lamaa*75000;
            }
            else
            {
                hasil=lamaa*50000;
            }
        System.out.println(hasil);
        
    }
    
}
