package Exercicio;

public class Publica extends Universidade{
    private int qntdConcursados;

    public void setQntdConcursados(int qntdConcursados) {
        this.qntdConcursados = qntdConcursados;
    }

    public int getQntdConcursados() {
        return qntdConcursados;
    }

    public void AumentaQntdConcursados(){
        this.qntdConcursados = qntdConcursados + 1;
    }

    @Override
    public void print(){
        StringBuilder resumo = new StringBuilder();
        resumo.append("Nome da Universidade: "+getNome()+"\n"+
                "Endereço: " + getEndereco()+"\n"+
                "Quantidade de Alunos: " +getQntdAlunos()+ "\n"+
                "Quantidade de Professores" +getQntdProfessores()+ "\n"+
                "Quantidade de Concursados" +getQntdConcursados());

        System.out.print(resumo.toString());
    }
}
