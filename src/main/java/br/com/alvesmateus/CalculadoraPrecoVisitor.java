package br.com.alvesmateus;

public class CalculadoraPrecoVisitor implements ItemVisitor<Double> {
    @Override
    public Double visit(RoupaComum item) {
        return item.getPesoKg() * 12.0;
    }

    @Override
    public Double visit(PecaDelicada item) {
        double taxaTecido = "seda".equalsIgnoreCase(item.getTipoTecido()) ? 15.0 : 8.0;
        return (item.getPesoKg() * 18.0) + taxaTecido;
    }

    @Override
    public Double visit(EdredomOuCama item) {
        double precoBase;

        switch (item.getTamanho().toUpperCase()) {
            case "KING":
                precoBase = 45.0;
                break;
            case "CASAL":
                precoBase = 35.0;
                break;
            default:
                precoBase = 25.0;
                break;
        }

        if (item.isPossuiPlumas()) {
            precoBase += 20.0;
        }

        return precoBase;
    }
}
