import java.util.Scanner;
import java.util.Stack;

public class SoalNomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        for (int z = 0; z < kata.length(); z++) {
            stack.push(kata.charAt(z));
        }

        System.out.print("Hasilnya: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println();
    }
}