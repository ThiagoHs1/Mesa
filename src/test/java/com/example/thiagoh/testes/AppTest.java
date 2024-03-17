package com.example.thiagoh.testes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

    @Test
    public void testaSeTodosSaoMulheres() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", "Feminino"));
        pessoas.add(new Pessoa("Ana", "Feminino"));

        boolean somenteMulheres = pessoas.stream()
                .allMatch(p -> p.getSexo().equalsIgnoreCase("Feminino"));

        assertTrue(somenteMulheres, "A lista contém somente mulheres.");
    }

}
