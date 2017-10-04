package com.shrralis.lab4;

import com.shrralis.lab4.base.WorkerAbstract;
import org.json.simple.JSONObject;

public class Rater extends WorkerAbstract {
    private double rate;

    public Rater(double rate) {
        this.rate = rate;
    }

    public Rater(double rate, int workedDays) {
        setWorkedHours(workedDays);

        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double getHourlyRate() {
        return this.rate / 22 / 8;
    }

    @Override
    public double getCalculatedSalary() {
        return getHourlyRate() * getWorkedHours();
    }

    @SuppressWarnings("unchecked")
    @Override
    public JSONObject getJson() {
        JSONObject object = new JSONObject();

        object.put("type", "rater");
        object.put("worked_days", getWorkedHours());
        object.put("rate", getRate());
        object.put("hourly_rate", getHourlyRate());
        object.put("calculated_salary", getCalculatedSalary());
        return object;
    }

    @Override
    public String toString() {
        return "Rater{" +
                "\nworkedHours=" + getWorkedHours() +
                "\nrate=" + rate +
                "\nhourlyRate=" + getHourlyRate() +
                "\ncalculatedSalary=" + getCalculatedSalary() +
                "\n}";
    }
}
