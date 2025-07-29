import java.util.*;

public class Question21 {
    String name;

    public static void main(String[] args) {
        Question21 q = new Question21(); // 'name' is null by default

        Optional<String> n = Optional.ofNullable(q.name);

        System.out.println(
            n.orElseThrow(() -> new NullPointerException("Invalid employee: name is null"))
        );
    }
}