public class DoWhileTable {   
   public static void main(String[] args) {       
      int no = Integer.parseInt(args[0]);  
  
     // count from i = 1 to 10  
      int i = 1;  
      do {  
         System.out.println(i*no);   
          i++;  
      }  while (i < 10);
   }  
} 
