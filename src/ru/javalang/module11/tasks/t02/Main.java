package ru.javalang.module11.tasks.t02;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        int[] values=new int[];
        try {
            BufferedReader in = new BufferedReader(new FileReader("in.txt")); //InputStreamReader(System.in));
            int count = 0;
            for (String line = in.readLine(); line != null; line = in.readLine()) {
                values[count] = Integer.parseInt(line);
                count++;
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Some error occurred!");
        }

        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("out.bin"));
            for (int i = 0; i < values.length; i++) {
                out.writeInt(values[i]);
            }
            out.close();
        } catch (
                IOException e) {
            System.out.println("Some error occurred!");
        }
    }
}
