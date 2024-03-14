package Empresa;

import java.sql.Date;

public class Colaborador {

    private String nome;
    private Date dataDeNascimento;
    private float salario;
    private Funcao funcao;
    private Setor setor;

    public Colaborador (String nome, Date dataDeNascimento, float salario, Funcao funcao, Setor setor){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.salario = salario;
        this.funcao = funcao;
        this.setor = setor;
    }
}
