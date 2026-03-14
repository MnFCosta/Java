package EX2;

public class PessoaFisica extends Pessoa{
    private double gastosSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude){
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calculoImposto(){
        double imposto = 0;

        if (this.getRendaAnual() < 20000.0){
            imposto = ((this.getRendaAnual() * 15) / 100) - ((this.gastosSaude * 50) / 100);
        }else {
            imposto = ((this.getRendaAnual() * 25) / 100) - ((this.gastosSaude * 50) / 100);
        }

        return imposto;
    }


}
