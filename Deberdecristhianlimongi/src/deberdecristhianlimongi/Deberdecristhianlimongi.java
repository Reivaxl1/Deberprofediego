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
        Scanner mientrada=new Scanner(System.in);
        String miusuario="cristhian",micontrasena="12345";
        String usuario="",clave="";
        String sigue="",resp="S";
         
        int opcion=0,valor_1=0,valor_2=0;
        int contador=0,bandera=0,suma=0,resta=0,division=0,multiplicacion=0;
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
      public static void mostrar (int mayore ,int number1,int number2,int number3){
        System.out.printf(" la mayor de las variables es %d de las  variables %d %d %d \n",mayore,number1,number2,number3);
    }
}
