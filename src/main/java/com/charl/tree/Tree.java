package com.charl.tree;

/**
 * Create by charl
 * Date 2020/7/3 10:48
 */
public class Tree {

    private int data;

    private Tree left;

    private Tree right;

    public Tree(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }
}