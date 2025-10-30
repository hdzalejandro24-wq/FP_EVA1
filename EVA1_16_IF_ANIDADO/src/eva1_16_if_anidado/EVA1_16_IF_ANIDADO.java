/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_if_anidado;
import java.util.Scanner;
/**
 *
 * @author carpi
 */
public class EVA1_16_IF_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
    Scanner captu = new Scanner(System.in);
    System.out.println("Introduzca un numero de la semana (1 al 7)");
    dia = captu.nextInt();
    if (dia == 1){
      System.out.println("domingo");
    }else if(dia == 2){
      System.out.println("lunes");
    }else if(dia == 3){
      System.out.println("martes");
    }else if(dia == 4){
      System.out.println("miercoles");
    }else if(dia == 5){
      System.out.println("jueves");
    }else if(dia == 6){
      System.out.println("viernes");
    }else if(dia == 79){
    }else{ 
      System.out.println("Numero no valido!!");  
    }
        
    }
}
