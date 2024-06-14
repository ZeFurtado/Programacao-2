public class Eletrodomestico {
    private String marca;
    private int voltagem;
    private double valor;

    public Eletrodomestico(String marca, int voltagem, double valor) {
        this.marca = marca;
        this.voltagem = voltagem;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
