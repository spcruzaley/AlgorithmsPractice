package microsoft.onsite.sibling;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSibling {

    public static Tree getSiblingTrue(Tree tree) {
        if(tree == null)
            return null;

        if(tree.sibling == null && tree.child == null)
            return tree.bol ? tree : null;

        Queue<Tree> queue = new LinkedList<>();

        while(tree != null) {
            if(tree.bol)
                return tree;

            if(tree.child != null)
                queue.add(tree.child);

            tree = tree.sibling;
        }
        return getSiblingTrue(queue.poll());
    }

}

class Tree {
    public char ch;
    public boolean bol;
    public Tree sibling;
    public Tree child;

    public Tree() {
    }

    public Tree(char ch, boolean bol, Tree silbing, Tree child) {
        this.ch = ch;
        this.bol = bol;
        this.sibling = silbing;
        this.child = child;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "ch=" + ch +
                ", bol=" + bol +
                ", sibling=" + sibling +
                ", child=" + child +
                '}';
    }
}