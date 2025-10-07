package padroescriacao.abstractfactory;

public class FabricaImportado implements FabricaAbstrata {

    @Override
    public Certificado createCertificado() {
        return new CertificadoImportado();
    }

    @Override
    public Manual createManual() {
        return new ManualImportado();
    }
}
