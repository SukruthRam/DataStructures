package com.skillsoft.datastructures.problems;

import com.skillsoft.datastructures.binaryTree.Node;

import java.util.HashMap;

public class BalancedBinaryTree {

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
        Node<String> i = new Node<>("I");
        Node<String> j = new Node<>("J");

        a.setRc(c);
        a.setLc(b);

        b.setLc(f);
        f.setLc(h);

        c.setLc(d);
        c.setRc(e);

        e.setRc(i);

        HashMap<Node<String>, Integer> map = new HashMap<>();
        if(isBalanced(a, map))
            System.out.println("True");
        else
            System.out.println("False");

    }

    private static <T> boolean isBalanced(Node<String> root, HashMap<Node<String>, Integer> map) {

        if(root == null)
        {
            return true;
        }

        boolean il = isBalanced(root.getLc(), map);
        boolean ir = isBalanced(root.getRc(), map);

        int lh = map.getOrDefault(root.getLc(), 0);
        int rh = map.getOrDefault(root.getRc(), 0);

        map.put(root, Math.max(lh,rh) + 1);

        if(Math.abs(lh - rh) <= 1)
        {
            return il && ir;
        }

        return false;

    }
}
