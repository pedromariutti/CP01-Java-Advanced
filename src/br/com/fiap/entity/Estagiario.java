package br.com.fiap.entity;

import br.com.fiap.annotation.Descricao;
import javax.persistence.Entity;

@Entity
@Descricao(descricao = "TAB_ESTAGIARIO")
public class Estagiario extends Funcionario {

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 0.8;
    }

    @Override
    public String imprimirInformacao() {
        return "[ESTAGIÁRIO] " + super.imprimirInformacao();
    }
}