package com.mycompany.testedensenv;

import java.util.Scanner;

public class Pergunta2 {

    public static void main(String[] args) {

        int F = 0;     // atual
        int ant = 0;   // anterior
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        int n = ler.nextInt();
        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }

        }
        if (F == n) {

            System.out.println("O numero pertence a sequencia!");

        } else {
            System.out.println("O numero nao pertence a sequencia!");
        }
    }

}
