import java.util.Scanner;
class ExpandString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        StringBuilder rev = new StringBuilder();
        int a= 1;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                a= ch - '0';
            } else {
                for (int j = 0; j < a; j++) {
                    rev.append(ch);
                }
            }
        }
        System.out.println("Output: " + rev.toString());
        sc.close();
    }
}