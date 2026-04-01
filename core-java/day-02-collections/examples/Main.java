
import java.util.HashMap;
import java.util.Map;

class User {

    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {

    public static void main(String[] args) {
        Map<Integer, User> usermap = new HashMap<>();

        usermap.put(1, new User(1, "Guruvishnu"));
        usermap.put(2, new User(2, "Satyarth"));

        User user = usermap.get(1);

        System.out.println("user1: " + user.name);

    }
}
