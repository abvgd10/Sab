package com.company;

public abstract class  janybarlar {
    private String name;
    private int jashy;

    public janybarlar(String name, int jashy) {
        this.name = name;
        this.jashy = jashy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJashy() {
        return jashy;
    }

    public void setJashy(int jashy) {
        this.jashy = jashy;
    }

    @Override
    public String toString() {
        return "janybarlar " +
                "name = " + name + '\'' +
                "  jashy = " + jashy +
                ' ';
    }
}
