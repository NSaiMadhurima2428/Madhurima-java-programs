import java.util.Scanner;
class DiamondStar{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows(half of diamonds star):");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }

}