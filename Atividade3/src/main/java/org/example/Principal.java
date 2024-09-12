package org.example;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número FizzBuzz da aplicação: ");
        int num = sc.nextInt();

        FizzBuzz fb = new FizzBuzz(num);

        fb.criarListaFizzBuzz();
        fb.apresentarListaFizzBuzz();
    }
}
