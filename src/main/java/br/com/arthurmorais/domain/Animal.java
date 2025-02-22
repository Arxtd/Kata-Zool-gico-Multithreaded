package br.com.arthurmorais.domain;

import br.com.arthurmorais.controller.Acoes;

public class Animal extends Thread {

    private String nome;
    private Acoes acoes;


    public Animal() {
    }

    public Animal(String nome, Acoes acoes) {
        this.nome = nome;
        this.acoes = acoes;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                '}';
    }


    @Override
    public void run() {
        try {
            acoes.comer(nome);
            acoes.brincar(nome);
            acoes.dormir(nome);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
