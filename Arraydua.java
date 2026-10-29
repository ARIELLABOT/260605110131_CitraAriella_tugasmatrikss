public class Arraydua {
   public static void main(String[] args){

 
   int[] [] A = {
      {1,2},
      {4,5}
};

     int[] [] B = {
      {6,7},
      {8,9}
};

     for (int i = 0; i < A.length; i++) {
        for (int j = 0; j < A[i].length; j++) {
           System.out.print(A[i][j] + B[i][j] + "\t");
           }
           System.out.println(); 
        }
      
     }
}