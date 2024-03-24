public class Circulo extends Figura {

    private int raio;
    public Circulo(String cor, int raio){
        super(cor);
        this.raio = raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    @Override
    public void setCor(String cor) {
        super.setCor(cor);
    }

    @Override
    public String getCor() {
        return super.getCor();
    }

    @Override
    public double calculaArea(){
        return Math.PI * (this.raio * this.raio);
    }

    @Override
    public double calculaPerimetro() {
        return 2 * Math.PI * this.raio;
    }
}
