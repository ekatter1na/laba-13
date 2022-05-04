package com.metanit;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try(FileReader R = new FileReader("text.txt");
            FileWriter W = new FileWriter("read.txt")){
            int H;
            String kom = "";
            while((H = R.read()) != -1){
                kom = kom + (char)H;
            }

            String men = kom.replaceAll("\\//.+", "");
            String tar = men.replaceAll("/\\*(?s).*?\\*/", "");

            W.write(tar);
            W.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
