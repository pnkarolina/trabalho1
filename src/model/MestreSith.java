package model;

import interfaces.Raios;

public class MestreSith extends Sith implements Raios {

    public MestreSith(String nome, int vida) {
        super(nome, vida);
        setForca(120);
    }

    private void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void usarRaio() {
        System.out.println(nome + " está usando raios com força extra de " + forcaExtra);
    }
}
