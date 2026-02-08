public abstract class Funcionario extends Pessoa {
    public Funcionario(String nome) { super(nome); }
    public abstract void calcSalario();
    public void comissao() { System.out.println("Comissão padrão..."); }
}