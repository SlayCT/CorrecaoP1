package br.edu.fatecpg.Correcao.view;
import br.edu.fatecpg.Correcao.model.Aluno;

public class MainAluno {

    public static void main(String[] args) {

        // 1. Instanciação
        Aluno aluno = new Aluno();

        // 2. Configuração usando Setters
        aluno.setNome("Cícera");
        aluno.setMatricula(12345);
        aluno.setNotaFinal(8.5);

        // 3. Consulta usando Getters
        System.out.println("=== BOLETIM ===");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Nota final: " + aluno.getNotaFinal());
    }
}