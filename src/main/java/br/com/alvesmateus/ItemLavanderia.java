package br.com.alvesmateus;

public interface ItemLavanderia {
    <T> T accept(ItemVisitor<T> visitor);
}
