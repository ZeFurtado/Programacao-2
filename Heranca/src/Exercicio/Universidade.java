package Exercicio;

public class Universidade {
    private String nome;
    private String endereco;
    private int qntdAlunos;
    private int qntdProfessores;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setQntdAlunos(int qntdAlunos){
        this.qntdAlunos = qntdAlunos;
    }

    public int getQntdAlunos() {
        return qntdAlunos;
    }

    public void setQntdProfessores(int qntdProfessores) {
        this.qntdProfessores = qntdProfessores;
    }

    public int getQntdProfessores() {
        return qntdProfessores;
    }

    public void print(){
        StringBuilder resumo = new StringBuilder();
        resumo.append("Nome da Universidade: "+getNome()+"\n"+
                "Endereço: " + getEndereco()+"\n"+
                "Quantidade de Alunos: " +getQntdAlunos()+ "\n"+
                "Quantidade de Professores" +getQntdProfessores()+ "\n");

        System.out.print(resumo.toString());
    }


}
