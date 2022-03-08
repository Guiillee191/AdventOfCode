package _2021._2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> data = parser();
        int horizontalPos=0;
        int depth=0;
        for (String s:data) {
            String tmp[]=s.split(" ");
            switch (tmp[0]){
                case "forward":
                    horizontalPos+=Integer.parseInt(tmp[1]);
                    break;
                case "up":
                    depth-=Integer.parseInt(tmp[1]);
                    break;
                case "down":
                    depth+=Integer.parseInt(tmp[1]);
                    break;
            }
        }
        System.out.println(horizontalPos*depth);

        horizontalPos=0;
        depth=0;
        int aim=0;
        for (String s:data) {
            String tmp[]=s.split(" ");
            switch (tmp[0]){
                case "forward":
                    horizontalPos+=Integer.parseInt(tmp[1]);
                    depth+=aim*Integer.parseInt(tmp[1]);
                    break;
                case "up":
                    aim-=Integer.parseInt(tmp[1]);
                    break;
                case "down":
                    aim+=Integer.parseInt(tmp[1]);
                    break;
            }
        }
        System.out.println(horizontalPos*depth);
    }

    public static ArrayList<String> parser(){
        ArrayList<String> tmp = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "./inputs/input2.txt"));
            String line = reader.readLine();
            while (line != null) {
                tmp.add(line);
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


