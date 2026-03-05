package EXList1.entities;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentoSalario(Integer percent){
        this.salario += (this.salario / 100) * percent;
    }

    public String toString(){
        return String.format("ID: %d NOME: %s SALARIO: %.2f", this.id, this.nome, this.salario);
    }

    public Integer getId() {
        return id;
    }
}
