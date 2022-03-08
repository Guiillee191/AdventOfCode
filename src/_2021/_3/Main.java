package _2021._3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> data=parser();

        System.out.println();
    }

    public static ArrayList<Integer> parser(){
        ArrayList<Integer> tmp = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "./inputs/input3.txt"));
            String line = reader.readLine();
            while (line != null) {
                tmp.add(Integer.parseInt(line, 2));
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tmp;
    }
}
