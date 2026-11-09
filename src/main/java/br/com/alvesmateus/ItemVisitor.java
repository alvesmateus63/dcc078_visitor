package br.com.alvesmateus;

public interface ItemVisitor<T> {
    T visit(RoupaComum item);
    T visit(PecaDelicada item);
    T visit(EdredomOuCama item);
}
