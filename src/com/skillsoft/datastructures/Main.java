package com.skillsoft.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
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

       // c.setLc(d);
        //c.setRc(e);

       // d.setLc(f);
        //d.setRc(h);

      //  e.setRc(g);

        //bfs(a);
        bfsWithPair(a);

    }

    public static <T> void bfs(Node<T> root)
    {
        if(root == null)
        {
            return;
        }

        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            Node<T> node = queue.remove();
            System.out.print(node.getData() +"==>");

            if(node.getLc() != null)
            {
                queue.add(node.getLc());
            }

            if(node.getRc() != null)
            {
                queue.add(node.getRc());
            }
        }

    }
    public static <T> void bfsWithPair(Node<T> root)
    {
        if(root == null)
        {
            return;
        }
        int level = 0;

        Queue<Pair<Node<T> ,Integer>> queue = new LinkedList<>();
        Pair rootPair = new Pair<>(root, level);
        queue.add(rootPair);

        while (!queue.isEmpty())
        {
            Pair<Node<T>, Integer> pair = queue.remove();
            System.out.print(pair +"==>");

            level = pair.getValue() + 1;

            Node<T> lc = pair.getKey().getLc();

            if(lc != null)
            {
                queue.add(new Pair(lc, level));
            }

            Node<T> rc = pair.getKey().getRc();

            if(rc != null)
            {
                queue.add(new Pair(rc, level));
            }
        }

    }

}