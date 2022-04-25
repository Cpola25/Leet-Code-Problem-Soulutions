

public class Solution {

    public static void main(String[] args) {
        int[] nums = {2,5, 5, 11};
        int x = 10;
        //idea #1 sort array from least to greatest
        //should return indexes 1 and 2. less than O(n^2)
        //  {4, 15, 20, 24} target 24
        printArray(returnIndexes(nums, x));

    }
        public static int[] returnIndexes(int[]  nums, int target){
            int[] indexes = new int[2];
            for(int i = 0; i < nums.length; i++){
                for(int j = i+1; j< nums.length;j++ ){

                    if(nums[i] + nums[j] == target){
                        indexes[0] = i;
                        indexes[1]=j;
                        i = nums.length;
                        break;
                    }

                }
            }
            return indexes;
        }

        public static void printArray(int[] array ){
                for(int i = 0; i< array.length; i++){
                    System.out.print(" "+ array[i] + " ");
                }

        }

}

