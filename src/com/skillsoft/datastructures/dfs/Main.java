package com.skillsoft.datastructures.dfs;

import com.skillsoft.datastructures.binaryTree.Node;
import com.skillsoft.datastructures.binaryTree.Pair;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Main {

    public static void main(String args[])
    {
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

            // c.setLc(d);
            //c.setRc(e);

            // d.setLc(f);
            //d.setRc(h);

            //  e.setRc(g);

            //bfs(a);
            //inOrder(a);
            inOrderByRecursion(a);

        }
    }

    private static void inOrderByRecursion(Node<Character> root) {
        if(root == null )
        {
            return;
        }

        inOrderByRecursion(root.getLc());
        System.out.print(root.getData() + "=>");
        inOrderByRecursion(root.getRc());

    }

    private static void preOrderByRecursion(Node<Character> root) {
        if(root == null )
        {
            return;
        }

        System.out.print(root.getData() + "=>");
        inOrderByRecursion(root.getLc());
        inOrderByRecursion(root.getRc());

    }

    private static void postOrderByRecursion(Node<Character> root) {
        if(root == null )
        {
            return;
        }

        inOrderByRecursion(root.getLc());
        inOrderByRecursion(root.getRc());
        System.out.print(root.getData() + "=>");


    }

    private static <T> void inOrder(Node<T> root) {

        if(root == null )
        {
            return;
        }
        Set<Node<T>> visitedNodes = new HashSet<>();
        Stack<Node<T>> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty())
        {
            Node<T> top = stack.pop();
            if(top.getRc() == null && top.getLc() == null)
            {
                System.out.print(top.getData() + "=>");
            }
            else if(visitedNodes.contains(top))
            {
                System.out.print(top.getData() + "=>");
            }
            else
            {
                visitedNodes.add(root);
                if(root.getRc() != null)
                {
                    stack.push(root.getRc());
                }

                stack.push(root);

                if(root.getLc() != null)
                {
                    stack.push(root.getLc());
                }
            }
        }
    }

    private static <T> void preOrder(Node<T> root) {

        if(root == null )
        {
            return;
        }
        Set<Node<T>> visitedNodes = new HashSet<>();
        Stack<Node<T>> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty())
        {
            Node<T> top = stack.pop();
            if(top.getRc() == null && top.getLc() == null)
            {
                System.out.print(top.getData() + "=>");
            }
            else if(visitedNodes.contains(top))
            {
                System.out.print(top.getData() + "=>");
            }
            else
            {
                visitedNodes.add(root);
                if(root.getRc() != null)
                {
                    stack.push(root.getRc());
                }

                if(root.getLc() != null)
                {
                    stack.push(root.getLc());
                }

                stack.push(root);
            }
        }
    }

    private static <T> void postOrder(Node<T> root) {

        if(root == null )
        {
            return;
        }
        Set<Node<T>> visitedNodes = new HashSet<>();
        Stack<Node<T>> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty())
        {
            Node<T> top = stack.pop();
            if(top.getRc() == null && top.getLc() == null)
            {
                System.out.print(top.getData() + "=>");
            }
            else if(visitedNodes.contains(top))
            {
                System.out.print(top.getData() + "=>");
            }
            else
            {
                visitedNodes.add(root);
                stack.push(root);
                if(root.getRc() != null)
                {
                    stack.push(root.getRc());
                }

                if(root.getLc() != null)
                {
                    stack.push(root.getLc());
                }


            }
        }
    }
}
