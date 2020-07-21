package com.charl.tree;

/**
 * Create by charl
 * Date 2020/7/3 10:48
 */
public class TwoWayTree {

    private int data;

    private TwoWayTree left;

    private TwoWayTree right;

    public TwoWayTree(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TwoWayTree getLeft() {
        return left;
    }

    public void setLeft(TwoWayTree left) {
        this.left = left;
    }

    public TwoWayTree getRight() {
        return right;
    }

    public void setRight(TwoWayTree right) {
        this.right = right;
    }
}
