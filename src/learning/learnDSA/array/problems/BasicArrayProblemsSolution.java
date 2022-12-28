package learning.learnDSA.array.problems;

import java.util.Vector;

public class BasicArrayProblemsSolution {

    // array is sorted, using binary sort
    public static int getlowerBound(int[] arr, int number) {
        int low=0;
        int high=arr.length;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]==number)
                return number;
            else if(arr[mid]>number)
                high=mid-1;
            else
                low = mid+1;

        }

        //case when lower bound doesn't exist, return -1
        if(low==0)
            return -1;
        else
            return arr[high];

    }
}
