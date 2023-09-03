package learning.learnDSA.BrianAlgo;

public class Brian {
    public static int findSetBits(int n){
        int count=0;
        while(n > 0){
            n &= n-1;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int input = 11;
        System.out.println("Set bit is " + findSetBits(input));
    }


}
