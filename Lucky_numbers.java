import java.util.Scanner;
import java.math.BigInteger; 
public class Lucky_numbers {

    int num_lucky = 0;
    
    void Get_lucky(int n, BigInteger k, BigInteger number, boolean layer){
        int i;
        if(layer){
            i = 1;
        }
        else
        {
            i = 0;
        } 
        while(i <= 9){
            if(number.remainder(k).equals(new BigInteger("0"))){
                if(k.equals(new BigInteger(String.valueOf(n)))){
                    num_lucky += 1;
                }
                else{
                    Get_lucky(n, k.add(new BigInteger("1")), new BigInteger(number.toString() + "0"), false);
                }
            }
            number = number.add(new BigInteger("1"));
            i += 1;
        }
    }


    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          Lucky_numbers cur = new Lucky_numbers();
          cur.Get_lucky(n, new BigInteger("1"), new BigInteger("1"), true);
          System.out.println(cur.num_lucky);
    }

    
}
