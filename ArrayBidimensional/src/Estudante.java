import java.sql.Date;

public class Estudante {

    private int matricula;
    private String nome;
    private Date dataDeNasc;

    public Estudante(int matricula, String nome, Date dataDeNasc){
        this.matricula = matricula;
        this.nome = nome;
        this.dataDeNasc = dataDeNasc;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDataDeNasc(Date dataDeNasc) {
        this.dataDeNasc = dataDeNasc;
    }

    public Date getDataDeNasc() {
        return dataDeNasc;
    }
}
