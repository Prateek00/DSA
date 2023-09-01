package learning.learnDSA;

import javafx.util.StringConverter;
import learning.learnDSA.recursion.BasicRecursionProblem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        try {
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Helper.OUTPUT_FILE_PATH));
            //Float average =  InOutOperations.getAverage();
            //bufferedWriter.write(average.toString());
            //bufferedWriter.close();
            //int[] ar = new int[] {1,2,9,4,5};
            //BasicRecursionProblem.printSpiralSpell(2021);
            //System.out.println(BasicRecursionProblem.getPower(3,3));


            //PassByReference.passArray();

            String regexString = "[]";

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String myDate = "2020-24-35 05:36:40";
            Date date = simpleDateFormat.parse(myDate);
            System.out.println(new Date());
            System.out.println(date);
//            // Lambda expression
//            //Consumer<String> lambda = s -> System.out.println(s);
//
//            // Method reference
//            Consumer<String> reference = System.out::println;
//
//            // Lambda expression
//            StringConverter converterLambda = str -> str.toUpperCase();
//
//        // Method reference
//            StringConverter converterReference = String::toUpperCase;
//
//            Predicate<>


        }
        catch (Exception exception){
            System.out.println("Exception occured : {} " + exception.getMessage());

        }
        finally {

        }


    }
}
