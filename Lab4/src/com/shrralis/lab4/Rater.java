package com.shrralis.lab4;

import com.shrralis.lab4.base.WorkerAbstract;

public class Rater extends WorkerAbstract {
    private double rate;

    public Rater(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double getHourly() {
        return 8 * 22 * rate;
    }

    @Override
    public double getCounted() {
        return rate * getWorkedHours();
    }

    @Override
    public String toString() {
        return "Rater{" +
                "\nworkedHours=" + getWorkedHours() +
                "\nrate=" + rate +
                "\nhourly=" + getHourly() +
                "\ncounted=" + getCounted() +
                "\n}";
    }
}
