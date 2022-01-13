import java.util.Scanner;

public class Growling_Gears {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i ++){
            int m = sc.nextInt();
            Double max = -Double.MAX_VALUE;
            int gear = 0;
            for(int j = 1; j <= m; j ++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                Double height = (Math.pow(b, 2))/(4*a) + c;
                if(height > max){
                    max = height;
                    gear = j;
                }
            }
            System.out.println(gear);
        }
    }
    
}
