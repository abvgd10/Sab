package com.company;

public class Koyon extends janybarlar implements Deystvie{
    public Koyon(String name, int jashy) {
        super(name, jashy);
    }

    @Override
    public void deystie() {
        System.out.println("Коен карышкырдан качат");
    }
}
