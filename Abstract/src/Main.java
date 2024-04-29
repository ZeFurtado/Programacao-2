public class Main {

    public static void main(String[] args){
        Figura[] figuras = new Figura[2];

        Circulo redondo = new Circulo("Roxo", 20);
        Retangulo retangulo = new Retangulo("Vermelho", 10, 20);

        Figura figuraRetangulo = retangulo;
        Figura figuraCirculo = redondo;

        System.out.println("Chamada retângulo: " + figuraRetangulo.getCor());
        System.out.println(figuraRetangulo.calculaArea());
        System.out.println(figuraRetangulo.calculaPerimetro());

        System.out.println("Chamada circulo: " + figuraCirculo.getCor());
        System.out.println(figuraCirculo.calculaArea());
        System.out.println(figuraCirculo.calculaPerimetro());



    }

}
