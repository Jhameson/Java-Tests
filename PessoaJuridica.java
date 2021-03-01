
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author jhame
 */
public class PessoaJuridica extends Pessoa {

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private String cnpj;
    private Date dataCriacao;

    public PessoaJuridica() {

    }

    public PessoaJuridica(String cnpj, Date dataCriacao, String nome) {
        super(nome);
        this.cnpj = cnpj;
        this.dataCriacao = dataCriacao;
    }

    @Override
    public boolean validarDocumento() {
        if (this.cnpj.length() == 14) {
            return true;
        }
        return false;
    }

    @Override
    public int calcularIdade() {

        Date d = new Date();
        long dMil = Math.abs(this.getDataCriacao().getTime() - d.getTime());
        long diff = TimeUnit.DAYS.convert(dMil, TimeUnit.MILLISECONDS);
        int idade = (int) diff / 365;
        return idade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Pessoa Juridica=>  Nome: " + getNome() + " / CPF: " + cnpj + " / DataNascimento: " + formato.format(dataCriacao);
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PessoaJuridica other = (PessoaJuridica) obj;
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        return true;
    }

    

}
