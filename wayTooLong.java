import java.util.Scanner;

public class wayTooLong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine(); // Consume the newline character
 
        String[] words = new String[n];
 
        for (int i = 0; i < n; i++) {
            words[i] = scan.nextLine();
        }
 
        for (int i = 0; i < n; i++) {
            String str = words[i];
            if (str.length() <= 10) {
                System.out.println(str);
            } else {
                int count = str.length() - 2;
                String t = "" + str.charAt(0) + count + str.charAt(str.length() - 1);
                System.out.println(t);
            }
        }
    }
    
}
