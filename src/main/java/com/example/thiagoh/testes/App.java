package com.example.thiagoh.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        // Cria uma lista de pessoas
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", "Feminino"));
        pessoas.add(new Pessoa("João", "Masculino"));
        pessoas.add(new Pessoa("Ana", "Feminino"));

        // Filtra apenas as mulheres usando expressão lambda
        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());

        // Imprime o nome das mulheres
        mulheres.forEach(m -> System.out.println(m.getNome()));
    }
}
