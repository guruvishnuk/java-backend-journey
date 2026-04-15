
class Palindrome {

    public static void main(String[] args) {
        String str = "madam";

        String rev = new StringBuilder(str).reverse().toString();

        if (str.equals(rev)) {
            System.out.println("The given string is palindrome");
        } else {
            System.out.println("The given string is not palindrome");
        }
    }
}
