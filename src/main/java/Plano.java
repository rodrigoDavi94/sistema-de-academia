package academia;

public class Plano {
    private String tipo;
    private double valor;
    
    public Plano(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public double getValor() {
        return valor;
    }
}
