import java.util.Scanner;

public class MirrorImageString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String mirrorImage = getMirrorImage(input);
        System.out.println("Mirror Image: " + mirrorImage);
    }
    
    public static String getMirrorImage(String str) {
        StringBuilder mirror = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            mirror.append(str.charAt(i));
        }
        return mirror.toString();
    }
}
