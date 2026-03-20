package br.com.fiap.main;

import br.com.fiap.entity.Estagiario;
import br.com.fiap.entity.FuncionarioSenior;
import br.com.fiap.util.GeradorBanco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {
    public static void main(String[] args) {

        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle-fiap");
        EntityManager controle = fabrica.createEntityManager();

        // 1. CREATE (Salvar)

        System.out.println("SALVANDO REGISTROS");
        controle.getTransaction().begin();

        FuncionarioSenior senior = new FuncionarioSenior();
        senior.setNome("David Lynch");
        senior.setHorasTrabalhadas(45);
        senior.setValorHora(100.0);
        controle.persist(senior);

        Estagiario estagiario = new Estagiario();
        estagiario.setNome("Agnes Varda");
        estagiario.setHorasTrabalhadas(30);
        estagiario.setValorHora(50.0);
        controle.persist(estagiario); //

        controle.getTransaction().commit();

        System.out.println(senior.imprimirInformacao());
        System.out.println(estagiario.imprimirInformacao());

        // 2. READ (Buscar)
        System.out.println("\nLENDO ANOTAÇÕES)");
        GeradorBanco.gerarComandoBusca(senior);
        GeradorBanco.gerarComandoBusca(estagiario);

        // 3. UPDATE (Alterar)
        System.out.println("\nALTERANDO REGISTRO");
        controle.getTransaction().begin();

        FuncionarioSenior buscaDavid = controle.find(FuncionarioSenior.class, senior.getId());
        buscaDavid.setHorasTrabalhadas(60);

        controle.merge(buscaDavid);
        controle.getTransaction().commit();

        System.out.println("As horas do David Lynch foram alteradas.");
        System.out.println("Novo status: " + buscaDavid.imprimirInformacao());


        // 4. DELETE (Apagar)
        System.out.println("\n--- 4. DELETE (APAGANDO REGISTRO) ---");
        controle.getTransaction().begin();

        Estagiario buscaAgnes = controle.find(Estagiario.class, estagiario.getId());

        controle.remove(buscaAgnes);
        controle.getTransaction().commit();

        System.out.println("O registro do estagiário foi apagado com sucesso.");

        controle.close();
        fabrica.close();
    }
}