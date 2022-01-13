import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Cryptographic_Keys {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num_zero = 0;
        int num_base = 0;
        ArrayList<Integer> list = get_primes(n); 
        for(int cur: list){
            if(cur > n)
                break;
            
            int zeros = 0;
            int quo = n;
            int rem = 0;
            while(true){
                rem = quo % cur;
                quo = quo/cur;
                if(rem ==0){
                    zeros += 1;
                }
                else{
                    break;
                }
            }
            if (zeros > num_zero){
                num_zero = zeros;
                num_base = cur;
            }
            
        }
        System.out.println(num_base);
    }


    static ArrayList<Integer> get_primes(int n){

        int i = 2;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(i * i <= n){
            if(!(n % i ==0)){
                i += 1;
            }

            else {
                n = n/i;
                list.add(i);
            }
        }
        if(n > 1) 
            list.add(n);
        return list;

    }

    
}
