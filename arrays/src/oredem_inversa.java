/*
* Ordem Inversa: Faça um Programa que leia um vetor de 6 números inteiros 
* e mostre-os na ordem inversa.
*/
public class oredem_inversa {
    
    public static void main(String[] args){
        
        int[] vetor = {-8, 16, -23, 14, 7, 3};
        int count = 0;
        int count2 = (vetor.length -1);
        
       System.out.print("\nVetor: ");
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count ++;
        }

        System.out.print("\nVetor: ");
        while(count2 >= 0){
            System.out.print(vetor[count2] + " ");
            count2 --;
        }

    }
}
