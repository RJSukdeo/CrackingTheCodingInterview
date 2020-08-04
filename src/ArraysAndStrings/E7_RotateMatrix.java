package ArraysAndStrings;

public class E7_RotateMatrix {

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
    }

    public static void main(String[] args) {
        int[][] inputs = new int[2][2];
        inputs[0] = new int[]{1, 2};
        inputs[1] = new int[]{3, 4};
        rotate(inputs);
        printOutputs(inputs);
        inputs = new int[3][3];
        inputs[0] = new int[]{1, 2, 3};
        inputs[1] = new int[]{4, 5, 6};
        inputs[2] = new int[]{7, 8, 9};
        rotate(inputs);
        printOutputs(inputs);
    }

    private static void printOutputs(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

}
