package Exercicio_1;

public class SearchMethods {
    public int pesquisaSequencial(int[] array, int target){
    	
    	System.out.println();
        System.out.println("///////// Pesquisa Sequencial");
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
    public int pesquisaBinaria(int[] array, int target){
    	
    	System.out.println();
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
}
