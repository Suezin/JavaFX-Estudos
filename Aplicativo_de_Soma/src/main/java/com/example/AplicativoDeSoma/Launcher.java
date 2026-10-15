package com.example.AplicativoDeSoma;

import javafx.application.Application;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a tela na qual voce deseja entrar : ");
        System.out.println("1. Calculadora de Soma");
        System.out.println("2. Hello");
        int resposta = sc.nextInt();
        if (resposta == 1){
        Application.launch(CalculadoraDeSoma.class, args);
        }else{
            Application.launch(HelloApplication.class, args);
        }
    }
}
