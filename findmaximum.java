public class findmaximum {
    
    public static void main(String[] args) {
        int num1 = 95;
        int num2 = 26;
        int num3 = 165;

        // Using if-else if-else statements
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the maximum number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the maximum number.");
        } else {
            System.out.println(num3 + " is the maximum number.");
        }
    
}
}
