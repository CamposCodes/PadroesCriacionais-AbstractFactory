package padroescriacao.abstractfactory;

public class FabricaNacional implements FabricaAbstrata {

    @Override
    public Certificado createCertificado() {
        return new CertificadoNacional();
    }

    @Override
    public Manual createManual() {
        return new ManualNacional();
    }
}
