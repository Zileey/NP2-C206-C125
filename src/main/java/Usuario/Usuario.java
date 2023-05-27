package Usuario;

import RedesSociais.RedeSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;

    private List<RedeSocial> redeSocials = new ArrayList<RedeSocial>();

    public Usuario(String nome, String email,List<RedeSocial> redeSocials) {
        this.nome = nome;
        this.email = email;
        this.redeSocials = redeSocials;

    }

    public void addRedesSociais(RedeSocial redeSocial){
        redeSocials.add(redeSocial);
    }

    public List<RedeSocial> getRedeSocials() {
        return redeSocials;
    }

    public void setRedeSocials(List<RedeSocial> redeSocials) {
        this.redeSocials = redeSocials;
    }
}
