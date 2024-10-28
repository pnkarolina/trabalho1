package model;

public class Forca {

    int forca;
    int vida;
    String genero;
    String nome;

    public Forca(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(int f) {
        System.out.println(nome + " atacou com força " + f);
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
