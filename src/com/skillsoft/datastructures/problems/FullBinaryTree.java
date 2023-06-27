package com.skillsoft.datastructures.problems;

import com.skillsoft.datastructures.binaryTree.Node;

public class FullBinaryTree {
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
        b.setLc(i);
        if(isFull(a))
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static boolean isFull(Node<String> root)
    {
        if(root == null)
        {
            return true;
        }

        if(root.getLc() == null && root.getRc() == null)
        {
            return true;
        }
        if(root.getLc() != null && root.getRc() != null)
        {
            return isFull(root.getLc()) && isFull(root.getRc());
        }
        return false;
    }
}
