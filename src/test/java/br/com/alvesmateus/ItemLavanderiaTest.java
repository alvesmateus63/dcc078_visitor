package br.com.alvesmateus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemLavanderiaTest {
    @Test
    @DisplayName("RoupaComum deve aceitar a CalculadoraPrecoVisitor e retornar o calculo correto")
    void roupaComumDeveProcessarVisitor() {
        ItemLavanderia item = new RoupaComum("Camiseta", 1.5);
        CalculadoraPrecoVisitor visitor = new CalculadoraPrecoVisitor();

        Double preco = item.accept(visitor);

        assertEquals(18.0, preco, 0.001);
    }

    @Test
    @DisplayName("EdredomOuCama deve aceitar a CalculadoraPrecoVisitor e retornar o calculo correto")
    void edredomOuCamaDeveProcessarVisitor() {
        ItemLavanderia item = new EdredomOuCama("KING", false);
        CalculadoraPrecoVisitor visitor = new CalculadoraPrecoVisitor();

        Double preco = item.accept(visitor);

        assertEquals(45.0, preco, 0.001);
    }
}
