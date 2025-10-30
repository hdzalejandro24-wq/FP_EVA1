/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_13_if;
import java.util.Scanner;
/**
 *
 * @author carpi
 */
public class ACT_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad, nacimiento;
    Scanner captu = new Scanner(System.in);
            
    System.out.println("pon tu edad");
    System.out.println("pon tu nacimiento");
        int alcoholicas = captu.nextInt();
    if (alcoholicas >=18){
        System.out.println("si puedes comprar alcohol");
       } else{
            System.out.println("no puedes comprar alcohol");
            }
    
   }
}
