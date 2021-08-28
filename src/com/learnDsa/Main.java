package com.learnDsa;

import com.learnDsa.array.BasicArrayManipulation;
import com.learnDsa.array.InOutOperations;
import com.learnDsa.array.PassByReference;
import com.learnDsa.array.SearchAlgo;
import com.learnDsa.bitManipulation.BasicBitManipulations;
import com.learnDsa.recursion.BasicRecursionProblem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Helper.OUTPUT_FILE_PATH));
            //Float average =  InOutOperations.getAverage();
            //bufferedWriter.write(average.toString());
            //bufferedWriter.close();
            int[] ar = new int[] {1,2,9,4,5};
            BasicRecursionProblem.printSpiralSpell(2021);
            //System.out.println(BasicRecursionProblem.getPower(3,3));


            //PassByReference.passArray();
        }
        catch (Exception exception){
            System.out.println("Exception occured : {} " + exception.getMessage());

        }
        finally {

        }


    }
}
