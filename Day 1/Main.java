
// Data types = 

// Primitive         Non primitive 
// byte                String
// short               Array
// char                class
// boolean             Object
// int                 interface 
// long
// float
// double

// Priority for operations - 
// */% > +-

import java.util.Scanner;


//To take input from user
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a : ");
        int a = sc.nextInt();
        System.out.print("Value you entered is - " + a);
    }
}