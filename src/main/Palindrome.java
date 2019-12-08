import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Methods methods = new Methods();
        while(true) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            int len = methods.checkNumDigit(num);
//            System.out.println(len);
            int arr[] = methods.splitNum2(num, len);
//            System.out.println(Arrays.toString(arr));
            if(methods.IsOrNot(arr)) {
                System.out.println("本数字为回文数。");
            }else {
                System.out.println("本数字不是回文数。");
            }
        }

    }
}
