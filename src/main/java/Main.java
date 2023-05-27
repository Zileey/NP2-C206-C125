import RedesSociais.*;
import Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Facebook face = new Facebook();
        Twitter tweet = new Twitter();
        Instagram insta = new Instagram();
        GooglePlus morto = new GooglePlus();

        List<RedeSocial> redeSocials_u1 = null;
        try {
            redeSocials_u1 = new ArrayList<RedeSocial>();
            redeSocials_u1.add(face);
            redeSocials_u1.add(insta);
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e);
        }
        String nomeUser = null;
        String emailUser = null;
        System.out.println("Digite o nome do Usuário:");
        nomeUser = sc.nextLine();
        System.out.println("Digite o email do usuário:");
        emailUser = sc.nextLine();


//        RedeSocial[] listaDeRedes = new RedeSocial[2];
//
//        listaDeRedes[0] = insta;
//        listaDeRedes[1] = face;

        Usuario user1 = new Usuario(nomeUser, emailUser, redeSocials_u1);

        if (user1.getRedeSocials().get(0) instanceof Facebook) {
            Facebook facebook = (Facebook) user1.getRedeSocials().get(0);
            facebook.fazStreaming();
            facebook.compartilhamento();
            facebook.curtirPublicacao();
        }

        user1.getRedeSocials().get(1).postarVideo();
        user1.getRedeSocials().get(1).postarFoto();
        user1.getRedeSocials().get(1).postarComentario();

        sc.close();
    }
}
