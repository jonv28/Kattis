import java.util.Scanner;

public class Pivot {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        int[] max = new int[size];
        int[] min = new int[size];
        int total = 0;
        for(int x = 0; x < size; x ++){
            nums[x] = sc.nextInt();
        }

        max[0] = nums[0];
        int max_num = nums[0];

        for(int i = 0; i < size; i ++){
            if(nums[i] > max_num){
                max_num = nums[i];
            }

            max[i] = max_num;
        }
        min[size - 1] = nums[size -1];
        int min_num = nums[size-1];
        for(int i = size -2; i >= 0; i --){
            if(nums[i] < min_num){
                min_num = nums[i];
            }
        min[i] = min_num;
        }

        for(int j = 0; j < size; j ++){
            if(max[j] <= nums[j] && nums[j] <= min[j]){
                total ++;
            }
        }
        System.out.println(total);
        sc.close();
    }

}
