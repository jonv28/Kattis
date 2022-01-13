import java.util.Scanner;

public class Vaccumba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j = 0; j < n; j ++){
            int m = sc.nextInt();
            String[] s;
            double x = 0;
            double y = 0;
            double angle = 90;
            for(int i = 0; i < m; i ++){
                Double cur_angle = sc.nextDouble();
                Double distance = sc.nextDouble();
                angle = (angle + cur_angle) % 360;
                x += Math.cos(angle * Math.PI / 180) * distance;
                y += Math.sin(angle * Math.PI / 180) * distance;
            }
            System.out.println(x + " " + y);
        }

    }
    
}
