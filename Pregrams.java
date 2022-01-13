import java.util.ArrayList;
import java.util.Scanner;

public class Pregrams {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> remove = new ArrayList<>();
        String cur = sc.next();

        for(int i = 0; i < cur.length(); i ++){
            if(remove.contains(cur.substring(i, i + 1))){
                remove.remove(remove.indexOf(cur.substring(i, i + 1)));
            }

            else {
                remove.add(cur.substring(i, i + 1));
            }
        }

        if(remove.size() == 0){
            System.out.println(0);
        }
        else {
            System.out.println(remove.size() - 1);
        }
    }
}
