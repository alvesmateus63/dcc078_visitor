package br.com.alvesmateus;

public class PecaDelicada implements ItemLavanderia {
    private final String descricao;
    private final String tipoTecido;
    private final double pesoKg;

    public PecaDelicada(String descricao, String tipoTecido, double pesoKg) {
        this.descricao = descricao;
        this.tipoTecido = tipoTecido;
        this.pesoKg = pesoKg;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipoTecido() {
        return tipoTecido;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    @Override
    public <T> T accept(ItemVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
