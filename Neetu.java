import java.util.*;
public class Neetu {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for(int i =1;i<=T;i++){
        int K = in.nextInt();
        int sum =0;
        for(int k =1;k<=K;k++){
            int var = in.nextInt();
            sum += var;
        }
        System.out.println(sum);
    }
    in.close();
}
}
   