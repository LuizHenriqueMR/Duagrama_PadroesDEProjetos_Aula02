public class Gerente extends Funcionario implements Autenticavel, Departamento {
    public Gerente(String nome) { super(nome); }
    @Override public void calcSalario() { System.out.println("Salário Gerente"); }
    @Override public void login() { System.out.println("Gerente logado"); }
    @Override public void definirSetor(String setor) { System.out.println("Setor: " + setor); }
    @Override public void exibirDados() { System.out.println("Gerente: " + nome); }
}