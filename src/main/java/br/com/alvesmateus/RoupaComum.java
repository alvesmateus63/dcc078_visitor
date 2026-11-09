package br.com.alvesmateus;

public class RoupaComum implements ItemLavanderia {
    private final String descricao;
    private final double pesoKg;

    public RoupaComum(String descricao, double pesoKg) {
        this.descricao = descricao;
        this.pesoKg = pesoKg;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    @Override
    public <T> T accept(ItemVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
