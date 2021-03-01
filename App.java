
import java.util.Date;
import java.text.*;

public class App {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada;

        /*PESSOA FISICA 01*/
        PessoaFisica f1 = new PessoaFisica();
        f1.setNome("Jhameson Lucas");
        f1.setCpf("000.000.000-00");
        String d1 = "22/08/1999";
        f1.setDataNascimento(formato.parse(d1));

        /*PESSOA FISICA 02*/
        PessoaFisica f2 = new PessoaFisica();
        f2.setNome("Beatriz Nobre");
        f2.setCpf("888.888.888-88");
        f2.setDataNascimento(formato.parse("03/05/2000"));

        /* PESSOA JURIDICA 01*/
        PessoaJuridica j1 = new PessoaJuridica();
        j1.setNome("Torden SK");
        j1.setCnpj("22.222.222/2222-2");
        j1.setDataCriacao(formato.parse("01/05/2016"));

        /* PESSOA JURIDICA 02*/
        PessoaJuridica j2 = new PessoaJuridica();
        j2.setNome("SK_industries");
        j2.setCnpj("88.888.888/8888-88");
        j2.setDataCriacao(formato.parse("30/10/2020"));

        /* PESSOA JURIDICA 03*/
        PessoaJuridica j3 = new PessoaJuridica();
        j3.setNome("SK_Fantasma");
        j3.setCnpj("88.888.888/8888-88");
        j3.setDataCriacao(formato.parse("30/10/2020"));

        ColecaoPessoa.getInstance().inserir(f1);
        ColecaoPessoa.getInstance().inserir(f2);
        ColecaoPessoa.getInstance().inserir(j1);
        ColecaoPessoa.getInstance().inserir(j2);
        ColecaoPessoa.getInstance().inserir(j3);

        ColecaoPessoa.getInstance().imprimirDadosColecao();

        /*
        String x = "22/08/1999";
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); //você pode usar outras máscaras
        Date y = new Date();
        System.out.println(sdf1.format(y));
         */
        System.out.println("------------------------------------------");
        System.out.println("\nIdade " + f1.getNome() + ": " + f1.calcularIdade() + "");
        System.out.println("Idade " + f2.getNome() + ": " + f1.calcularIdade() + "");
        System.out.println("Idade " + j1.getNome() + ": " + f1.calcularIdade() + "");
        System.out.println("Idade " + j2.getNome() + ": " + f1.calcularIdade() + "");
        System.out.println("Idade " + j3.getNome() + ": " + f1.calcularIdade() + "");

        System.out.println("------------------------------------------");

        if (f1.validarDocumento()) {
            System.out.println("\nDocumento válido: " + f1.getNome() + "");
        } else {
            System.out.println("\nDocumento inválido: " + f1.getNome() + "");
        }
        if (j1.validarDocumento()) {
            System.out.println("\nDocumento válido: " + j1.getNome() + "");
        } else {
            System.out.println("\nDocumento inválido: " + j1.getNome() + "");
        }
        System.out.println("------------------------------------------");
        if (j2.equals(j3)) {
            System.out.println("\nDocumentos Iguais!\n");
        }

        System.out.println("------------------------------------------");
        if (ColecaoPessoa.getInstance().pesquisar(f2)) {
            System.out.println("\nPessoa está na lista!\n");
        }

        System.out.println("------------------------------------------");
        if (ColecaoPessoa.getInstance().remover(1)) {
            System.out.println("\nPessoa removida na lista!\n");
        }

        System.out.println("------------------------------------------");

        System.out.println("Pesquisar: "+ColecaoPessoa.getInstance().pesquisar(f1)+"\n");

        System.out.println("------------------------------------------");
        
        if (ColecaoPessoa.getInstance().colecaoEstaVazia()) {
            System.out.println("Vazia");
        } else {
            System.out.println("Contem algo");
        }
        //ColecaoPessoa.getInstance().imprimirDadosColecao();

        System.out.println("Retornar: "+ColecaoPessoa.getInstance().retornarObjeto(3));
    }
}
