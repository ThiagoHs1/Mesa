package com.anotation;

import com.anotation.thiagohs.anotacoes.Tabela;
import com.anotation.thiagohs.modelo.Usuario;

public class App {
    public static void main(String[] args) {
        if (Usuario.class.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = Usuario.class.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.nome());
        }
    }
}