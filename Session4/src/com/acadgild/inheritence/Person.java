package com.acadgild.inheritence;
class Person
{
     String firstName;
     String lastName;
 
     Person(String fName, String lName)
     {
              firstName = fName;
              lastName = lName;
     }

      void Display()
      {
            System.out.println("First Name : " + firstName);
            System.out.println("Last Name : " + lastName);
       }
} 
