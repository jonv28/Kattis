import java.util.Arrays;
import java.util.Scanner;
public class Narrow_Art_Gallery {

    private static int[][][] dp_table;
    private static int[][] rooms;
    
    public static int DP(int row, int col, int k){

        if (k <= 0){
            return 0;
        }
        if(row < 0){
            return 5000000; 
        }

        if (dp_table[row][col][k] != -1){
            return dp_table[row][col][k];
        }

        int value = rooms[row][col];


        dp_table[row][col][k] = Math.min(DP(row - 1, col, k - 1) + value, Math.min(DP( row - 1, 0, k), DP(row - 1, 1, k)));

        return dp_table[row][col][k];

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total_row = sc.nextInt();
        int k = sc.nextInt();
        rooms = new int[total_row][2];
        dp_table = new int[total_row][2][k+1];
        for(int[][] row: dp_table){
            for(int[] cur: row){
                Arrays.fill(cur, -1);
            }
        }
        int row = 0; 
        int total_value = 0;
        while(row < total_row){
            int num = sc.nextInt();
            total_value += num;
            rooms[row][0] = num;
            num = sc.nextInt();
            total_value += num;
            rooms[row][1] = num;
            row ++;
        }

        sc.nextInt();
        sc.nextInt();

        System.out.println(total_value - Math.min(DP(total_row - 1, 0, k), DP(total_row - 1, 1, k)));

    }
    
}
