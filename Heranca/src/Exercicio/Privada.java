package Exercicio;

public class Privada extends Universidade {

    private float mensalidade;

    public Privada(float mensalidade){
        this.mensalidade = mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void adicionaPreco(float preco){
        mensalidade = mensalidade + preco;
    }

    @Override
    public void print() {
        StringBuilder resumo = new StringBuilder();
        resumo.append("Nome da Universidade: " + getNome() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Quantidade de Alunos: " + getQntdAlunos() + "\n" +
                "Quantidade de Professores" + getQntdProfessores() + "\n" +
                "Valor da mensalidade: " + getMensalidade());

        System.out.print(resumo.toString());
    }
}
