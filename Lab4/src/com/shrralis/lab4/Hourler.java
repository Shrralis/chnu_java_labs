package com.shrralis.lab4;

import com.shrralis.lab4.base.WorkerAbstract;
import org.json.simple.JSONObject;

public class Hourler extends WorkerAbstract {
    private double hourlyRate;

    public Hourler(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Hourler(double hourlyRate, int workedDays) {
        setWorkedHours(workedDays);

        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getCalculatedSalary() {
        return getWorkedHours() * getHourlyRate();
    }

    private double getSalary() {
        return this.hourlyRate * 22 * 8;
    }

    @SuppressWarnings("unchecked")
    @Override
    public JSONObject getJson() {
        JSONObject object = new JSONObject();

        object.put("type", "hourler");
        object.put("worked_days", getWorkedHours());
        object.put("hourly_rate", getHourlyRate());
        object.put("calculated_salary", getCalculatedSalary());
        return object;
    }

    @Override
    public String toString() {
        return "Hourler{" +
                "\nworkedDays=" + getWorkedHours() +
                "\nhourlyRate=" + hourlyRate +
                "\ncalculatedSalary=" + getCalculatedSalary() +
                "\n}";
    }
}
