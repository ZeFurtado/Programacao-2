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
        StaticList<Integer> lista = new StaticList<Integer>(3);

        lista.insert(5, 0);
        lista.insert(11, 1);
        lista.insert(-0, 2);

        System.out.println(new Exercicios().isPrimo(lista.get(0)));
        System.out.println(new Exercicios().isPrimo(lista.get(1)));
        System.out.println(new Exercicios().isPrimo(lista.get(2)));



    }
}
