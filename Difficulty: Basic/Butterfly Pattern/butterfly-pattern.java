import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int st=1,sp=2*n-3;
        for(int i=1;i<=2*n - 1;i++){
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            int str = i==n ? st-1 : st;
            for(int j=1;j<=str;j++){
                System.out.print("*");
            }

            if(i<n)
            {
                st++;
                sp-=2;
            }
            else{
                st--;
                sp+=2;
            }
            
            System.out.println();
        }
        sc.close();
    }
}