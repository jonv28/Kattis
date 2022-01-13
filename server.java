import java.util.Scanner;

public class server {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int T = sc.nextInt();
        int total = 0;
        for(int i = 0; i < n; i ++){
            int cur = sc.nextInt();
            if(T - cur >= 0){
                T = T - cur;
                total += 1;
            }
            else{
                break;
            }
        }

        System.out.println(total);
    }
    
}
