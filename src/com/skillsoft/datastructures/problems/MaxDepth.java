package com.skillsoft.datastructures.problems;

import com.skillsoft.datastructures.binaryTree.Node;

public class MaxDepth {

    public static void main(String args[])
    {
        System.out.println("Hello world!");

        Node<Character> a = new Node<>('A');
        Node<Character> b = new Node<>('B');
        Node<Character> c = new Node<>('C');
        Node<Character> d = new Node<>('D');
        Node<Character> e = new Node<>('E');
        Node<Character> f = new Node<>('F');
        Node<Character> g = new Node<>('G');
        Node<Character> h = new Node<>('H');

        a.setLc(b);
        a.setRc(c);

        c.setLc(d);
        c.setRc(e);

        d.setLc(f);
        d.setRc(h);

        e.setRc(g);

        int num = maxDepth(a);
        System.out.print(num);
    }

    public static<T> int maxDepth(Node<T> root)
    {
        if(root == null)
        {
            return 0;
        }
        if(root.getLc() == null && root.getRc() == null)
        {
            return 0;
        }
        int x = maxDepth(root.getLc());
        int y = maxDepth(root.getRc());

        return 1 + Math.max(x,y);

    }
}
