import java.util.Scanner;

public class mixedfractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hasNext = true;
        while (hasNext) {
            int num1 = sc.nextInt(), num2 = sc.nextInt();
            if (num1>0 && num2<Math.pow(2, 31) && (num1 != 0 && num2 != 0)) {
                System.out.println((num1/num2) + " " + (num1%num2) + " / " + num2);
            } else {
                hasNext = false;
            }
        }
    }
}