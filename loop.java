import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int result = 0;
        for(int i=1;i<=10;i++){
            //System.out.format("%d x %d = %d \n",n,i,result);
            System.out.println(n + " x " + i + " = " + n*i);
        }
        sc.close();
    }
}
