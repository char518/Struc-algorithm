package com.charl;

/**
 * 单链表
 * Create by charl
 * Date 2020/7/14 11:00
 */
public class Node<T> {

    private T date;

    public Node next;

    public Node(T date) {
        this.date = date;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
