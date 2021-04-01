package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    letterAndNumbersSplitter(new File("src/input.txt"), new File("src/output.txt"));
    }

    private static void letterAndNumbersSplitter(File input, File output) throws IOException{
        Reader inFile = new FileReader(input);
        Writer outFile = new FileWriter(output);
        int summ = 0;
        StringBuilder outputString = new StringBuilder("");
        int c;
        while((c = inFile.read())!=-1){
            if(!Character.isDigit(c)){
                outputString.append(Character.toString(c));
            }
            else {
                summ += (int) c - 48;
            }
        }
        outFile.write(outputString.toString() + "\n" + summ);
        inFile.close();
        outFile.close();
    }
}
