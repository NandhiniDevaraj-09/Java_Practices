 public class BasicArmstrong {
    public static void main(String[] args) {
        int n = 153; 
        int temp = n;
        int sum = 0;
        int rem;
        int count = 0;
        int copy = n;
        while (copy != 0) {
            copy /= 10;
            count++;
        }
        while (n != 0) {
            rem = n % 10;
            sum += Math.pow(rem, count);
            n /= 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }
    }
}
