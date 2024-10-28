package model;

public class Padawan extends Jedi {

    public Padawan(String nome, int vida) {
        super(nome, vida);
        setForca(20);
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}
