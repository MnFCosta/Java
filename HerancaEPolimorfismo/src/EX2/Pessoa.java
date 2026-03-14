package EX2;

public abstract class Pessoa {
    private String nome;
    private double rendaAnual;

    public Pessoa (String nome, double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public double getRendaAnual() {
        return this.rendaAnual;
    }

    public String getNome() {
        return this.nome;
    }

    public abstract double calculoImposto();

}
