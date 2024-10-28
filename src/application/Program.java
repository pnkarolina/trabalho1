package application;

import model.*;

public class Program {

    public static void main(String[] args) {

        //testes

        Padawan padawan = new Padawan("Anakin", 100);
        Cavaleiro cavaleiro = new Cavaleiro("Obi-Wan", 150);
        MestreJedi mestreJedi = new MestreJedi("Yoda", 200);

        Aprendiz aprendiz = new Aprendiz("Darth Maul", 120);
        Lord lord = new Lord("Darth Vader", 180);
        MestreSith mestreSith = new MestreSith("Darth Sidious", 220);

        padawan.atacar(20);
        cavaleiro.atacar(70);
        mestreJedi.atacar(100);

        aprendiz.atacar(40);
        lord.atacar(80);
        mestreSith.atacar(120);
        mestreSith.usarRaio();
    }
}
