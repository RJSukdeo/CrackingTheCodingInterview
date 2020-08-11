package SortingAndSearching;

public class E1_SortedMerge {

    public static void sortMerge(int[] A, int sizeA, int[] B, int sizeB) {
        int counterA = 0;
        int counterB = 0;
        while (counterA < sizeA && counterB < B.length) {
            if (B[counterB] < A[counterA]) {
                insertElement(A, sizeA, B[counterB], counterA);
                counterA++;
                counterB++;
                sizeA++;
                continue;
            }
            counterA++;
        }
        for (int i = counterB; i < sizeB; i++) {
            A[counterA] = B[counterB];
            counterA++;
            counterB++;
        }
    }

    private static void insertElement(int[] array, int size, int element, int index) {
        int tempLower = array[index];
        int tempUpper = 0;
        for (int i = index; i < size; i++) {
            tempUpper = array[i + 1];
            array[i + 1] = tempLower;
            tempLower = tempUpper;
        }
        array[index] = element;
    }

    public static void main(String[] args) {
        int[] sortedA = new int[12];
        sortedA[0] = -9;
        sortedA[1] = 0;
        sortedA[2] = 10;
        sortedA[3] = 12;
        sortedA[4] = 30;
        sortedA[5] = 56;
        sortedA[6] = 100;
        int[] sortedB = new int[5];
        sortedB[0] = 7;
        sortedB[1] = 9;
        sortedB[2] = 17;
        sortedB[3] = 97;
        sortedB[4] = 81113;
        sortMerge(sortedA, 7, sortedB, 5);
        for (int element : sortedA) {
            System.out.println(element);
        }
    }

}
