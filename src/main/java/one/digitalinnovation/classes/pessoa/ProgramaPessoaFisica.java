package one.digitalinnovation.classes.pessoa;

public class ProgramaPessoaFisica extends Pessoa{

    public static void main(String[] args) {
        final PessoaFisica pessoaFisica = new PessoaFisica(24, 73.5F);

        System.out.println(pessoaFisica.relatorio());
    }

}
