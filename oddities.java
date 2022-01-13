import java.util.Scanner;
public class oddities {
    
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();

        int x = 0;
        while(x < num){
            
            int cur = sc.nextInt();
            if(cur % 2 == 0){
                System.out.println(cur + "is even");
            }
            else {
                System.out.println(cur + "is odd");
            }
        }
    }
    
}
