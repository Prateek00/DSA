package learning.learnDSA.array;

public class PassByReference {
    public PassByReference(){

    }

    public static void passArray(){
        Integer[] marks = new Integer[] {20,30,40 };
        PassByReference.printArray(marks);
    }

    public static void printArray(Integer[] array){
        for(Integer x : array){
            System.out.println(x.intValue());
        }
    }
}
