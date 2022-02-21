package com.company;

public class Karyshkyr extends janybarlar implements Deystvie{
    public Karyshkyr(String name, int jashy) {
        super(name, jashy);
    }

    @Override
    public void deystie() {
        System.out.println("Карышкыр коенду кубалайт");
    }
}
