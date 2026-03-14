package EX2;

public class PessoaJuridica extends Pessoa {
    private int numFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, int numFuncionarios){
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public double calculoImposto(){
        double imposto = 0;

        if (this.numFuncionarios < 10){
            imposto = ((this.getRendaAnual() * 16) / 100);
        }else {
            imposto = ((this.getRendaAnual() * 14) / 100);
        }

        return imposto;
    }
}
