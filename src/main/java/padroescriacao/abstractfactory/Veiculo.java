package padroescriacao.abstractfactory;

public class Veiculo {

    private Certificado certificado;
    private Manual manual;

    public Veiculo(FabricaAbstrata fabrica) {
        this.certificado = fabrica.createCertificado();
        this.manual = fabrica.createManual();
    }

    public String emitirCertificado() {
        return this.certificado.emitir();
    }

    public String emitirManual() {
        return this.manual.emitir();
    }
}
