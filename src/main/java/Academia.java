package academia;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private String nome;
    private List<Membro> membros;
    
    public Academia(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }
    
    public void adicionarMembro(Membro membro) {
        membros.add(membro);
    }
    
    public void removerMembro(Membro membro) {
        membros.remove(membro);
    }
    
    public List<Membro> getMembros() {
        return new ArrayList<>(membros);
    }
    
    public int getTotalMembros() {
        return membros.size();
    }
    
    public double calcularFaturamentoMensal() {
        double total = 0;
        for (Membro membro : membros) {
            total += membro.getPlano().getValor();
        }
        return total;
    }
}
