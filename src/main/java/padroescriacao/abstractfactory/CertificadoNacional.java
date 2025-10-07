package padroescriacao.abstractfactory;

public class CertificadoNacional implements Certificado {

    @Override
    public String emitir() {
        return "Certificado de Veículo Nacional";
    }
}
