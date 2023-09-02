package learning.learnDSA.DutchNationalFlag;

public class DutchFlag {

    public int[] sortColor(int[] nums){
        int i=0;
        int j = nums.length;
        int temp;
        for(int k=0;k<nums.length;){
            if(nums[k]==0){
                temp = nums[i];
                nums[i] = nums[k];
                nums[k]= temp;
                i++;
                k++;
            }
            else if(nums[k]==2){
                temp = nums[j];
                nums[j]=nums[k];
                nums[k+1]=temp;
                j--;
            }
            else k++;

            if(k>j){
                break;
            }
        }
        return nums;
    }
}
