package br.com.fiap.util;

import br.com.fiap.annotation.Descricao;

public class GeradorBanco {

    public static void gerarComandoBusca(Object alvo) {
        Class<?> tipoDoAlvo = alvo.getClass();

        if (tipoDoAlvo.isAnnotationPresent(Descricao.class)) {
            Descricao etiqueta = tipoDoAlvo.getAnnotation(Descricao.class);
            System.out.println("Comando gerado via Reflection: SELECT * FROM " + etiqueta.descricao());
        } else {
            System.out.println("Anotação @Descricao não encontrada na classe.");
        }
    }
}