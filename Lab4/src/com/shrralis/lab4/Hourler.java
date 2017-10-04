package com.shrralis.lab4;

import com.shrralis.lab4.base.WorkerAbstract;

public class Hourler extends WorkerAbstract {
    private double hourly;

    public Hourler(double hourly) {
        this.hourly = hourly;
    }

    public double getHourly() {
        return hourly;
    }

    public void setHourly(double hourly) {
        this.hourly = hourly;
    }

    @Override
    public double getCounted() {
        return getWorkedHours() * getHourlyRate();
    }

    private double getHourlyRate() {
        return hourly / 22 / 8;
    }

    @Override
    public String toString() {
        return "Hourler{" +
                "\nworkedDays=" + getWorkedHours() +
                "\nhourly=" + hourly +
                "\ncounted=" + getCounted() +
                "\n}";
    }
}
