import java.util.Scanner;

public class fatorial {
/*
 * Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
 */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int fatorial = 1;

        System.out.println("Digite um número para calcular o fatorial: ");
        numero = scan.nextInt();

        for(int i = numero; i > 0; i--){
            fatorial *= i;
        }

        System.out.println(numero + "! = " + fatorial);
    }
}
