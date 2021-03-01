
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class PessoaFisica extends Pessoa {

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    private String cpf;
    private Date dataNascimento;

    public PessoaFisica() {

    }

    public PessoaFisica(String cpf, Date dataCriacao, String nome) {
        super(nome);
        this.cpf = cpf;
        this.dataNascimento = dataCriacao;
    }

    @Override
    public boolean validarDocumento() {

        if (this.cpf.length() == 14) {
            return true;
        }
        return false;

    }

    @Override
    public int calcularIdade() {
        Date d = new Date();
        long dMil = Math.abs(this.getDataNascimento().getTime() - d.getTime());
        long diff = TimeUnit.DAYS.convert(dMil, TimeUnit.MILLISECONDS);
        int idade =(int) diff/365;
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataCriacao) {
        this.dataNascimento = dataCriacao;
    }

    @Override
    public String toString() {
        return "Pessoa Fisica=>  Nome: " + getNome() + " / CPF: " + cpf + " / DataNascimento: " + formato.format(dataNascimento);
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
        final PessoaFisica other = (PessoaFisica) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
    
    

}
