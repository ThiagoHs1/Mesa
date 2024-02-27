package com.anotation.thiagohs.modelo;

import com.anotation.thiagohs.anotacoes.Tabela;

@Tabela(nome = "usuarios")
public class Usuario {
  private int id;
  private String nome;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}