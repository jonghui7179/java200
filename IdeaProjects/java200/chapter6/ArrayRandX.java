import java.util.Random;
import java.util.Scanner;

class ArrayRandX {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("요소 수:");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        a[0] = 1 + rand.nextInt(10);

        for(int i=1; i<n ; i++){
            do{
                a[i]=1+rand.nextInt(10);
            }while (a[i]==a[i-1]);
        }
        for(int i=0;i<n;i++)
            System.out.println("a["+i+"]="+a[i]);
    }
}