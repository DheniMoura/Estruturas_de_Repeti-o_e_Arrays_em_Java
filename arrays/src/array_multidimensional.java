import java.util.Random;

/*
 * Array Multidimensional: Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
 * Após isso determine o menor número da matriz e a sua posição(linha, coluna).
 */
public class array_multidimensional {
    public static void main(String[] args) {
        Random randon = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = randon.nextInt(9);
            }
        }

        System.out.println("\nMatirz M: ");
        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
