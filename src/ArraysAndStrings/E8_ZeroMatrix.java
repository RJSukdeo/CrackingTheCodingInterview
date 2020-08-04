package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class E8_ZeroMatrix {

    public static void transformMatrix(int[][] matrix) {
        List<ZeroEntry> zeroEntries = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroEntries.add(new ZeroEntry(i, j));
                }
            }
        }
        for (ZeroEntry entry : zeroEntries) {
            makeRowsColumnsZero(matrix, entry.rowIndex, entry.columnIndex);
        }
    }

    private static void makeRowsColumnsZero(int[][] matrix, int rowIndex, int columnIndex) {
        for (int i = 0; i < matrix[rowIndex].length; i++) {
            matrix[rowIndex][i] = 0;
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][columnIndex] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] inputs = new int[3][3];
        inputs[0] = new int[]{1, 2, 3};
        inputs[1] = new int[]{4, 0, 6};
        inputs[2] = new int[]{7, 8, 9};
        transformMatrix(inputs);
        printResults(inputs);
        inputs = new int[3][3];
        inputs[0] = new int[]{0, 2, 3};
        inputs[1] = new int[]{4, 5, 6};
        inputs[2] = new int[]{7, 8, 0};
        transformMatrix(inputs);
        printResults(inputs);
    }

    private static void printResults(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static class ZeroEntry {
        private int rowIndex;
        private int columnIndex;

        private ZeroEntry(int rowIndex, int columnIndex) {
            this.rowIndex = rowIndex;
            this.columnIndex = columnIndex;
        }
    }

}

