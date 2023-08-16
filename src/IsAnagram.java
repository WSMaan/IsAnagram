import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String s = scanner.nextLine();
        String s1 = scanner.next();
        System.out.println(isAnagram(s, s1));
        scanner.close();
    }

    public static boolean isAnagram(String s, String s1) {
        char sArr[] = s.toCharArray();
        char s1Arr[] = s1.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(s1Arr);
        return Arrays.equals(sArr, s1Arr);
    }

}


