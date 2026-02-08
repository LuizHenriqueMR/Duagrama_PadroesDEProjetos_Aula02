public class Gerente extends Funcionario implements Autenticavel, Departamento {
    private String setor;

    public Gerente(String nome, String documento) {
        super(nome, documento);
    }

    @Override
    public void definirSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void calcSalario() {
        System.out.println("Calculando salário do Gerente do setor " + setor);
    }

    @Override
    public void login() {
        System.out.println("Gerente " + nome + " logado.");
    }
}