import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int st = n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<st;j++)
            {
                System.out.print("*");
            }
            st--;
            System.out.println();
        }
        sc.close();
    }
}