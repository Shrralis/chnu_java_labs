package com.shrralis.lab4.base;

import com.shrralis.lab4.base.interfaces.IBookKeepable;
import org.json.simple.JSONObject;

public abstract class WorkerAbstract implements IBookKeepable {
    private int workedHours;

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public abstract JSONObject getJson();
}
