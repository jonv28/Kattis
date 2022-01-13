import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exact_Change {

    public static int dp[][]; 
    public static boolean checker[][];

    public static int dp(int [] coins, int curCoin, int remMoney){

        if(!checker[curCoin][remMoney]){
            if(remMoney == 0){
                dp[curCoin][remMoney] = 0;
            }
    
            else if (curCoin == coins.length){
                dp[curCoin][remMoney] = 12345678;
            }
            
            else if(coins[curCoin] <= remMoney){
                dp[curCoin][remMoney] = Math.min(dp(coins, curCoin + 1, remMoney), 1 + dp(coins, curCoin + 1, remMoney - coins[curCoin]));
            }
    
            else if (coins[curCoin] > remMoney){
                dp[curCoin][remMoney] = dp(coins, curCoin + 1, remMoney);
            }
            checker[curCoin][remMoney] = true;
        }
        return dp[curCoin][remMoney];


    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i = 0; i < testcases; i ++){
            int value = sc.nextInt();
            int NumCoins = sc.nextInt();
            int money[] = new int[NumCoins];

            for(int j = 0; j < NumCoins; j ++){
                money[j] = sc.nextInt();
            }

            dp = new int [NumCoins + 1][10001];
            checker = new boolean [NumCoins +1][10001];

            for(int [] level : dp){
                Arrays.fill(level, 12345678);
            }

            for(int k = value; k < dp[NumCoins].length; k ++){
                if(dp(money,0,k) != 12345678){
                    System.out.println(k + " " + dp(money,0,k));
                    break;
                }
            }
        }
        
    }
    
}
