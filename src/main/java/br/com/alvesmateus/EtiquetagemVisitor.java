package br.com.alvesmateus;

public class EtiquetagemVisitor implements ItemVisitor<String> {
    @Override
    public String visit(RoupaComum item) {
        return String.format("[COMUM] %s | Processo: Lavagem Padrão (Água/Sabão Neutro)", item.getDescricao());
    }

    @Override
    public String visit(PecaDelicada item) {
        return String.format("[DELICADA] %s (%s) | Processo: Lavagem a Frio / Ciclo Suave",
                item.getDescricao(), item.getTipoTecido());
    }

    @Override
    public String visit(EdredomOuCama item) {
        String secagem = item.isPossuiPlumas()
                ? "Secagem Tambor Temp. Baixa (Lenta)"
                : "Secagem Padrão";
        return String.format("[CAMA] Edredom/Manta %s | Processo: Máquina Industrial G. %s",
                item.getTamanho(), secagem);
    }
}
