/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_descuento;
import java.util.Scanner;
/**
 *
 * @author carpi
 */
public class EVA1_14_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    double montoVenta, montoPagar;
    Scanner captu = new Scanner(System.in);        
    System.out.println("monto de compra");
    montoVenta = captu.nextDouble();
    if(montoVenta >1000){
        montoPagar = montoVenta *0.85;
        // montopaga    
     System.out.print("Debes pagar: ");
     System.out.println(montoPagar);
    //       
            }
    }
   }
    

