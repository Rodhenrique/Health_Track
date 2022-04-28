import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import Classes.Alimento;
import Classes.AlimentoConsumido;
import Classes.AtividadeFisica;
import Classes.Cliente;
import Classes.ClienteRotinaAlimentacao;
import Classes.ClienteRotinaExercicio;
import Classes.Exercicio;
import Classes.Parceiro;
import Classes.Peso;
import Classes.PressaoArterial;
import Classes.RotinaAlimentacao;
import Classes.RotinaExercicio;
import Enums.Genero;
import Enums.TipoAlimento;
import Enums.TipoExercicio;
import Enums.TipoParceiro;

public class Teste {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente(1,"Eduarda","Santana Amaral","Rua Santos Amorim, 123",LocalDateTime.now(),"eduarda@email.com",Genero.Feminino,3,(float) 1.62,"duda123","123456789");
        cliente.Adicionar(cliente);

        Parceiro parceiro = new Parceiro(1, "Pedro", "Silva", "Rua Capim Doce, 321", LocalDateTime.now(), Genero.Masculino, TipoParceiro.Educador_fisico, "Profissional da saude", "pedrozin", "pedro@email.com", "987654321");
        parceiro.Adicionar(parceiro);

        Alimento alimento = new Alimento(1,TipoAlimento.Abobora,"Saudavel",0,100,150, false);
        alimento.Adicionar(alimento);
        
        AlimentoConsumido consumido = new AlimentoConsumido(1, 1, 1, 0, 100, 240, LocalDateTime.now(), LocalDateTime.now());
        consumido.Adicionar(consumido);

        Exercicio exercicio = new Exercicio(1, TipoExercicio.Abdominal_grupado, "Fazer repeticoes para perder peso", LocalTime.parse("00:15:00.00"), 0, 130,false ,LocalDateTime.now(), LocalDateTime.now(), 1);
        exercicio.AdicionarExercicio(exercicio);

        AtividadeFisica atividadeFisica = new AtividadeFisica(1, LocalTime.parse("00:30:00.00"), 0, 200, LocalDateTime.now(), LocalDateTime.now(), 1, 1);
        atividadeFisica.Adicionar(atividadeFisica);

        Peso peso = new Peso(1, 65, LocalDateTime.now(), LocalDateTime.now(), 1);
        peso.Adicionar(peso);

        PressaoArterial arterial = new PressaoArterial(1, 10, 150, 130, 1, LocalDateTime.now(), LocalDateTime.now());
        arterial.Adicionar(arterial);

        List<Exercicio> exercicios = new ArrayList<Exercicio>();
        exercicio.setPrivado(true);
        exercicios.add(exercicio);
        RotinaExercicio rotinaExercicio = new RotinaExercicio(1, "Exercicios para perder peso", exercicios, 1);
        rotinaExercicio.Adicionar(rotinaExercicio);

        ClienteRotinaExercicio clienteRotinaExercicio = new ClienteRotinaExercicio(1, 1, 1);
        clienteRotinaExercicio.Adicionar(clienteRotinaExercicio);
        
        List<Alimento> alimentos = new ArrayList<Alimento>();
        alimento.setPrivado(true);
        alimentos.add(alimento);
        RotinaAlimentacao rotinaAlimentacao = new RotinaAlimentacao(1, "Dieta balanceada para comer saudavel", alimentos, 1);
        rotinaAlimentacao.Adicionar(rotinaAlimentacao);

        ClienteRotinaAlimentacao clienteRotinaAlimentacao = new ClienteRotinaAlimentacao(1, 1, 1);
        clienteRotinaAlimentacao.Adicionar(clienteRotinaAlimentacao);
    }
}
 