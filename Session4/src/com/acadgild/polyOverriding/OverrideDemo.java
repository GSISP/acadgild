package com.acadgild.polyOverriding;
public class OverrideDemo
{
    public static void main(String[] args) {
        Animal a1 = new Cat();
        a1.makeNoise(); //Prints Meowoo
         
        a1 = new Dog();
        a1.makeNoise(); //Prints Bark
    }
}