package RedesSociais;

import RedesSociais.Interfaces.Compartilhamento;
import RedesSociais.Interfaces.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    @Override
    public void compartilhamento() {
        System.out.println("Compartilhou um post no Google Plus!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Google Plus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Google Plus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Google Plus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Está fazendo uma live-stream no Google Plus!");
    }
}
