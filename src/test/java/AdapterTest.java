package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdapterTest {

    @Test
    void deveAdaptarAInterfaceAntigaParaOPadraoDoSistema() {
        // Criamos o serviço incompatível
        ServicoExternoAudio servicoVelho = new ServicoExternoAudio();

        // Enfiamos ele dentro do adaptador que fala a nossa língua
        MediaPlayer player = new AudioAdapter(servicoVelho);

        // O sistema chama o método novo normalmente
        String resultado = player.tocar("In The End");

        // O adaptador garantiu que a chamada funcionasse lá atrás
        assertTrue(resultado.contains("Reproduzindo do serviço externo antigo"));
        assertTrue(resultado.contains("in_the_end.mp3"));
    }
}