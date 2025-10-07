package padroescriacao.abstractfactory;

public class ManualNacional implements Manual {

    @Override
    public String emitir() {
        return "Manual de Veículo Nacional";
    }
}
