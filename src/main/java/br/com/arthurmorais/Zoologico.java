package br.com.arthurmorais;

import br.com.arthurmorais.controller.Acoes;
import br.com.arthurmorais.domain.Animal;

public class Zoologico {
    public static void main(String[] args) {
        Acoes acoes = new Acoes();

        Animal leao = new Animal("Leão", acoes);
        Animal macaco = new Animal("Macaco", acoes);
        Animal elefante = new Animal("Elefante", acoes);


        leao.start();
        macaco.start();
        elefante.start();
    }
}
