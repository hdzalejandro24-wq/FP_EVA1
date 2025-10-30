/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_califas;
import java.util.Scanner;

/**
 *
 * @author carpi
 */
public class EVA1_20_CALIFAS {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        int califa;
       
    System.out.println("Introduzca su calificacion 1 al 100");
    califa = input.nextInt();
    System.out.println();{
    if ((califa <=100) && (califa >=90)){
    System.out.println("su calificacion es de A");
    }else if ((califa >=80) && (califa <=89)){
    System.out.println("su calificacion es de B");
    }else if ((califa >=70) && (califa <=79)){
    System.out.println("su calificacion es de C");    
    }else if ((califa >=60) && (califa <=69)){
    System.out.println("su calificacion es de D");      
    }else if ((califa >=0) && (califa <=59)){
    System.out.println("su calificacion es de F");
    }
    }
    }
}