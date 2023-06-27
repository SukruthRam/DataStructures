package com.skillsoft.datastructures.problems;

import com.skillsoft.datastructures.binaryTree.Node;

public class PerfectBinaryTree {

    public static void main(String args[])
    {
        Node<String> a = new Node<>("A");
        Node<String> b = new Node<>("B");
        Node<String> c = new Node<>("C");
        Node<String> d = new Node<>("D");
        Node<String> e = new Node<>("E");
        Node<String> f = new Node<>("F");
        Node<String> g = new Node<>("G");
        Node<String> h = new Node<>("H");


        a.setRc(c);
        a.setLc(b);

        if(isPerfect(a))
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static <T> boolean isPerfect(Node<T> root)
    {
        int leftDepth = getDepth(root);
        return isPerfectRecursive(root, leftDepth, 0);
    }

    private static <T> boolean isPerfectRecursive(Node<T> root, int leftDepth, int currentDepth) {

        if(root == null)
        {
            return true;
        }

        if(root.getLc() == null && root.getLc() == null)
        {
            return currentDepth == leftDepth;
        }

        if(root.getLc() == null || root.getRc() == null)
        {
            return false;
        }

        return isPerfectRecursive(root.getLc(), leftDepth, currentDepth + 1) &&
                isPerfectRecursive(root.getRc(), leftDepth, currentDepth + 1);
    }

    private static <T> int getDepth(Node<T> root) {

        int leftDepth = 0;
        Node<T> node = root;

        while(node != null)
        {
            leftDepth ++;
            node = node.getLc();
        }

        return leftDepth - 1;

    }
}
