package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveEmitirCertificadoNacional() {
        FabricaAbstrata fabrica = new FabricaNacional();
        Veiculo veiculo = new Veiculo(fabrica);

        String resultado = veiculo.emitirCertificado();

        assertEquals("Certificado de Veículo Nacional", resultado);
    }

    @Test
    void deveEmitirManualNacional() {
        FabricaAbstrata fabrica = new FabricaNacional();
        Veiculo veiculo = new Veiculo(fabrica);

        String resultado = veiculo.emitirManual();

        assertEquals("Manual de Veículo Nacional", resultado);
    }

    @Test
    void deveEmitirCertificadoImportado() {
        FabricaAbstrata fabrica = new FabricaImportado();
        Veiculo veiculo = new Veiculo(fabrica);

        String resultado = veiculo.emitirCertificado();

        assertEquals("Certificado de Veículo Importado", resultado);
    }

    @Test
    void deveEmitirManualImportado() {
        FabricaAbstrata fabrica = new FabricaImportado();
        Veiculo veiculo = new Veiculo(fabrica);

        String resultado = veiculo.emitirManual();

        assertEquals("Manual de Veículo Importado", resultado);
    }
}
