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
        /*
        StaticList<Integer> lista = new StaticList<Integer>(5);
        Exercicios exercicios = new Exercicios();

        lista.insert(19, 0);
        lista.insert(22, 0);
        lista.insert(19, 0);
        lista.insert(65, 0);

        exercicios.removePrimos(lista);

        System.out.println(lista.toString());
         */

        //Exercicio 4
        /*
        StaticList<Integer> lista1 = new StaticList<Integer>(5);
        StaticList<Integer> lista2 = new StaticList<Integer>(3);

        lista2.insert(10, 0);
        lista2.insert(25, 0);
        lista2.insert(20, 0);


        lista1.insert(3,0);
        lista1.insert(1,0);
        lista1.insert(2,0);
        lista1.insert(30, 0);
        lista1.insert(5, 0);

        System.out.println(new Exercicios().exercicio4(lista1, lista2));
        */

        //Exercicio 5
        /*
        Eletrodomestico eletro1 = new Eletrodomestico("Samsung", 220, 1999.99);
        Eletrodomestico eletro2 = new Eletrodomestico("LG", 110, 1599.49);
        Eletrodomestico eletro3 = new Eletrodomestico("Electrolux", 220, 2399.90);
        Eletrodomestico eletro4 = new Eletrodomestico("Brastemp", 110, 1799.75);
        Eletrodomestico eletro5 = new Eletrodomestico("Philco", 220, 899.00);
        Eletrodomestico eletro6 = new Eletrodomestico("Panasonic", 110, 2499.99);

        StaticList<Eletrodomestico> eletrodomesticos = new StaticList<Eletrodomestico>(6);
        eletrodomesticos.insert(eletro1, 0);
        eletrodomesticos.insert(eletro2, 0);
        eletrodomesticos.insert(eletro3, 0);
        eletrodomesticos.insert(eletro4, 0);
        eletrodomesticos.insert(eletro5, 0);
        eletrodomesticos.insert(eletro6, 0);

        System.out.println(new Exercicios().contaEletrodomesticosCaros(eletrodomesticos, 2000.00));
        */
    }
}
