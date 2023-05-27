package RedesSociais;

import RedesSociais.Interfaces.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {
    @Override
    public void compartilhamento() {
        System.out.println("Compartilhou um post no Twitter!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Twitter!");
    }

}

