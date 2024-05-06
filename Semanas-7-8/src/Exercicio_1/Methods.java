package Exercicio_1;

public class Methods {
    private int[] array;
    private int target;

    public Methods(int[] array, int target){
        this.array = array;
        this.target = target;
    }

    public void setArray(int[] array){
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public void pesquisaSequencial() throws IllegalArgumentException{
        if(!arrayEhOrdenado()) throw new IllegalArgumentException();

        int index = 0;
        for(int i : array){
            if(i == 95){
                System.out.println(array[index] + " Achou!");
                break;
            }
            System.out.println(array[index] + " Não é 95");
            index++;
        }
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
