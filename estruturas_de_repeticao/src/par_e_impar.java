import java.util.Scanner;

public class par_e_impar {
    /*
     * Par e Ímpar: Faça um programa que peça N números inteiros. 
     * Calcule e mostre a quantidade de números pares 
     * e a quantidade de números impares.
     */
    
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //O teclado nunca foi fechado

        int quantNumeros;
        int numero;
        int contador = 0;
        int pares = 0;
        int impares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {

            System.out.println("Digite um número inteiro: ");
            numero = scan.nextInt();

            if ((numero % 2) == 0) pares++;
            else impares++;

            contador++;
        } while (contador < quantNumeros);

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
     }
}
