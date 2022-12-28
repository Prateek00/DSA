package learning.learnDSA.array;

import learning.learnDSA.Helper;

import java.io.*;


public class InOutOperations {

    public InOutOperations() {
    }

    public static float getAverage() {
        float average = 0;
        try {
            File file = new File(Helper.INPUT_FILE_PATH);
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                if (bufferedReader.ready()) {
                    String[] studentsMarksString = bufferedReader.readLine().trim().split(" ");
                    Integer[] studentMarks = new Integer[studentsMarksString.length];
                    int i = 0;
                    int sum = 0;
                    for (String marks : studentsMarksString) {
                        studentMarks[i++] = Integer.parseInt(marks);
                    }
                    for (int x : studentMarks) {
                        sum += x;
                    }
                    average = sum / studentsMarksString.length;
                }
                else{
                    System.out.println("Buffer is not ready for read operation");
                }
                bufferedReader.close();
            }
            else {
                System.out.println("The file : " + Helper.INPUT_FILE_PATH + "does not exists");
            }

        } catch (FileNotFoundException fileNotFoundException) {

        } catch (IOException ioException) {

        } catch (Exception exception) {

        } finally {

        }

        return average;
    }
}
