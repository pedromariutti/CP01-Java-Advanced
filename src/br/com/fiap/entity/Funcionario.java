package br.com.fiap.entity;

import br.com.fiap.annotation.Descricao;
import javax.persistence.*;

@Entity
@Descricao(descricao = "TAB_FUNCIONARIO")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    public double calcularSalario() {
        return this.horasTrabalhadas * this.valorHora;
    }

    public String imprimirInformacao() {
        return "Funcionário: " + this.nome +
                "Salário Final: R$ " + calcularSalario();
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getHorasTrabalhadas() { return horasTrabalhadas; }
    public void setHorasTrabalhadas(int horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas; }
    public double getValorHora() { return valorHora; }
    public void setValorHora(double valorHora) { this.valorHora = valorHora; }
}