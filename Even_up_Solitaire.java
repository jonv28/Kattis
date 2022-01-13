import java.util.Scanner;
import java.util.Stack;

public class Even_up_Solitaire {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i ++){
            int cur = sc.nextInt();

            if(st.size() != 0 && (cur + st.peek()) % 2 == 0 ){
                st.pop();
            }
            else{
                st.push(cur);
            }
        }

        System.out.println(st.size());
    }
    
}
