package fib;

import java.util.Scanner;

public class Fib {



    public static void main(String[] args) {
        display();
     
    }
    public static int input(){
        Scanner sc= new Scanner (System.in);
        System.out.println("input a number:");
        return sc.nextInt();
    }
    public static int func(int n){
        if(n<=1){
            return n;
        }
        else{
            return func(n-1)+func(n-2);
            
        }
    }
    public static void display(){
        int in =input();
        for(int a=0;a<=in;a++){
            if(a!=in){
           
                System.out.print("f("+a+")"+"\t");
            }
            else{
           
                System.out.println("f("+a+")"+"\t");
            }
        }
        for (int a=0;a<=in;a++){
        for(int j=0;j<=a;j++){
            System.out.print(func(j)+"\t");
        }
        System.out.println("\n");
    }
       
    }
    
}
