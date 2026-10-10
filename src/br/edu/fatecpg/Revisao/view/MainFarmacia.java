package br.edu.fatecpg.Revisao.view;
import br.edu.fatecpg.Revisao.model.Farmacia;

public class MainFarmacia {

    public static void main(String[] args) {

        String[] nomes = {"Dipirona", "Paracetamol", "Vitamina C", "Ibuprofeno"};
        int[] dias = {3, 10, 20,2};
        double[] precos = {10.00, 15.00, 20.00, 30.00};

        Farmacia farmacia = new Farmacia(nomes, dias, precos);

        farmacia.mostrarMedicamentos();

        double media = farmacia.calcularMediaDias();
        System.out.println("\nMédia de dias para vencimento: " + media);

        System.out.println();
        farmacia.mostrarProximosDoVencimento();

        // Aplicar desconto
        farmacia.aplicarDesconto();

        System.out.println("\n=== APÓS DESCONTO ===");
        farmacia.mostrarMedicamentos();
        
        //Venda
        System.out.println();
        farmacia.venderMedicamento("Dipirona");

        System.out.println("\n=== ESTOQUE APÓS VENDA ===");
        farmacia.mostrarMedicamentos();
    }
}