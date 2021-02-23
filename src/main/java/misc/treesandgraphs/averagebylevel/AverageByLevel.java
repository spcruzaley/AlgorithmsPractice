package misc.treesandgraphs.averagebylevel;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AverageByLevel {

    /**
     * Complexity: O(N), due to we need to traverse all the tree in order to get the values and generate the averages by level
     * Space: O(D), where D is the tree depth, due to we're using a recursive method to build the level values
     *
     * @param tree
     * @return
     */
    public static int[] getAveragesByLevel(TreeNode tree) {
        List<Integer[]> listOfLevels = new ArrayList<>();
        getAveragesByLevel(tree, listOfLevels, 0);

        int[] output = new int[listOfLevels.size()];
        for (int i = 0; i < listOfLevels.size(); i++) {
            Integer[] sumAndElements = listOfLevels.get(i);
            output[i] = sumAndElements[0] / sumAndElements[1];
        }

        return output;
    }

    private static void getAveragesByLevel(TreeNode node, List<Integer[]> listOfLevels, int currentLevel) {
        if(node == null)
            return;

        if(listOfLevels.size() == currentLevel) {
            listOfLevels.add(new Integer[]{node.val, 1});
        } else {
            listOfLevels.get(currentLevel)[0] += node.val;
            listOfLevels.get(currentLevel)[1] += 1;
        }

        getAveragesByLevel(node.left, listOfLevels, currentLevel + 1);
        getAveragesByLevel(node.right, listOfLevels, currentLevel + 1);
    }

}
