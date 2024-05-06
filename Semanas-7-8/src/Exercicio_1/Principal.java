package Exercicio_1;

public class Principal {
    public static void main(String[] args){
        int[] array = {10,34,65,76,78,81,86,87,95,104,120};

        Methods methods = new Methods(array);

        try{
            methods.pesquisaSequencial();
        }catch(IllegalArgumentException exception){
            System.out.println("O array não está ordenado");
        }
    }
}
