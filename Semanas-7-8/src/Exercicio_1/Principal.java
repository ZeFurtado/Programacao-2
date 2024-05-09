package Exercicio_1;

public class Principal {
    public static void main(String[] args){
        SortMethods sortMethods = new SortMethods();
        int[] array =  {4,-3,18,22,5,0,1,47,-2,9};

        sortMethods.insertionSort(array);
        sortMethods.bubbleSort(array);
        sortMethods.selectionSort(array);
    }
}
