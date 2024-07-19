import java.util.Scanner;
 
public class Solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        if(n%2==0){
            if(n==2){
            System.out.println("NO");}
            else{
                System.out.println("YES");
            }
        
        }
        else{
            System.out.println("NO");
        }
        
    }
}