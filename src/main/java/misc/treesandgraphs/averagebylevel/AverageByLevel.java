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
        List<List<Integer>> listOfLevels = new ArrayList<>();
        getAveragesByLevel(tree, listOfLevels, 0);

        int[] output = new int[listOfLevels.size()];
        for (int i = 0; i < listOfLevels.size(); i++) {
            int sum = 0;
            for (int j = 0; j < listOfLevels.get(i).size(); j++) {
                sum += listOfLevels.get(i).get(j);
            }
            output[i] = sum / listOfLevels.get(i).size();
        }

        return output;
    }

    private static void getAveragesByLevel(TreeNode node, List<List<Integer>> listOfLevels, int currentLevel) {
        if(node == null)
            return;

        if(listOfLevels.size() == currentLevel) {
            List<Integer> elementsByLevel = new ArrayList<>();
            elementsByLevel.add(node.val);
            listOfLevels.add(elementsByLevel);
        } else {
            listOfLevels.get(currentLevel).add(node.val);
        }

        getAveragesByLevel(node.left, listOfLevels, currentLevel + 1);
        getAveragesByLevel(node.right, listOfLevels, currentLevel + 1);
    }

}
