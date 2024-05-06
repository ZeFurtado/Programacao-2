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

    public int pesquisaSequencial() throws IllegalArgumentException{
        System.out.println("///////// Pesquisa Sequencial");
        if(!arrayEhOrdenado()) throw new IllegalArgumentException();

        int index = 0;
        for(int i : array){
            if(i == target){
                System.out.println(array[index] + " Achou!");
                return index;
            }
            System.out.println(array[index] + " Não é "+target);
            index++;
        }
        System.out.println("O número "+target+ " não está no Array");
        return - 1;
    }
    public int pesquisaBinaria()throws IllegalArgumentException{
        if(!arrayEhOrdenado()) throw new IllegalArgumentException();
        System.out.println("///////// Pesquisa Binária");

        int inf = 0;
        int sup = array.length - 1;
        int med;

        while (inf <= sup){
            med = (inf + sup) / 2;

            if(array[med] < target){
                System.out.println(array[med]+ " Não é o " +target);
                inf = med + 1;
            }else if(array[med] > target){
                System.out.println(array[med]+ " Não é o " +target);
                sup = med - 1;
            }else{
                System.out.print("O número foi achado na posição " +med);
                return array[med];
            }
        }
        System.out.println("O número "+target+ " não está no Array");
        return -1;
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

    public int[] insercaoDireta(){
        for(int i=1; i < array.length; i++){
            int j = i;
            int b = array[i];
            while ((j > 0) && (array[j - 1] > b)){
                array[j] = array[j-1];
                j--;
            }
            array[j] = b;
        }
        return array;
    }


}
