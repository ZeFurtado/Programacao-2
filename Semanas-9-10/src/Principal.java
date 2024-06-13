public class Principal {
    public static void main(String[] args) {
        Integer num1 = 5;
        Integer num2 = 16;
        Integer num3 = 25;

        StaticList<Integer> lista = new StaticList<Integer>(5);

        lista.insert(num3, 0);
        lista.insert(num2, 1);
        lista.insert(num1, 2);

        System.out.println("A lista tem " +lista.contaElementos(num1)+ " elementos");
    }
}
