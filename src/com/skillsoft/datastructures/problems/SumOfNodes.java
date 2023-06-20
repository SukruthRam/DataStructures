package com.skillsoft.datastructures.problems;

import com.skillsoft.datastructures.binaryTree.Node;

public class SumOfNodes {

    public static void main (String[] args)
    {
        int sum = 19;
        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(3);
        Node<Integer> four = new Node<>(4);
        Node<Integer> five = new Node<>(5);
        Node<Integer> six = new Node<>(6);
        Node<Integer> seven = new Node<>(7);
        Node<Integer> eight = new Node<>(8);

        one.setLc(two);
        one.setRc(three);

        three.setLc(seven);
        three.setRc(six);

        seven.setLc(eight);

        six.setLc(five);
        six.setRc(four);

        boolean has = hasPathSum(one,sum);
        System.out.print("Has sum of "+sum+" as "+has);
    }

    private static boolean hasPathSum(Node<Integer> root, int checkSum) {

        if(root == null)
        {
            return false;
        }
        if(root.getLc() == null && root.getRc() == null)
        {
            return root.getData() == checkSum;
        }

        boolean hasLeft = hasPathSum(root.getLc(), checkSum - root.getData());
        boolean hasRight = hasPathSum(root.getRc(), checkSum - root.getData());

        boolean hasSum = hasLeft || hasRight;

        System.out.println(root+ " left sum = "+ hasLeft + " right sum = "+ hasRight+ " has sum = "+hasSum);
        return hasSum;
    }
}
