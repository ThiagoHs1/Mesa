package com.anotation;

import com.anotation.thiagohs.anotacoes.Tabela;
import com.anotation.thiagohs.modelo.Usuario;

public class App {
    public static void main(String[] args) {
        // Verifica se a classe Usuario tem a anotação Tabela
        if (Usuario.class.isAnnotationPresent(Tabela.class)) {
            // Recupera a anotação Tabela da classe Usuario
            Tabela tabela = Usuario.class.getAnnotation(Tabela.class);
            // Imprime o nome da tabela
            System.out.println("Nome da tabela: " + tabela.nome());
        } else {
            System.out.println("A anotação 'Tabela' não está presente na classe 'Usuario'.");
        }
    }
}