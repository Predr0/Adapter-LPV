package org.example;

public class AudioAdapter implements MediaPlayer {
    private final ServicoExternoAudio servicoExterno;

    public AudioAdapter(ServicoExternoAudio servicoExterno) {
        this.servicoExterno = servicoExterno;
    }

    @Override
    public String tocar(String nomeMusica) {
        // O adaptador converte o formato de texto simples para a URL/Path que a classe velha exige
        String formatoPath = "http://api.legada.com/files/" + nomeMusica.toLowerCase().replace(" ", "_") + ".mp3";

        // Delega a execução real para o objeto incompatível
        return servicoExterno.streamAudioAntigo(formatoPath);
    }
}