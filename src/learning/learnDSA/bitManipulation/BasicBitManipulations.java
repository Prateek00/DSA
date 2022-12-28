package learning.learnDSA.bitManipulation;

public class BasicBitManipulations {

    public static void getTest(){
        int x=0;
        System.out.println(~x);
    }

    // iterating each bit O(log n)
    public static int getSetBitsCount(int key){
        int count=0;
        while(key > 0){
            count+=(key&1);
            key = key>>1;
        }
        return count;
    }

    // iterating to number of set bits, O(1), max 32 times.
    public static int getSetBitsCountByAndOp(int key){
        int ans=0;
        while (key >0){
            key = key & (key-1);
            ans++;
        }
        return ans;
    }

    public static int getExpo(int base,int expo){
        int ans = 1;
        while (expo>0){
            int last_bit=expo&1;
            if(last_bit==1){
                ans*=base;
            }
            base = base*base;
            expo=expo>>1;
        }
        return ans;
    }


}
