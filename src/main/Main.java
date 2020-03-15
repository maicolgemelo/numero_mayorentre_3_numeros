package main;
import java.util.Scanner;

public class Main {


    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        int numero1 = s.nextInt();

        System.out.println("Ingresa un numero:");
        int numero2 = s.nextInt();

        System.out.println("Ingresa un numero:");
        int numero3 = s.nextInt();


        if(numero1 > numero2 && numero1 > numero3){

            System.out.println(numero1 + " es el numero mayor");

        }else if(numero2 > numero1 && numero2 > numero3){

            System.out.println(numero2 + " es el numero mayor");

        }if(numero3 > numero2 && numero3 > numero1){

            System.out.println(numero3 + " es el numero mayor");

        }


    }


}
