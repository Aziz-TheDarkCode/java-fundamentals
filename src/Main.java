
import ComputeArray.ComputeArray;
import Palindrome.Palindrome;
import Strings.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("ressasser"));
        System.out.println(Palindrome.isPalindrome("Bonjour"));
            int[] array = ComputeArray.computeArray(new int[]{9, 13, 8, 23, 1, 0, 89});
            for (int i : array) {
                System.out.print(i + " ");
            }

    }

}