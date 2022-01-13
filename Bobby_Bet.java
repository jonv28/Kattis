import java.util.Scanner;

import javax.print.attribute.standard.Sides;

public class Bobby_Bet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int j = 0; j < n; j ++){
            double Value = sc.nextInt();
            double Sides = sc.nextInt();
            int successes = sc.nextInt();
            int trials = sc.nextInt();
            int winnings = sc.nextInt();
            
            double p = (Sides - Value + 1)/Sides;
            double p_win = 0;
            int fact_tri = fact(trials);
            for(int i = successes; i <= trials; i ++){
                int success_fact = fact(i);
                p_win += fact_tri/(success_fact * fact(trials - i))*Math.pow(p,i)*Math.pow(1-p, trials - i); 
            }
            
            if(p_win*(winnings - 1) - (1 - p_win) > 0){
                System.out.println("Yes");
            }
            else System.out.println("no");
        }
        
    }

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        else return n * fact(n-1);
    }
    
}
