package Exercicio_1;

public class Methods {
    private int[] array;

    public Methods(int[] array){
        this.array = array;
    }

    public void setArray(int[] array){
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void pesquisaSequencial() throws IllegalArgumentException{
        if(!arrayEhOrdenado()) throw new IllegalArgumentException();
    }

    private boolean arrayEhOrdenado(){
        int i = 1;
        while(i < array.length){
            if(array[i - 1] > array[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
