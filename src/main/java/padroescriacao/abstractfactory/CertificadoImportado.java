package padroescriacao.abstractfactory;

public class CertificadoImportado implements Certificado {

    @Override
    public String emitir() {
        return "Certificado de Veículo Importado";
    }
}
