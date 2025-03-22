package com.devjava.CadastroDeUsuarios;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity


public class UserModel {
     @Id
     Long id;
     String nome;
     String email;
     int idade;

    public UserModel() {
    }

    public UserModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
