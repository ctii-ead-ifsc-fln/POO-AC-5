import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa implements Agendavel {
    private Endereco endereco;
    private List<Consulta> consultas;

    public Paciente() {
    }

    public Paciente(String nome, String cpf, String rua, Cidade cidade ) {
        super(nome, cpf);
        this.endereco = new Endereco(rua, cidade);
        this.consultas = new ArrayList<>();
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void atualizarEndereco(String rua, Cidade cidade) {
        this.endereco = new Endereco(rua, cidade);
    }

    public void agendarConsulta(Consulta consulta) {
        //Consulta consulta = new Consulta(data, horario, medico, this, prioridade, StatusConsulta.AGENDADA);
        consultas.add(consulta);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Paciente: " + getNome() + ", CPF: " + getCpf() + ", Endereco: " + endereco);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + super.getNome() + '\'' +
                ", cpf='" + super.getCpf() + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
