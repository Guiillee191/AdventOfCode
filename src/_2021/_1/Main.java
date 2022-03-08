package _2021._1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> input = parser();
        int c=0;
        for (int i = 1; i < input.size(); i++) {
            if(input.get(i-1)<input.get(i)){
                c++;
            }
        }
        System.out.println(c);

        c=0;
        int m1=input.get(0)+input.get(1)+input.get(2);
        for (int i = 2 ; i < input.size(); i++) {
            int m2=input.get(i)+input.get(i-1)+input.get(i-2);
            if(m1<m2){
                c++;
            }
            m1=m2;
        }
        System.out.println(c);
    }

    public static ArrayList<Integer> parser(){
        ArrayList<Integer> tmp = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "./inputs/input1.txt"));
            String line = reader.readLine();
            while (line != null) {
                tmp.add(Integer.parseInt(line));
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
