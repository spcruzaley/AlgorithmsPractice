package facebook.interviewpreparation.timed.queries;

import java.util.ArrayList;
import java.util.List;

public class Queries {

    /**
     * Complexity: O(QxN) where
     *      - Q its the length of the Queries, and
     *      - N its the length of the booleans array
     *
     * Space: O(N) in worst case
     *
     * @param queries
     * @param N
     * @return
     */
    public static int[] answerQueries(ArrayList<Query> queries, int N) {
        boolean[] array = new boolean[N];
        List<Integer> listOutput = new ArrayList<>();

        for (Query q : queries) {
            //For SET
            if (q.type == 1) {
                array[q.index - 1] = true;
            }
            //For GET
            else {
                int smallestIndex = 0;
                int startIndex = q.index - 1;

                do {
                    if (array[startIndex]) {
                        smallestIndex = startIndex;
                        break;
                    }
                    startIndex++;
                } while (startIndex < N);

                listOutput.add((smallestIndex == 0) ? -1 : smallestIndex+1);
            }
        }

        int[] output = new int[listOutput.size()];
        for (int i = 0; i < listOutput.size(); i++) {
            output[i] = listOutput.get(i);
        }

        return output;
    }

}

class Query {
    int type;
    int index;

    public Query(int type, int index) {
        this.type = type;
        this.index = index;
    }
}