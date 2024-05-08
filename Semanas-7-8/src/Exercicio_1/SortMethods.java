package Exercicio_1;

public class SortMethods {
    public int[] insertionSort(int[] array) {
        System.out.println("\\\\\\\\\\\\\\\\ Insertion Sort");
        for(int num : array) {
            System.out.print(num + " ");
        }
        System.out.print("\n");

        for(int i = 1; i < array.length; i++) {
            int j = i;
            int b = array[i];
            while((j > 0) && (array[j - 1] > b)) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = b;
            for(int num : array) {
                System.out.print(num + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        return array;
    }


    public int[] bubbleSort(int[]array) {
        System.out.println("\\\\\\\\ Bubble Sort");
        for(int z : array) {
            System.out.print(z + " ");
        }
        System.out.print("\n");

        int i = array.length - 1;
        while(i > 0) {
            int lastFlipped = 0;
            for(int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                    lastFlipped = j;
                }
            }
            i = lastFlipped;
            for(int z : array) {
                System.out.print(z + " ");
            }
            System.out.print("\n");
        }

        System.out.println("\n");
        return array;
    }


    public int[] selectionSort(int[] array) {
        System.out.println("\\\\\\\\\\\\\\\\ Selection Sort");
        for(int s : array) {
            System.out.print(s + " ");
        }
        System.out.print("\n");

        int min;
        for(int i = 0; i < array.length - 1; i++) {
            min = i;
            for(int j = min + 1; j < array.length; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
                int t = array[i];
                array[i] = array[min];
                array[min] = t;
            }

            for(int s : array) {
                System.out.print(s + " ");
            }
            System.out.print("\n");
        }

        System.out.println("\n");
        return array;
    }
}
