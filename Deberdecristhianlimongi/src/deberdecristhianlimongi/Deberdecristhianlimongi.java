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
         while (bandera ==0) {
        System.out.println("ingrese su nombre de usuario");
        usuario=mientrada.nextLine();
        System.out.println("ingese su nombre de usuario");
        clave=mientrada.nextLine();
        if (usuario.equals(miusuario)&&(clave.equals(micontrasena))){
            bandera=1;}
        else {
            contador=contador+1;
            System.out.printf("usuario o contraseña incorrecta van %d/3 de intentos \n ",contador);}
         if (contador==3){
                bandera=1;}
         
         if (usuario.equals(miusuario)&&(clave.equals(micontrasena))){
            System.out.println("bienvenido al sistema");
           do {
               
               System.out.println("***calculador basica**");
               System.out.println("1_sumar              *");
               System.out.println("2_restar             *");
               System.out.println("3_multiplicar        *");
               System.out.println("4_dividir            *");
               System.out.println("***escoja la que le guste***");
               System.out.println("****************************");
               opcion=mientrada.nextInt();
               if (opcion==1){
                   System.out.println("ingrese el 1 valor");
                  valor_1=mientrada.nextInt();
                  System.out.println("ingrese el 2 valor");
                  valor_2=mientrada.nextInt();
                  System.out.println(" resutlado");
                  suma=valor_1+valor_2;
                  System.out.printf(" el resultado de la suma de las 2 variable es ",suma);
               }
               if (opcion==2){
                    System.out.println("ingrese el 1 valor");
                  valor_1=mientrada.nextInt();
                  System.out.println("ingrese el 2 valor");
                  valor_2=mientrada.nextInt();
                  System.out.println(" resutlado");
                  resta=valor_1-valor_2;
                  System.out.printf(" el resultado de la resta de las 2 variable es ",resta);}
               if (opcion==3){
                    System.out.println("ingrese el 1 valor");
                  valor_1=mientrada.nextInt();
                  System.out.println("ingrese el 2 valor");
                  valor_2=mientrada.nextInt();
                  System.out.println(" resutlado");
                  multiplicacion=valor_1*valor_2;
                  System.out.printf(" el resultado de la multiplicacion de las 2 variable es ",multiplicacion);}
               if(opcion==4){
                   System.out.println("ingrese el 1 valor");
                  valor_1=mientrada.nextInt();
                  System.out.println("ingrese el 2 valor");
                  valor_2=mientrada.nextInt();
                  System.out.println(" resutlado");
                  division=valor_1/valor_2;
                  System.out.printf(" el resultado de la division de las 2 variable es ",division);}
                  
                  } while (bandera==0);}
                else {
              System.out.println("se cerro el sistema son 5 dolares para 1 intento mas ");}
           }
               
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
