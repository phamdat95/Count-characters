import java.util.Scanner;

public class countCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter characters: ");
        String str = "Pham The Dat";
        int count = 0;
        char character =scanner.next().charAt(0);
        for (int i = 0; i < str.length(); i++){
            if (character == str.charAt(i)){
                count = count + 1;
            }
        }
        System.out.println("String has " + count + " " + character);
    }
}
