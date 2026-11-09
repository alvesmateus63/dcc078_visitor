package br.com.alvesmateus;

public class EdredomOuCama implements ItemLavanderia {
    private final String tamanho;
    private final boolean possuiPlumas;

    public EdredomOuCama(String tamanho, boolean possuiPlumas) {
        this.tamanho = tamanho;
        this.possuiPlumas = possuiPlumas;
    }

    public String getTamanho() {
        return tamanho;
    }

    public boolean isPossuiPlumas() {
        return possuiPlumas;
    }

    @Override
    public <T> T accept(ItemVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
