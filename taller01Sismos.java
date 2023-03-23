public class Taller01Sismos {
   public static void main (String[]arg){
      double[][] matriz = new double[7][15];
      imprimir(matriz);
      mat(matriz);
   }
   public static void mat(double matriz[][]){
      for(int i=0;i < matriz.length;i++){
       for (int j=0;j < matriz.length;j++){
          matriz[i][j]=(int)(Math.random()*9.9);
       }
    }
   }
   public static void imprimir(double matriz[][]){
      for (int i=0;i< matriz.length;i++){
         System.out.println();
         for (int j=0;j< matriz.length;j++){
            System.out.print("["+matriz[i][j]+"]");
         }
      }
      System.out.println("\n");
   }
}
