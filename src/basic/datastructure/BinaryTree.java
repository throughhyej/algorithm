package basic.datastructure;

import org.apache.poi.ss.formula.functions.T;

public class BinaryTree {

//    public static void main(String[] args) {
//        new BinaryTree().processBinaryTree();
//    }

    public void processBinaryTree() {
        Tree tree = new Tree();
        tree.add(100, "A");
        tree.add(300, "B");
        tree.add(200, "C");
        tree.add(500, "D");
        tree.add(400, "E");

        System.out.println("==========================================================");

        Object findValue1 = tree.get(200);
        System.out.println("## findValue1 > " +  findValue1 + " ========= END ==============");

        Object findValue2 = tree.get(400);
        System.out.println("## findValue2 > " +  findValue2 + " ========= END ==============");


    }

    public class Tree {
        TreeNode topNode = null;

        public void add(int key, Object value) {
            if (topNode == null) topNode = new TreeNode(key, value);
            else topNode.add(key, value);
        }

        public Object get(int key) {
            return topNode == null ? null : topNode.find(key);
        }
    }

    class TreeNode {
        private int itsKey;
        private Object itsValue;
        private TreeNode treeNodes[] = new TreeNode[2];

        public TreeNode(int key, Object value) {
            itsKey = key;
            itsValue = value;
        }

        public Object find (int key) {
            if (key == itsKey) return itsValue;
            else {
                Object sub = findSub(selectSubNode(key), key);
                System.out.println("sub.toString() = " + sub.toString());
                return sub;
            }
        }

        private int selectSubNode(int key) {
            return (key < itsKey) ? 0 : 1;
        }

        private Object findSub(int node, int key) {
            return treeNodes[node] == null ? null : treeNodes[node].find(key);
        }

        private void add(int key, Object value) {
            if (key == itsKey) itsValue = value;
            else SubNode(selectSubNode(key), key, value);
        }

        private void SubNode(int node, int key, Object value) {
            if (treeNodes[node] == null) treeNodes[node] = new TreeNode(key, value);
            else treeNodes[node].add(key, value);
        }
    }

}
