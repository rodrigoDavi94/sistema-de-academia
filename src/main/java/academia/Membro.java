package academia;

public class Membro {
    private String nome;
    private int idade;
    private Plano plano;
    
    public Membro(String nome, int idade, Plano plano) {
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public Plano getPlano() {
        return plano;
    }
    
    public void setPlano(Plano plano) {
        this.plano = plano;
    }
    
    @Override
    public String toString() {
        return "Membro: " + nome + " (" + idade + " anos) - Plano: " + plano.getTipo();
    }
}
