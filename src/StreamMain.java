import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamMain {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder());

        public void printList () {
            stream.forEach(stream -> {
                System.out.print(stream);
                System.out.print(" ");
            });
        }

    }
