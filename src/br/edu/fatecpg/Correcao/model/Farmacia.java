package br.edu.fatecpg.Correcao.model;
public class Farmacia {

    String[] nomesMedicamentos;
    int[] diasParaVencimento;
    double[] precos;

    public Farmacia(String[] nomesMedicamentos,
                    int[] diasParaVencimento,
                    double[] precos) {

        this.nomesMedicamentos = nomesMedicamentos;
        this.diasParaVencimento = diasParaVencimento;
        this.precos = precos;
    }

    public void mostrarMedicamentos() {

        System.out.println("=== MEDICAMENTOS ===");

        for (int i = 0; i < nomesMedicamentos.length; i++) {

            System.out.println(
                "Medicamento: " + nomesMedicamentos[i] +
                " | Preço: R$ " + precos[i] +
                " | Vencimento: " + diasParaVencimento[i] + " dias"
            );
        }
    }

    public double calcularMediaDias() {

        int soma = 0;
        for (int i = 0; i < diasParaVencimento.length; i++) {
            soma += diasParaVencimento[i];
        }

        return (double) soma / diasParaVencimento.length;
    }

    public void mostrarProximosDoVencimento() {

        System.out.println("=== PRÓXIMOS DO VENCIMENTO ===");

        for (int i = 0; i < nomesMedicamentos.length; i++) {

            if (diasParaVencimento[i] < 5) {

                System.out.println(
                    nomesMedicamentos[i] +
                    " - " + diasParaVencimento[i] + " dias"
                );
            }
        }
    }

    public void aplicarDesconto() {

        for (int i = 0; i < nomesMedicamentos.length; i++) {
            if (diasParaVencimento[i] < 5) {
                precos[i] = precos[i] * 0.5;
            }
        }
    }


    public void venderMedicamento(String nome) {

        for (int i = 0; i < nomesMedicamentos.length; i++) {
            if (nomesMedicamentos[i].equalsIgnoreCase(nome)) {

                String[] novosNomes = new String[nomesMedicamentos.length - 1];
                int[] novosDias = new int[diasParaVencimento.length - 1];
                double[] novosPrecos = new double[precos.length - 1];

                int j = 0;
                
                for (int k = 0; k < nomesMedicamentos.length; k++) {
                    if (k != i) {
                        novosNomes[j] = nomesMedicamentos[k];
                        novosDias[j] = diasParaVencimento[k];
                        novosPrecos[j] = precos[k];
                        j++;
                    }
                }

                nomesMedicamentos = novosNomes;
                diasParaVencimento = novosDias;
                precos = novosPrecos;

                System.out.println(
                    nome + " vendido com sucesso!"
                );

                return;
            }
        }

        System.out.println("Medicamento não encontrado.");
    }
}