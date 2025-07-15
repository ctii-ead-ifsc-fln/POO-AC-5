import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa implements Agendavel {
    private String especialidade;
    private String crm;

    private List<Consulta> consultas;

    public Medico() {
        consultas = new ArrayList<>();
    }

    public Medico(String nome, String cpf, String especialidade, String crm) {
        super(nome, cpf);
        this.especialidade = especialidade;
        this.crm = crm;
        consultas = new ArrayList<>();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Médico: " + getNome() + ", CRM: " + crm + ", Especialidade: " + especialidade);
    }

    public void agendarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", crm='" + crm + '\'' +
                '}';
    }
}
