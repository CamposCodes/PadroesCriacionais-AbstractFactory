package padroescriacao.abstractfactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Padrão Abstract Factory - Documentação Automotiva ===\n");

        // Testando veículos nacionais
        System.out.println("Veículo Nacional:");
        FabricaAbstrata fabricaNacional = new FabricaNacional();
        Veiculo veiculoNacional = new Veiculo(fabricaNacional);
        System.out.println("- " + veiculoNacional.emitirCertificado());
        System.out.println("- " + veiculoNacional.emitirManual());

        System.out.println();

        // Testando veículos importados
        System.out.println("Veículo Importado:");
        FabricaAbstrata fabricaImportado = new FabricaImportado();
        Veiculo veiculoImportado = new Veiculo(fabricaImportado);
        System.out.println("- " + veiculoImportado.emitirCertificado());
        System.out.println("- " + veiculoImportado.emitirManual());
    }
}
