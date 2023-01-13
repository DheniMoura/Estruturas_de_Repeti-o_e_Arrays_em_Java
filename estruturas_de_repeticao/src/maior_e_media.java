import java.util.Scanner;

public class maior_e_media {
    /*
    Maior e Média: Faça um programa que leia 5 números
    e informe o maior número 
    e a média desses números.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;
        int somaNumero = 0;
        int maior = 0;
        float media;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero > maior) maior = numero;

            somaNumero += numero;
            contador += 1;
        } while(contador < 5);

        media = somaNumero / 5;

        System.out.println("Maior número: " + maior);
        System.out.println("Média dos números digitados: " + media);
    }
    
}
