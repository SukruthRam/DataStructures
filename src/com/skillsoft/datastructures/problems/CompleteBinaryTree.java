package com.skillsoft.datastructures.problems;

import com.skillsoft.datastructures.binaryTree.Node;

public class CompleteBinaryTree {

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

            b.setRc(g);
            c.setLc(d);
            c.setRc(e);

            if(isComplete(a, 0, countNodes(a)))
                System.out.println("True");
            else
                System.out.println("False");

    }

    public static <T> int countNodes(Node<T> root)
    {
        if(root == null)
        {
            return 0;
        }

        return  1 + countNodes(root.getLc()) + countNodes(root.getRc());
    }

    public static <T> boolean isComplete(Node<T> root, int index, int tn)
    {
        if(root == null)
        {
            return true;
        }

        if(index >= tn)
        {
            return false;
        }

        int li = 2 * index + 1;
        int ri = 2 * index + 2;

        return isComplete(root.getLc(), li, tn) && isComplete(root.getRc(), ri, tn);
    }

}
