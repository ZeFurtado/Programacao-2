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
            if(isPrimo(lista.get(pos))){
                lista.remove(pos);
                pos--;
            }else{
                pos++;
            }
        }
    }
}
