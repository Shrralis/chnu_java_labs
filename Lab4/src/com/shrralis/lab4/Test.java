package com.shrralis.lab4;

import com.shrralis.lab4.base.WorkerAbstract;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList<WorkerAbstract> workers = new ArrayList<>();

        workers.add(new Rater(3000));
        workers.add(new Hourler(30));

        File file = new File("workers.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        for (WorkerAbstract w : workers) {
//            bw.
        }
    }
}
