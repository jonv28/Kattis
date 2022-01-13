import java.util.Arrays;
import java.util.Scanner;
public class Birds_On_A_Wire {

    

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int[] places = new int[n];

        if(l <= 12){
            System.out.println(0);
        }

        else{
            int total = 0;
            if(n == 0){
                int usuable = l - 12;
                total = usuable/d + 1;
            }

            else {
                int x = 0;
                while(x < n){
                    places[x] = sc.nextInt();
                    x ++;
                }

                Arrays.sort(places);
                int rightUsable = (l - 6) - places[places.length - 1];
                int leftUsable = places[0] - 6;

                total += leftUsable/d;
                total += rightUsable/d;

                x = 0;
                while( x < n - 1){
                    int betweenUsable = places[x + 1] - places[x];
                    total += betweenUsable/ d - 1;
                    x ++; 
                }

            }
            System.out.println(total);
        }
    
    }
}
