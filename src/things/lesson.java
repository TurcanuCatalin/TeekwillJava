package things;
import java.util.Optional;
public class lesson
{
    public static void main(String[] args) {
        Integer nr = 10;
        Integer nr2 = null;
        Optional<Integer> value = Optional.of(nr);
        Optional<Integer> value2 = Optional.ofNullable(nr2);
        System.out.println(value);
        System.out.println(value.orElse(0));
        System.out.println(value2.orElse(0));
    }
}
