/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_12_if;

import java.util.Scanner;
/**
 *
 * @author carpi
 */
public class ACT_12_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    int califa;
    Scanner captu = new Scanner(System.in);
            
    System.out.println("introduce la calificacion:");
    califa = captu.nextInt();
    if (califa >=70){
        System.out.println("acreditado");
    } else {
        System.out.println("no acreditado");
    }
    
  }
    
}
