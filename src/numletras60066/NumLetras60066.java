/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numletras60066;

import java.util.Scanner;

/**
 *
 * @author Rafael Moreno
 */
public class NumLetras60066 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //Pedir un número de 0 a 99 y mostrarlo en letras. 
       Scanner entrada = new Scanner (System.in);
       int numero = 0;
       
       System.out.println("Ingrese un número del 0 al 99");
       numero = entrada.nextInt();
                
       //aqui veremos si es una unidad o decena el numero a convertir
       int unidad = (numero % 10);
       int decena = ((numero/10) % 10); 
       String Uni_2 = "";
       String Dec_2 = "";
       
       if (numero < 10 && numero >= 0){
           switch (numero) {
            case 0:
                Uni_2 = "cero";
                break;
            case 1:
                Uni_2 = "uno";
                break;
            case 2:
                Uni_2 = "dos";
                break;
            case 3:
                Uni_2 = "tres";
                break;
            case 4:
                Uni_2 = "cuatro";
                break;
            case 5:
                Uni_2 = "cinco";
                break;
            case 6:
                Uni_2 = "seis";
                break;
            case 7:
                Uni_2 = "siete";
                break;
            case 8:
                Uni_2 = "ocho";
                break;
            case 9:
                Uni_2 = "nueve";
                break;
            default:
                throw new AssertionError();
        }
       }
       else {
           switch (unidad) {
            case 0:
                Uni_2 = "cero";
                break;
            case 1:
                Uni_2 = "uno";
                break;
            case 2:
                Uni_2 = "dos";
                break;
            case 3:
                Uni_2 = "tres";
                break;
            case 4:
                Uni_2 = "cuatro";
                break;
            case 5:
                Uni_2 = "cinco";
                break;
            case 6:
                Uni_2 = "seis";
                break;
            case 7:
                Uni_2 = "siete";
                break;
            case 8:
                Uni_2 = "ocho";
                break;
            case 9:
                Uni_2 = "nueve";
                break;
            default:
                throw new AssertionError();
        }
        switch (decena) {
            case 1:
               Dec_2 = "diez";
                switch (unidad) {
                    case 0:
                        Dec_2 = "diez";
                        Uni_2 = "";
                        break;
                    case 1:
                        Dec_2 = "once";
                        Uni_2 = "";
                        break;
                    case 2:
                    Dec_2 = "doce";
                    Uni_2 = "";
                    break;
                    case 3:
                    Dec_2 = "trece";
                    Uni_2 = "";
                    break;
                    case 4:
                    Dec_2 = "catorce";
                    Uni_2 = "";
                    break;
                    case 5:
                    Dec_2 = "quince";
                    Uni_2 = "";
                    break;
                    default: 
                        Dec_2 = "dieci";
                }
                break;
            case 2:
                Dec_2 = "veinte";
                switch (unidad) {
                    case 0:
                        Dec_2 = "veinte";
                        Uni_2 = "";
                        break;
                    default:
                        Dec_2 = "veinti";
                }
                break;
            case 3:
                Dec_2 = "treinta";
                switch (unidad) {
                    case 0:
                        Dec_2 = "treinta";
                        Uni_2 = "";
                        break;
                    default:
                        Dec_2 = "treinta y ";
                }
                break;
            case 4:
                Dec_2 = "cuarenta";
                switch (unidad) {
                    case 0:
                        Dec_2 = "cuarenta";
                        Uni_2 = "";    
                        break;
                    default:
                        Dec_2 = "cuarenta y ";
                }
                break;
            case 5: 
                Dec_2 = "cincuenta";
                switch (unidad) {
                    case 0:
                        Dec_2 = "cincuenta";
                        Uni_2 = "";
                        break;
                    default:
                        Dec_2 = "cincuenta y ";
                }
                break;
            case 6:
                Dec_2 = "sesenta";
                switch (unidad) {
                    case 0:
                        Dec_2 = "sesenta";
                        Uni_2 = "";
                        break;
                    default:
                        Dec_2 = "sesenta y ";
                }
                break;
            case 7:
                Dec_2 = "setenta";
                switch (unidad) {
                    case 0:
                        Dec_2 = "setenta";
                        Uni_2 = "0";
                        break;
                    default:
                        Dec_2 = "setenta y ";
                }
                break;
            case 8:
                Dec_2 = "ochenta";
                switch (unidad) {
                    case 0:
                        Dec_2 = "ochenta";
                        Uni_2 = "";
                        break;
                    default:
                        Dec_2 = "ochenta y ";
                }
                break;
            case 9:
                Dec_2 = "noventa";
                switch (unidad) {
                    case 0:
                        Dec_2 = "noventa";
                        Uni_2 = "";
                        break;
                    default:
                        Dec_2 = "noventa y ";
                }
                break;
            default:
                throw new AssertionError();
        }
       }
        System.out.println(Dec_2 + "" +Uni_2  );
    }
    
}
