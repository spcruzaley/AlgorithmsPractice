package leetcode.premium.microsoft;

import common.Node;

import java.util.ArrayList;
import java.util.List;

public class PopulatingNextRightPointersInEachNode {

    public static Node connect(Node root) {
        List<List<Node>> mainList = new ArrayList<>();
        if(root != null)
            connect(root, mainList, 0);

        return root;
    }

    private static void connect(Node root, List<List<Node>> mainList, int level) {
        if(level >= mainList.size()) {
            List<Node> list = new ArrayList<>();
            list.add(root);
            mainList.add(list);
        } else {
            int curentSize = mainList.get(level).size();
            System.out.println("Level: " + level + " - Value: "+root.val+" - Size: " + curentSize);
            mainList.get(level).get(curentSize - 1).next = root;
            mainList.get(level).add(root);
        }

        if(root.left != null)
            connect(root.left, mainList, level+1);
        if(root.right != null)
            connect(root.right, mainList, level+1);
    }

}
