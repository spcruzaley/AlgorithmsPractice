package microsoft.onsite.sibling;

import org.junit.Test;

public class TreeSiblingTest {

    @Test
    public void testGetSiblingTrue() {
        Tree t = generateTree();
        Tree actualTree = TreeSibling.getSiblingTrue(t);

        System.out.println(actualTree);
    }

    private static Tree generateTree() {
        Tree c = new Tree('c', false, null, null);
        Tree e = new Tree('e', false, null, null);
        Tree g = new Tree('g', false, null, null);
        Tree j = new Tree('j', true, null, null);

        Tree f = new Tree('f', false, g, null);
        Tree b = new Tree('b', false, c, f);

        Tree i = new Tree('i', false, j, null);
        Tree n = new Tree('n', false, i, null);

        Tree d = new Tree('d', false, e, n);

        Tree a = new Tree('d', false, b, d);

        return a;
    }

}
