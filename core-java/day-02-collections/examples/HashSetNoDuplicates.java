import java.util.HashSet;
import java.util.Set;


class HashSetNoDuplicates{
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet();
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);

        System.out.println("numbers: " + numbers);
    }
}