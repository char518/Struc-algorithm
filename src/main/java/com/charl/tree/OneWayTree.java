package com.charl.tree;

/**
 * Create by charl
 * Date 2020/7/17 17:37
 */
public class OneWayTree<T> {

    private T date;

    public OneWayTree next;

    public OneWayTree(T date) {
        this.date = date;
    }

}
