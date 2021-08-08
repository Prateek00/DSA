package com.learnDsa;

import com.learnDsa.array.InOutOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/prateek/Documents/project/DSA/src/resource/Output.txt"));
        try {
            Float average =  InOutOperations.getAverage();
            bufferedWriter.write(average.toString());
        }
        catch (Exception exception){
            System.out.println("Exception occured : {} " + exception.getMessage());
        }
        finally {
            bufferedWriter.close();
        }


    }
}
