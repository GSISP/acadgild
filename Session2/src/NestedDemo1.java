public class NestedDemo1
{
    public static void main(String args[])
    {
        //Declaring a variable test1 and initializing it with a value 5
        int test1=3;
        //Declaring a variable test2 and initializing it with a value 3
        int test2=3;
 
        if(test1==5)
        {
            //This block will be executed only if "test1" is equal to 5
            if(test2==3)
            {
                /*This block will be executed only if
                 test1 is equal to 5    and test2 is equal to 3 */
                System.out.println("Hi, test1 is 5 and test2 is 3");
 
            }
            else
            {
                /*This block will be executed only if
                 test1 is equal to 5 and test2 is some value other than 3 */
                System.out.println("Hi, test1 is 5 and test2 is some value other than 3");
            }
        }
        else if(test1==4)
        {
            //This block will be executed only if test1 is 4
            System.out.println("Hi, test1 is 4");
 
        }
        else if(test1==3)
        {
            //This block will be executed only if "test1" is 3
 
            if(test2==3)
            {
                /*This block will be executed only if
                 test1 is equal to 3 and test2 is equal to 3 */
                System.out.println("Hi, test1 is 3 and test2 is 3");
 
            }
            else if(test2==2)
            {
                /*This block will be executed only if
                 test1 is equal to 3 and test2 is equal to 2 */
                System.out.println("Hi, test1 is 3 and test2 is 2");
            }
 
        }
        else
        {
            /*This block will be executed only if
             test1  is some value other than 5,4,3*/
            System.out.println("Hi, test1 is some value other than 5,4,3");
        }
    }
}
