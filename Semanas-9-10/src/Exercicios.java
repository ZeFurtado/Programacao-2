public class Exercicios {
    public int contaNegativos(StaticList<Integer> lista) throws IllegalArgumentException{
        if(lista == null) throw new IllegalArgumentException();

        return contaNegativos(lista, 0, 0);

    }

    private int contaNegativos(StaticList lista, int pos, int numNegativos){
        if(pos == lista.numElements()) {
            return numNegativos;
        }else if((Integer)lista.get(pos) < 0){
            numNegativos++;
            pos++;
            return contaNegativos(lista, pos, numNegativos);
        }else {
            pos++;
            return contaNegativos(lista, pos, numNegativos);
        }
    }

    public boolean isPrimo(int num){
        if(num == 0 || num == 1) return false;
        else {
            int fim;
            fim = (int)Math.sqrt(num);
            for(int i = 2; i <=fim; i++){
                if(num % i == 0) return false;
            }
            return true;
        }
    }

    public void removePrimos(StaticList<Integer> lista){
        int pos = 0;
        while(pos < lista.numElements()){
            if(isPrimo(lista.get(pos))) {
                lista.remove(pos);
            }else{
                pos++;
            }
        }
    }

    public int exercicio4(StaticList<Integer> lista1, StaticList<Integer> lista2) throws IllegalArgumentException{
        if(lista1 == null || lista2 == null) throw new IllegalArgumentException();
        return exercicio4(lista1, lista2, 0, -1, -1);
    }

    private int exercicio4(StaticList<Integer> lista1, StaticList<Integer> lista2,int soma, int pos1, int pos2){
        if((pos1 >= lista1.numElements() - 1) && (pos2 >= lista2.numElements() - 1)) return soma;

        if(pos1 < lista1.numElements() - 1) {
            soma += lista1.get(pos1 + 1);
            pos1++;
            return exercicio4(lista1, lista2, soma, pos1, pos2);
        }else if(pos2 < lista2.numElements() - 1){
            soma += lista2.get(pos2 + 1);
            pos2++;
            return exercicio4(lista1, lista2, soma, pos1, pos2);
        }
        
        return - 1;
    }

}
