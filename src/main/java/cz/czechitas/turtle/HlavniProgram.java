package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.
    nakresliMasinku();
    zofka.penUp();
    zofka.move(250);
    zofka.turnRight(90);
    zofka.penDown();
    nakresliSnehulaka();
    zofka.turnLeft(90);
    zofka.penUp();
    zofka.move(250);
    zofka.turnLeft(90);
    zofka.move(200);
    zofka.turnRight(180);
    zofka.penDown();
    nakresliZmrzlinu(60);
    }


    public void nakresliTrojuholnik(double delkaStrany){
        zofka.move(delkaStrany);
        for (int i = 0; i <2; i++) {
            zofka.turnRight(120);
            zofka.move(delkaStrany);
        }
    }

    public void nakresliObdelink(double delkaStranyA, double delkaStranyB) {
        for (int i = 0; i <2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }
    }

    public void nakresliKruh(double polomer) {
        int pocetSegmentu = 360;

        for (int i = 0; i < pocetSegmentu; i++) {
            zofka.move(polomer * 2 * Math.PI / pocetSegmentu);
            zofka.turnRight(360.0 / pocetSegmentu);
        }
    }

    public void nakresliPravouhlyTrojuhelnik(double velikostStrany) {
        var velikostPrepony = Math.sqrt(2 * Math.pow(velikostStrany, 2));
        zofka.move(velikostStrany);
        zofka.turnRight(135);
        zofka.move(velikostPrepony);
        zofka.turnRight(135);
        zofka.move(velikostStrany);
        zofka.turnRight(90);
    }

    public void nakresliMasinku () {
        nakresliObdelink(60,150);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnLeft(90);
        nakresliObdelink(160,100);
        nakresliKruh(50);
        zofka.penUp();
        for (int i=0; i<2; i++) {
            zofka.turnLeft(90);
            zofka.move(20);
        }
        zofka.penDown();
        nakresliKruh(20);
        zofka.penUp();
        for (int i=0; i<2; i++) {
            zofka.turnLeft(90);
            zofka.move(20);
        }
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.penDown();
        nakresliKruh(20);
        zofka.penUp();
        for (int i=0; i<2; i++) {
            zofka.turnLeft(90);
            zofka.move(20);
        }
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.penDown();
        nakresliPravouhlyTrojuhelnik(60);
    }

    public void nakresliSnehulaka() {
        nakresliKruh(80);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(140);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliKruh(60);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKruh(20);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKruh(20);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliKruh(30);
        zofka.penUp();
    }

    public void nakresliZmrzlinu(double polomer) {
        nakresliKruh(polomer);
        zofka.turnRight(90);
        nakresliTrojuholnik(2*polomer);
    }
}
