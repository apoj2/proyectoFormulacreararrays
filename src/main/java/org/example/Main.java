package org.example;

import clases.Escuderia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        String[] palabras = new String[5];

        Escuderia[] escuderias = new Escuderia[10];

        Scanner objetolector = new Scanner(System.in);



        for(int i = 0;i<numeros.length;i++){

            System.out.println(numeros[i]);
        }

        for(int i = 0 ; i < palabras.length;i++){
            System.out.println("Digite el nombre " + (i+1));
            palabras[i]= objetolector.next();
        }

        for(int i = 0;i<palabras.length;i++){
            System.out.println(palabras[i]);
        }


    }
}