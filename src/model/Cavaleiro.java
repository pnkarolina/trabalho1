package model;

public class Cavaleiro extends Jedi {

    public Cavaleiro(String nome, int vida) {
        super(nome, vida);
        setForca(70);
    }

    private void setForca(int forca) {
        this.forca = forca;
    }
}
