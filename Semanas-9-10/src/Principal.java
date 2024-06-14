public class Principal {
    public static void main(String[] args) {

        /* Exercicio 2
        StaticList<Integer> lista = new StaticList<Integer>(10);

        lista.insert(-1, 0);
        lista.insert(3, 1);
        lista.insert(-3, 2);
        lista.insert(-8, 3);
        lista.insert(-7, 3);
        lista.insert(10, 3);
        lista.insert(10, 3);
        lista.insert(10, 3);
        lista.insert(-25, 3);

        System.out.println(new Exercicios().contaNegativos(lista));
         */


        //Exercicio 3
        StaticList<Integer> lista = new StaticList<Integer>(4);

        lista.insert(22, 0);
        lista.insert(21, 0);
        lista.insert(19, 0);
        lista.insert(12, 0);


        System.out.println(new Exercicios().isPrimo(lista.get(0)));
        System.out.println(new Exercicios().isPrimo(lista.get(1)));
        System.out.println(new Exercicios().isPrimo(lista.get(2)));

        new Exercicios().removePrimos(lista);

        System.out.println(lista.toString());

    }
}
