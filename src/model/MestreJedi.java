package model;

import interfaces.Raios;

public class MestreJedi extends Jedi implements Raios {
    public MestreJedi(String nome, int vida) {
        super(nome, vida);
        setForca(100);
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void usarRaio() {
        System.out.println(nome + " está usando raios com força extra de " + forcaExtra);
    }
}
