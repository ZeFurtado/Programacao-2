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
}
