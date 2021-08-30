import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {
        List<Integer> integers = List.of(15, 20, 17, 30);

        List<Integer> collect1 = integers.stream().filter(i -> i % 3 == 0).collect(Collectors.toList());
        List<Integer> collect2 = integers.stream().filter(i -> i % 3 == 0).collect(Collectors.toUnmodifiableList());

        collect1.add(45);
        //collect2.add(45); since collect2 is UnmodifiableList

        System.out.println(collect1);
        System.out.println(collect2);


    }
}
