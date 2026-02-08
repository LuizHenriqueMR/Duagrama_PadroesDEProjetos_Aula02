public class Secretario extends Funcionario {
    public Secretario(String nome) { super(nome); }
    @Override public void calcSalario() { System.out.println("Salário Secretário"); }
    @Override public void exibirDados() { System.out.println("Secretário: " + nome); }
}