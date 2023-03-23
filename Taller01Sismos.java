import java.util.Scanner;

public class Taller01Sismos {
   public static void main (String[]arg){
      double[][] matriz = new double[7][15];
      imprimir(matriz);

      //double matriz[][];
   }
   //double[][] matriz = new double[7][15];


   public static void imp(double matriz[][]){
      for(int i=0;i< matriz.length;i++){
       for (int j=0;j< matriz.length;j++){
          matriz[i][j]=(int)(Math.random()*9.9);
       }
    }
   }

   public static void imprimir(double matriz[][]){
      for (int i=0;i< matriz.length;i++){
         System.out.println();
         for (int j=0;j< matriz.length;j++){
            System.out.println("["+matriz[i][j]+"]");
         }
      }
      System.out.println("\n");
   }
}
