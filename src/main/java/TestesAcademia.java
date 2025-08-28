package academia;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestesAcademia {
    
    @Test
    public void testCriacaoMembro() {
        Plano plano = new Plano("Teste", 50.0);
        Membro membro = new Membro("Teste", 30, plano);
        
        assertEquals("Teste", membro.getNome());
        assertEquals(30, membro.getIdade());
        assertEquals(plano, membro.getPlano());
    }
    
    @Test
    public void testAdicionarMembro() {
        Academia academia = new Academia("Teste");
        Plano plano = new Plano("Teste", 50.0);
        Membro membro = new Membro("Teste", 30, plano);
        
        academia.adicionarMembro(membro);
        
        assertEquals(1, academia.getTotalMembros());
        assertTrue(academia.getMembros().contains(membro));
    }
    
    @Test
    public void testRemoverMembro() {
        Academia academia = new Academia("Teste");
        Plano plano = new Plano("Teste", 50.0);
        Membro membro = new Membro("Teste", 30, plano);
        
        academia.adicionarMembro(membro);
        assertEquals(1, academia.getTotalMembros());
        
        academia.removerMembro(membro);
        assertEquals(0, academia.getTotalMembros());
    }
    
    @Test
    public void testFaturamentoMensal() {
        Academia academia = new Academia("Teste");
        Plano basico = new Plano("Básico", 70.0);
        Plano premium = new Plano("Premium", 120.0);
        
        academia.adicionarMembro(new Membro("M1", 25, basico));
        academia.adicionarMembro(new Membro("M2", 30, premium));
        academia.adicionarMembro(new Membro("M3", 22, basico));
        
        double expected = 70.0 + 120.0 + 70.0;
        assertEquals(expected, academia.calcularFaturamentoMensal(), 0.001);
    }
}
