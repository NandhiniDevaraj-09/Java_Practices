public class CeaserCipher{
public static void main(String [] args){
String a = "All the best";
int n = a.length();
for(int i=0; i<n; i++){
int b = a.charAt(i)-'0';
int c = b + 1;
System.out.print(c.charAt()+'0');
}
}
}

public class CeaserCipher {
    public static void main(String[] args) {
        String a = "All the best";
        String encrypted = "";

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            // Uppercase letters
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 1);
                if (ch > 'Z') {
                    ch = 'A';
                }
                encrypted += ch;
            }
            // Lowercase letters
            else if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch + 1);
                if (ch > 'z') {
                    ch = 'a';
                }
                encrypted += ch;
            }
            // Other characters (like space)
            else {
                encrypted += ch;
            }
        }

        System.out.println("Encrypted text: " + encrypted);
    }
}
