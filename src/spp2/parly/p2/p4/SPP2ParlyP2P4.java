/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.parly.p2.p4;

/** 
 *Parly
 *CECILIA GUTIÉRREZ DE LARA HERNÁNDEZ
 *NORMA LEDEZMA MARTÍNEZ
 *ERICK EDUARDO GERVACCI ROMERO
 *DIEGO SANTANA LEIVA
 *BENITO RAFAEL MORANTE VÁZQUEZ
 */
public class SPP2ParlyP2P4 {
     public static void main(String[] args) {
    //Arranque
    int [][] Matriz ={{1,2,3,4},
                      {8,7,6,5},
                      {9,10,11,12},
                      {16,15,14,13}};
    
    //Ejecución
    Ciclos(Matriz);
    
}
public static void Ciclos(int[][] Matriz){
    //Declaración de variables
    int max = Matriz[0][0];
    int min = Matriz[0][0];
    int suma = 0;
    int diag = 0;
    int debajo = 0;
    int encima = 0;
    
    for (int i=0; i<Matriz.length;i++) {
            for (int j = 0; j<Matriz[i].length; j++) {
                //Promedio de todos los valores
                suma = suma + Matriz[i][j];
                //Mínimo de todos los valores
                if(Matriz[i][j]<min){
                    min=Matriz[i][j];
                }
                //Máximo de todos los valores
                if (Matriz[i][j]>max){
                    max=Matriz[i][j];
                }
            }
        }
        for (int i=0; i<Matriz.length;i++){
            //Suma de la diagonal descendente
            diag = diag + Matriz[i][i];
        }
        for (int j=0; j<Matriz.length;j++){
            for (int i=0; i<j; i++){
            //Suma por encima de la diagonal descendente
            encima = encima + Matriz [i][j];
            }
        }
        for (int i=0; i<Matriz.length;i++){
            for (int j=0; j<i; j++){
            //Suma por debajo de la diagonal descendente
            debajo = debajo + Matriz [i][j];
            }
        }
    //Promedio de todos los valores
    int promedio = suma / 16;
    System.out.println("El promedio es igual a: "+promedio);
    //Mínimo de todos los valores
    System.out.println("El número mínmo es: "+min);
    //Máximo de todos los valores
    System.out.println("El número máximo es: "+max);
    //Suma de la diagonal descendente
    System.out.println("La suma de la diagonal descendente es: "+diag);
    //Suma por encima de la diagonal descendente
    System.out.println("La suma por encima de la diagonal es: "+encima);
    //Suma por debajo de la diagonal descendente
    System.out.println("La suma por debajo de la diagonal es: "+debajo);
}
}   

