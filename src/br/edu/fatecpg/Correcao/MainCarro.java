package br.edu.fatecpg.Correcao;

public class MainCarro {

    public static void main(String[] args) {

        // 1. Instanciação
        Carro carro = new Carro();

        // 2. Entrada de dados
        carro.marca = "Ford";
        carro.modelo = "Ka";
        carro.ano = 2022;

        // 3. Relatório
        System.out.println("=== VEÍCULO CADASTRADO ===");
        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
    }
}