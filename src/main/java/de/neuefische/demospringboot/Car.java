package de.neuefische.demospringboot;

import java.util.Objects;

public class Car {

    private String nameHersteller;
    private int anzahlReifen;
    private boolean hatTuvPlakette;

    public Car(String nameHersteller, int anzahlReifen, boolean hatTüvPlakette) {
        this.nameHersteller = nameHersteller;
        this.anzahlReifen = anzahlReifen;
        this.hatTuvPlakette = hatTüvPlakette;
    }

    public String getNameHersteller() {
        return nameHersteller;
    }

    public int getAnzahlReifen() {
        return anzahlReifen;
    }

    public boolean isHatTüvPlakette() {
        return hatTuvPlakette;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return anzahlReifen == car.anzahlReifen && hatTuvPlakette == car.hatTuvPlakette && Objects.equals(nameHersteller, car.nameHersteller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameHersteller, anzahlReifen, hatTuvPlakette);
    }
}
