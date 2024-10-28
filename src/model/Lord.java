package model;

public class Lord extends Sith {

    public Lord(String nome, int vida) {
        super(nome, vida);
        setForca(80);
    }

    private void setForca(int forca) {
        this.forca = forca;
    }
}
