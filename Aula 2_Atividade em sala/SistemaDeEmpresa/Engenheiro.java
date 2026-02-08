public class Engenheiro extends Funcionario implements Fornecedor {
    public Engenheiro(String nome) { super(nome); }
    @Override public void calcSalario() { System.out.println("Salário Engenheiro"); }
    @Override public void comissao() { System.out.println("Comissão Engenheiro"); }
    @Override public void fornecerInsumos() { System.out.println("Engenheiro fornecendo insumos"); }
    @Override public void exibirDados() { System.out.println("Engenheiro: " + nome); }
}