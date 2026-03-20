package br.com.fiap.entity;

import br.com.fiap.annotation.Descricao;
import javax.persistence.Entity;

@Entity
@Descricao(descricao = "TAB_FUNC_SENIOR")
public class FuncionarioSenior extends Funcionario {

    @Override
    public double calcularSalario() {
        double valorBase = super.calcularSalario();
        int quantidadeBonus = getHorasTrabalhadas() / 15;
        double valorExtra = quantidadeBonus * 200.0;

        return valorBase + valorExtra;
    }

    @Override
    public String imprimirInformacao() {
        return "[SÊNIOR] " + super.imprimirInformacao();
    }
}