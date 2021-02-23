package facebook.interviewpreparation.timed.queries;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class QueriesTest {

    @Test
    public void testAnswerQueries() {
        int[] expectedOutput = {-1, 2, -1, 2};

        int N = 5;
        ArrayList<Query> queries = buildQueries();
        int[] actualOutput = Queries.answerQueries(queries, N);

        System.out.println(Arrays.toString(actualOutput));
        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    private ArrayList<Query> buildQueries() {
        ArrayList<Query> list = new ArrayList<>();
        list.add(new Query(2,3));
        list.add(new Query(1,2));
        list.add(new Query(2,1));
        list.add(new Query(2,3));
        list.add(new Query(2,2));

        return list;
    }

}
