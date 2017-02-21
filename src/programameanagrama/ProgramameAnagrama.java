/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programameanagrama;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author profe
 */
public class ProgramameAnagrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent=new Scanner(System.in);
        
        long casos=Long.valueOf(ent.nextLine());
        while(casos-->0){
            char[] arriba=ent.nextLine().replace(" ", "").toLowerCase().toCharArray();
            char[] abajo=ent.nextLine().replace(" ", "").toLowerCase().toCharArray();
            Arrays.sort(arriba);
            Arrays.sort(abajo);
            if(Arrays.equals(arriba,abajo)) System.out.println("SI");
            else System.out.println("NO");
        
        }
    }
    
}
