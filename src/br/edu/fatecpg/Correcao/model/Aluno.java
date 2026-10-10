package br.edu.fatecpg.Correcao.model;

public class Aluno {

    private String nome;
    private int matricula;
    private double notaFinal;

    // Setter do nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter do nome
    public String getNome() {
        return nome;
    }

    // Setter da matrícula
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Getter da matrícula
    public int getMatricula() {
        return matricula;
    }

    // Setter da nota
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    // Getter da nota
    public double getNotaFinal() {
        return notaFinal;
    }
}