import java.util.Scanner;
public class Moscow_Dream{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int n = sc.nextInt();

    if(n < 3){
        System.out.println("NO");
    }

    else if( a + b + c < n){
        System.out.println("NO");
    }

    else if(a < 1 | b < 1 | c < 1){
        System.out.println("NO");
    }
    else{
        System.out.println("YES");
    }

    


    }
}