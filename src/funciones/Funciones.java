/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;
/**
 *
 * @author gipao
 */
public class Funciones {
    
public static void main(String[] args) {
    java.util.Scanner teclado =
            new java.util.Scanner(System.in);
    
    System.out.println("Ingrese el primer numero");
    int a=teclado.nextInt();
    
    System.out.println("segundo");
    int b=teclado.nextInt();
    
    System.out.println("tercero");
    int c=teclado.nextInt();
    
    int o[]={a,b,c};
    int m=Ordenar(o);
    System.out.println("El numero mayor de los tres es: " + m);
    }

    public static int Ordenar(int[]vector){
    int mayor;
    int i=0;

    if(vector[i]>vector[i+1] && vector[i]>vector[i+2]){
       mayor=vector[i];
    }else{
       if(vector[i+1]>vector[i+2]){
         mayor=vector[i+1];  
       }else{
         mayor=vector[i+2];
       }
    }
     
    return mayor;
}
}