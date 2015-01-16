public class IfElseIfLadderDemo1
{
     public static void main(String args[])
     {
         //Declaring a variable "test" and initializing it with a value 2
         int test=2;
 
         if(test==1)
         {
             //This block will be executed only if "test" is equal to 1
             System.out.println("Hello");
         }
         else if(test==2)
         {
             //This block will be executed only if "test" is equal to 2
             System.out.println("Hi");
 
         }
         else if(test==3)
         {
             //This block will be executed only if "test" is equal to 3
             System.out.println("Good");
         }
         else
         {
             System.out.println("No Match Found");
         }
     }
}
