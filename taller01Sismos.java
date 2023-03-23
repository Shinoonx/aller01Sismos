public class Taller01Sismos {
   public static void main (String[]arg) {
      double[][] matriz = new double[7][15];
      mat(matriz);
      imprimir(matriz);
      imprMax(matriz);
   }
   public static void mat(double matriz[][]){
      for(int i=0;i < matriz.length;i++){
       for (int j=0;j < matriz.length;j++){
          matriz[i][j] = Math.random()*9.9;
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

   public static double max(double matriiz [][]){
           double max= 0.0;
      for (int i = 0; i < matriiz.length ; i++) {
         for (int j = 0; j < matriiz[i].length; j++) {
            if (max<matriiz[i][j]){
               max=matriiz[i][j];
            }
         }
      }
      return max;
   }
   public static void imprMax(double matriiz[][]){
   double max = max(matriiz);
      System.out.println("EL mayor sismo fue de; "+ max);
   }

   public static int cinco(double matriz){
       int num=0;
      for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz[0].length; j++) {
            if (cinco)

         }

      }
   }


}
