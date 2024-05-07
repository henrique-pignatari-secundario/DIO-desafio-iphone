package org.example;

import org.example.interfaces.AparelhoTelefonico;
import org.example.interfaces.NavegadorInternet;
import org.example.interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("Ligando do meu iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo do meu iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando um correio de voz do meu iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina do meu iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba do meu iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina do meu iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando do meu iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar do meu iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica do meu iphone");
    }
}
