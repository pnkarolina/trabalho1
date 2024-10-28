package model;

public class Aprendiz extends Sith {

    public Aprendiz(String nome, int vida) {
        super(nome, vida);
        setForca(40);
    }

    private void setForca(int forca) {
        this.forca = forca;
    }
}
