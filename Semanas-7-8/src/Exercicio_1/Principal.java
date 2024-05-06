package Exercicio_1;

public class Principal {
    public static void main(String[] args){
        int[] array = {10,34,65,76,81,25,86,87,38,104,120};

        Methods methods = new Methods(array, 87);

        try{
            methods.pesquisaSequencial();
            methods.pesquisaBinaria();
        }catch(IllegalArgumentException exception){
            System.out.println("O array não está ordenado");
            methods = new Methods(methods.insercaoDireta(), 85);
        }

        methods.pesquisaBinaria();
    }
}
