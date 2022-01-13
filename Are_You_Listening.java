import java.util.Scanner;

public class Are_You_Listening {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cx = sc.nextInt();
        int cy = sc.nextInt();
        int n = sc.nextInt();
        int[][] circles = new int[n][3];
        for(int i = 0; i < n; i ++){
            circles[i][0] = sc.nextInt();
            circles[i][1] = sc.nextInt();
            circles[i][2] = sc.nextInt();
        }

        int r = 1;
        while(true){
            int touching = 0;
            for(int i = 0; i < n; i ++){
                if(touching(cx, cy, circles[i][0], circles[i][1], r, circles[i][2])){
                    touching += 1;
                }
            }
            if(touching >= 3){
                r -= 1;
                break;
            }
            else{
                r += 1;
            }
        }
        System.out.println(r);
    }
    

    static boolean touching(int x1, int y1, int x2,int y2, int r1, int r2){
        int distSq = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        int radSumSq = (r1 + r2) * (r1 + r2);

        if (distSq == radSumSq)
            return false;
        else if (distSq > radSumSq)
            return false;
        else
            return true;
    }
}
