package academia;

public class Main {
    public static void main(String[] args) {
        // Criar planos
        Plano basico = new Plano("Básico", 70.0);
        Plano premium = new Plano("Premium", 120.0);
        
        // Criar academia
        Academia academia = new Academia("Academia Fit");
        
        // Adicionar membros
        academia.adicionarMembro(new Membro("João Silva", 25, basico));
        academia.adicionarMembro(new Membro("Maria Santos", 30, premium));
        academia.adicionarMembro(new Membro("Pedro Costa", 22, basico));
        
        // Exibir informações
        System.out.println("=== " + academia.getNome() + " ===");
        System.out.println("Total de membros: " + academia.getTotalMembros());
        System.out.println("Faturamento mensal: R$ " + academia.calcularFaturamentoMensal());
        
        System.out.println("\n=== Membros ===");
        for (Membro membro : academia.getMembros()) {
            System.out.println(membro);
        }
    }
}
