package com.skillsoft.datastructures.problems;

import com.skillsoft.datastructures.binaryTree.Node;
import com.skillsoft.datastructures.binaryTree.Pair;

public class Mirror {

    public static void main(String args[])
    {
        Node<Character> a = new Node<>('A');
        mirror(a);
    }

    private static void mirror(Node<Character> root) {
        if(root == null)
        {
            return;
        }

        Node<Character> temp = root.getLc();
        root.setLc(root.getRc());
        root.setRc(temp);

        mirror(root.getLc());
        mirror(root.getRc());

    }



}
