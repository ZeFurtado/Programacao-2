package Exercicio_1;

public class SortMethods {
    public int[] insertionSort(int[] array) {
    	int[] arrayInsertion = new int[array.length];
    	int index = 0;
    	for(int i : array) {
    		arrayInsertion[index] = i;
    		index++;
    	}
    	
    	System.out.println();
        System.out.println("\\\\\\\\\\\\\\\\ Insertion Sort");
        for(int num : arrayInsertion) {
            System.out.print(num + " ");
        }
        System.out.print("\n");

        for(int i = 1; i < arrayInsertion.length; i++) {
            int j = i;
            int b = arrayInsertion[i];
            while((j > 0) && (arrayInsertion[j - 1] > b)) {
                arrayInsertion[j] = arrayInsertion[j - 1];
                j--;
            }
            arrayInsertion[j] = b;
            for(int num : arrayInsertion) {
                System.out.print(num + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        return arrayInsertion;
    }


    public int[] bubbleSort(int[]array) {
    	int[] arrayBubble = new int[array.length];
    	int index = 0;
    	for(int i : array) {
    		arrayBubble[index] = i;
    		index++;
    	}
    	
    	System.out.println();
        System.out.println("\\\\\\\\\\\\ Bubble Sort");
        for(int z : arrayBubble) {
            System.out.print(z + " ");
        }
        System.out.print("\n");

        int i = arrayBubble.length - 1;
        while(i > 0) {
            int lastFlipped = 0;
            for(int j = 0; j < i; j++) {
                if(arrayBubble[j] > arrayBubble[j + 1]) {
                    int t = arrayBubble[j];
                    arrayBubble[j] = arrayBubble[j + 1];
                    arrayBubble[j + 1] = t;
                    lastFlipped = j;
                }
            }
            i = lastFlipped;
            for(int z : arrayBubble) {
                System.out.print(z + " ");
            }
            System.out.print("\n");
        }

        System.out.println("\n");
        return arrayBubble;
    }


    public int[] selectionSort(int[] array) {
    	int[] arraySelection = new int[array.length];
    	int index = 0;
    	for(int i : array) {
    		arraySelection[index] = i;
    		index++;
    	}
    	
    	System.out.println();
        System.out.println("\\\\\\\\\\\\\\\\ Selection Sort");
        for(int s : arraySelection) {
            System.out.print(s + " ");
        }
        System.out.print("\n");

        int min = 0;
        for(int i = 0; i < arraySelection.length - 1; i++) {
            min = i;
            for(int j = i + 1; j < arraySelection.length; j++) {
                if(arraySelection[j] < arraySelection[min]) {
                    min = j;
                }
            }
            
            int t = arraySelection[i];
            arraySelection[i] = arraySelection[min];
            arraySelection[min] = t;

            for(int s : arraySelection) {
                System.out.print(s + " ");
            }
            System.out.print("\n");
        }
        
        System.out.println("\n");
        return arraySelection;
    }
}
