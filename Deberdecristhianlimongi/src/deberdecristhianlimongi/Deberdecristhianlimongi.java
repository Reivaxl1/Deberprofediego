/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberdecristhianlimongi;

import java.util.Scanner;

/**
 *
 * @author Cristhian
 */
public class Deberdecristhianlimongi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
         int numero=0,numero1=0,numero2=0,mayor=0;
        //ingresar los 3 numeros 
        numero=Ingreso(1);
        numero1=Ingreso(2);
        numero2=Ingreso(3);
     
          //hallar el mayor
        mayor=hayar(numero,numero1,numero2);
    }
     public static int Ingreso (int valor1 ){
        Scanner ingresar = new Scanner(System.in);
        System.out.printf(" ingrese los valores de los numeros %d\n",valor1);
        valor1=ingresar.nextInt();
        return (valor1);
    }
     public static int hayar (int valor1,int valor2,int valor3){
        int mayorito=0;
        mayorito=valor1;
        
        if (valor2>mayorito){
            mayorito=valor2;
             
        }
        if (valor3>mayorito){
            mayorito=valor3;
             return (valor3);
        }
        if (valor2==mayorito){
            return(valor2);
        }
        return (valor1);
    }
}
