package br.com.arthurmorais.controller;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Acoes {

    private Semaphore cuidadores = new Semaphore(2);

    public void comer(String animal) throws InterruptedException {
        cuidadores.acquire();
        System.out.println(animal + " está comendo 🍇");

        int tempo = ThreadLocalRandom.current().nextInt(2000, 5000);

        Thread.sleep(tempo);
        System.out.println(animal + " está cheio");

        cuidadores.release();
    }

    public void dormir(String animal) throws InterruptedException {
        System.out.println(animal + " está dormindo 😴😴");

        int tempo = ThreadLocalRandom.current().nextInt(5000, 10000);
        Thread.sleep(tempo);

        System.out.println(animal + " acordou");
    }

    public void brincar(String animal) throws InterruptedException {
        System.out.println(animal + " está brincando ⚽");
        int tempo = ThreadLocalRandom.current().nextInt(10000, 15000);
        Thread.sleep(tempo);
        System.out.println(animal + " cansou de brincar");
    }
}
