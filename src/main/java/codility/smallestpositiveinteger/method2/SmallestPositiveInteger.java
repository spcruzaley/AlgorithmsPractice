package codility.smallestpositiveinteger.method2;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SmallestPositiveInteger {

    /**
     * TODO Investigate how to determine the complexity as I used Java 8 features
     *
     * Solution using Java8 mostly.
     *  Complexity: ¿?
     *  Space: ¿?
     *
     *  See (/src/test/java/codility/smallestpositiveinteger/method2/SmallestPositiveIntegerTest.java) for test cases
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {
        if(A.length == 1)
            return A[0] <= 0 ? 1 : A[0] - 1 == 0 ? 2 : A[0] - 1;

        Set<Integer> set = IntStream.of(A).boxed().collect(Collectors.toSet());
        int min = IntStream.of(A).min().getAsInt();
        int max = IntStream.of(A).max().getAsInt();

        List<Integer> list = IntStream
                .rangeClosed(min, max)
                .filter(x -> !set.contains(x))
                .boxed()
                .collect(Collectors.toList());

        int smallest = min > 1 ? min - 1 : max + 1;

        if(list.size() > 0) {
            smallest = list.stream().mapToInt(x -> x > 0 ? x : 1).min().getAsInt();
        }

        return smallest;
    }

}
