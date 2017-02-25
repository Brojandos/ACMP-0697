import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 25.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int space = (input.nextInt() + input.nextInt()) * input.nextInt() * 2;
        System.out.println(space % 16 == 0 ? space / 16 : space / 16 + 1);
    }
}