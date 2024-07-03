package Assignments;

public class EvenNumberofdigits {
    public static void main(String[] args) {

            int[] nums = {437,315,322,431,686,264,4428,8989};

                int result=0;
                //int a =0 ;
                for(int i=0;i<nums.length;i++){
                    int count =0;

                    if(nums[i] < 0){
                        nums[i] = nums[i] * -1;
                    }

                    while(nums[i] > 0){
                        count++;
                        nums[i] = nums[i] /10;

                    }

                    if((count % 2 )==0){
                        result++;
                    }


                }
        System.out.println(result);

            }

    }

