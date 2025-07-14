import java.sql.SQLOutput;

public class MainApp {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Florianópolis", "SC");

        // Paciente cria seu próprio endereço internamente
        Paciente paciente = new Paciente("João Silva", "123.456.789-00", "Rua das Flores", cidade);

        Medico medico = new Medico("Dra. Maria", "987.654.321-00", "Cardiologia", "CRM123456");

        Consulta consulta1 = new Consulta("2024-12-10", "10:00", medico, paciente, Prioridade.ALTA, StatusConsulta.AGENDADA);
        Consulta consulta2 = new Consulta("2024-12-15", "15:00", medico, paciente, Prioridade.MEDIA, StatusConsulta.REALIZADA);
        // Paciente agenda consultas
        //paciente.agendarConsulta("2024-12-10", "10:00", medico, Prioridade.ALTA);
        //paciente.agendarConsulta("2024-12-15", "15:00", medico, Prioridade.MEDIA);

        // Exibir informações
        System.out.println("Informações do paciente e suas consultas:");
        paciente.exibirInformacoes();
        for (Consulta consulta : paciente.getConsultas()) {
            System.out.println(" - Consulta: " + consulta.getDataConsulta() + ", " + consulta.getHorario() +
                    ", Médico: " + consulta.getMedico().getNome() +
                    ", Prioridade: " + consulta.getPrioridade() +
                    ", Status: " + consulta.getStatusConsulta());
        }

        System.out.println("\nInformações do médico e suas consultas:");
        medico.exibirInformacoes();
        for (Consulta consulta : medico.getConsultas()) {
            System.out.println(" - Consulta: " + consulta.getDataConsulta() + ", " + consulta.getHorario() +
                    ", Paciente: " + consulta.getPaciente().getNome() +
                    ", Prioridade: " + consulta.getPrioridade() +
                    ", Status: " + consulta.getStatusConsulta());
        }

        //print(consulta1);
        //print(consulta2);

        //printConsultas(medico1);

    }

    public static void print(Consulta consulta) {
        System.out.println("******* DADOS DA CONSULTA *******");
        System.out.println("Médico...................: " + consulta.getMedico().getNome());
        System.out.println("Paciente.................: " + consulta.getPaciente().getNome());
        System.out.println("Cidade do paciente.......: " +
                consulta.getPaciente().getEndereco().getCidade().getNome());
        System.out.println("Data.....................: " + consulta.getDataConsulta());
        System.out.println("Horário..................: " + consulta.getHorario());
        System.out.println("Prioridade...............: " + consulta.getPrioridade());
        System.out.println("Status da Consulta.......: " + consulta.getStatusConsulta());
        System.out.println("=================================");
    }

    public static void printConsultas(Medico medico) {
        System.out.println("****** CONSULTAS DO MEDICO ******");
        System.out.println("Nome: " + medico.getNome());
        if (medico.getConsultas().isEmpty()) {
            System.out.println("Nenhuma consulta realizada pelo médico.");
        } else {
            for (Consulta consulta : medico.getConsultas()) {
                System.out.println("Paciente.................: " + consulta.getPaciente().getNome());
                System.out.println("Cidade do paciente.......: " +
                        consulta.getPaciente().getEndereco().getCidade().getNome());
                System.out.println("Data.....................: " + consulta.getDataConsulta());
                System.out.println("Horário..................: " + consulta.getHorario());
                System.out.println("Prioridade...............: " + consulta.getPrioridade());
                System.out.println("Status da Consulta.......: " + consulta.getStatusConsulta());
                System.out.println();
            }
        }

    }
}
