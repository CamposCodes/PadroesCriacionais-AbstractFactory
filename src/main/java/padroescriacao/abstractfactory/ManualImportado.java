package padroescriacao.abstractfactory;

public class ManualImportado implements Manual {

    @Override
    public String emitir() {
        return "Manual de Veículo Importado";
    }
}
