package padroescriacao.abstractfactory;

public interface FabricaAbstrata {
    Certificado createCertificado();

    Manual createManual();
}
