package com.shrralis.lab4;

import com.shrralis.lab4.base.WorkerAbstract;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Test {

    public static void main(String[] args) throws IOException {
        ArrayList<WorkerAbstract> workers = new ArrayList<>();

        workers.add(new Rater(3000, 32));
        workers.add(new Hourler(30, 100));

        File file = new File("workers.txt");

        if (!file.exists()) {
            if (!file.createNewFile()) {
                System.err.println("Error with creating file!");
                System.err.println("Exiting...");
                return;
            }
        }

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        JSONArray array = new JSONArray();

        for (WorkerAbstract w : workers) {
            JSONObject o = w.getJson();

            o.put("id", workers.indexOf(w));
            array.add(o);
        }
        System.out.println(array.toJSONString());
        bw.write(array.toJSONString());
        bw.close();
        fw.close();
    }
}
