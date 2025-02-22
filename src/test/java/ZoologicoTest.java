import br.com.arthurmorais.controller.Acoes;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.concurrent.Semaphore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ZoologicoTest {

    @Test
     void testCuidadoresDisponiveis() throws InterruptedException {
        Acoes acoesZoologico = new Acoes();
        Semaphore cuidadores = new Semaphore(2);

        //Dois cuidadores no zoologico
        assertEquals(2, cuidadores.availablePermits());

        //Simulando um animal
        cuidadores.acquire();
        assertEquals(1, cuidadores.availablePermits());

        //Simulando outro animal
        cuidadores.acquire();
        assertEquals(0, cuidadores.availablePermits());

        //Libera um cuidador
        cuidadores.release();
        assertEquals(1, cuidadores.availablePermits());

    }

    @Test
    void testComer() throws InterruptedException {
        Acoes acoesZoologico = new Acoes();

        //Verifica se o método de comer está sendo chamado dentro do tempo e corretamente.
        long inicio = System.currentTimeMillis();
        acoesZoologico.comer("Leão");
        long fim = System.currentTimeMillis();

        long duracao = fim - inicio;

        assertTrue(duracao >= 2000 && duracao <= 5000, "Tempo de comer fora do esperado: " + duracao);
    }

    @Test
    void testeBrincar() throws InterruptedException {
        Acoes acoesZoologico = Mockito.spy(new Acoes());

        acoesZoologico.brincar("Macaco");

        //Verifica se o método brincar foi chamado pelo menos uma vez
        Mockito.verify(acoesZoologico, Mockito.atLeastOnce()).brincar("Macaco");
    }

    @Test
    void testeDormir() throws InterruptedException {
        Acoes acoesZoologico = Mockito.spy(new Acoes());

        acoesZoologico.dormir("Elefante");

        //Verifica se o método brincar foi chamado pelo menos uma vez
        Mockito.verify(acoesZoologico, Mockito.atLeastOnce()).dormir("Elefante");
    }

}
