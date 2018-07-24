import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PerfectNumbers {


    private static void multipliers(int number) {


        Set<Integer> set = IntStream.range(1, number)
                .boxed()
                .collect(Collectors.toSet());

       Set<Integer> result = set.stream()
                .filter(a->number%)
                .collect(Collectors.toSet());




//
//                Set<Integer> set = IntStream.range(0, 5)
//                .boxed()
//                .collect(Collectors.toSet());

    }




    public static void main(String[] args) {


    }


}
