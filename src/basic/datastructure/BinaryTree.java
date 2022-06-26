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
//            System.out.println("### topNode.itsKey > " + topNode.itsKey);
//            System.out.println("### treeNodes.length > " + topNode.treeNodes.length);
//            for (int i=0; i<topNode.treeNodes.length; i++) {
//                System.out.println("### node > " + i + " :: " + topNode.treeNodes[i]);
//            }
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
            return findSub(selectSubNode(key), key);
        }

        private int selectSubNode(int key) {
            return (key < itsKey) ? 0 : 1;
        }

        private Object findSub(int node, int key) {
//            if (node == 0) System.out.println("### node 0 key > " + key);
//            if (node == 1) System.out.println("### node 1 key > " + key);

            return treeNodes[node] == null ? null : treeNodes[node].find(key);
        }

        private void add(int key, Object value) {
            if (key == itsKey) itsValue = value;
            else SubNode(selectSubNode(key), key, value);
        }

        private void SubNode(int node, int key, Object value) {
            System.out.println("### node > " + node + " || " + key);
            if (treeNodes[node] == null) treeNodes[node] = new TreeNode(key, value);
            else treeNodes[node].add(key, value);
        }
    }

}
