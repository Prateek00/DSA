package com.learnDsa;

import com.learnDsa.array.InOutOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Helper.OUTPUT_FILE_PATH));
            Float average =  InOutOperations.getAverage();
            bufferedWriter.write(average.toString());
            bufferedWriter.close();
        }
        catch (Exception exception){
            System.out.println("Exception occured : {} " + exception.getMessage());

        }
        finally {

        }


    }
}
