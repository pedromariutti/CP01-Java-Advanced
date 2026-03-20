# Checkpoint 1 - Java Advanced: JPA & Annotations

Este projeto foi desenvolvido como requisito para a avaliação "Checkpoint 1" da disciplina de Java Advanced no curso de Análise e Desenvolvimento de Sistemas da FIAP. 

O objetivo principal da aplicação é demonstrar o domínio sobre persistência de dados utilizando a **Java Persistence API (JPA)** com o framework **Hibernate**, além de Orientação a Objetos, Annotations e Reflection API.

## 🚀 Tecnologias e Ferramentas Utilizadas
* **Java:** 
* **JPA / Hibernate:** 
* **Oracle SQL Developer:** Banco de dados relacional (Nuvem FIAP).
* **API Reflection:**
* **IntelliJ IDEA:** 

## ⚙️ Funcionalidades e Requisitos Atendidos
1. **Modelagem de Entidades e Polimorfismo:** Criação da classe base `Funcionario` e das subclasses `FuncionarioSenior` e `Estagiario`, cada uma com suas próprias regras de negócio para o cálculo de salário.
2. **Anotação Customizada:** Criação da anotação `@Descricao` (Runtime/Type) para mapear o nome das tabelas das entidades.
3. **Leitura via Reflection:** Implementação de um gerador automático que lê a anotação `@Descricao` da entidade instanciada e imprime no console o comando `SELECT * FROM [NomeDaTabela]`.
4. **Ciclo de Vida CRUD Completo:** A classe `Principal` executa as quatro operações fundamentais no banco de dados, evidenciando o código SQL gerado pelo Hibernate em cada etapa:
   * **C**reate (`persist`)
   * **R**ead (Simulado via Reflection e Select do BD)
   * **U**pdate (`merge`)
   * **D**elete (`remove`)
