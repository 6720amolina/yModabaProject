
package com.mycompany.ymodaba;
import java.util.Scanner;

public class Ymodaba {

    public static void main(String[] args) { 
        
        int n = 0;
        boolean inputValido = false;
        String text = "ymodaba";
        
        System.out.println("Introduce el numero de ymodabas que desees visualizar");
        do{
            try{
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
                inputValido = true;
            }catch(Exception e){
                System.out.println("Introduce un valor válido");
            }
        }while(!inputValido);
        if(n<10){
        for(int i = 0; i < n; i++){
            System.out.println(text);
            text = text + "a";
        }}else{

            System.out.println("Te has pasado de ymodabas chatito");

        }
    }
}
