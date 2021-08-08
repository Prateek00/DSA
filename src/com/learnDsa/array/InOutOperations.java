package com.learnDsa.array;

import java.io.*;


public class InOutOperations {

    public InOutOperations() {
    }

    public static float getAverage() throws IOException {
        File file = new File("/home/prateek/Documents/project/DSA/src/resource/input.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        float average = 0;
        if(bufferedReader.ready()){
            try {
                //List<Integer> m=  Arrays.stream(bufferedReader.readLine().trim().split(" ")).sequential().map(x->Integer.parseInt(x)).collect(Collectors.toList());
                String[] studentsMarksString =  bufferedReader.readLine().trim().split(" ");
                Integer[] studentMarks = new Integer[studentsMarksString.length];
                int i=0;
                int sum=0;
                for(String marks : studentsMarksString){
                    studentMarks[i++] = Integer.parseInt(marks);
                }
                for(int x : studentMarks){
                    sum+=x;
                }
                average = sum/studentsMarksString.length;
            }
            catch (Exception exception){
                System.out.println(exception.getMessage());
            }

        }
        else {
            System.out.println("Buffer is not ready");
        }

        bufferedReader.close();
        return average;
    }
}
