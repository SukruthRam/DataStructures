package com.skillsoft.datastructures.binaryTree;

public class Node<T> {

    private T data;

    private Node<T> lc;
    private Node<T> rc;


    public Node(T data)
    {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLc() {
        return lc;
    }

    public void setLc(Node<T> lc) {
        this.lc = lc;
    }

    public Node<T> getRc() {
        return rc;
    }

    public void setRc(Node<T> rc) {
        this.rc = rc;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", lc=" + lc +
                ", rc=" + rc +
                '}';
    }
}
