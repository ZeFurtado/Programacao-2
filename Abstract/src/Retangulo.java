public class Retangulo extends Figura {

    private int base;
    private int altura;

    public Retangulo(String cor, int base, int altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void setCor(String cor) {
        super.setCor(cor);
    }

    @Override
    public String getCor() {
        return super.getCor();
    }

    public void setBase(int base){
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(){
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public double calculaArea() {
        return this.base * this.altura;
    }

   @Override
    public double calculaPerimetro(){
        return (this.base + this.altura) * 2;
    }
}
