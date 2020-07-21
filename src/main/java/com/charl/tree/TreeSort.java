package com.charl.tree;

import java.util.*;

/**
 * Create by charl
 * Date 2020/7/3 11:10
 */
public class TreeSort {

    TwoWayTree tree;

    public TreeSort() {
        tree = init();
    }

    public static void main(String[] args) {
        TreeSort treeSort = new TreeSort();
        TwoWayTree tree = treeSort.tree;
        DFS(tree);
        DFS1(tree);
        System.out.println();
        BFS(tree);
    }

    public TwoWayTree init() {
        TwoWayTree tree1 = new TwoWayTree(1);
        TwoWayTree tree2 = new TwoWayTree(2);
        TwoWayTree tree3 = new TwoWayTree(3);
        TwoWayTree tree4 = new TwoWayTree(4);
        TwoWayTree tree5 = new TwoWayTree(5);
        TwoWayTree tree6 = new TwoWayTree(6);
        TwoWayTree tree7 = new TwoWayTree(7);
        TwoWayTree tree8 = new TwoWayTree(8);
        TwoWayTree tree9 = new TwoWayTree(9);
        tree1.setLeft(tree2);
        tree1.setRight(tree3);
        tree2.setLeft(tree4);
        tree2.setRight(tree5);
        tree5.setRight(tree8);
        tree3.setLeft(tree6);
        tree3.setRight(tree7);
        tree7.setLeft(tree9);
        return tree1;
    }

    /**
     * 深度优先算法
     * deep first search
     *
     * @param tree
     */
    public static void DFS(TwoWayTree tree) {
        Stack<TwoWayTree> stack = new Stack<TwoWayTree>();
        stack.push(tree);
        while (!stack.isEmpty()) {
            TwoWayTree pop = stack.pop();
            System.out.print(pop.getData());
            if (null != pop.getRight()) {
                stack.push(pop.getRight());
            }
            if (null != pop.getLeft()) {
                stack.push(pop.getLeft());
            }
        }
        System.out.println();
    }

    /**
     * 递归实现
     *
     * @param tree
     */
    public static void DFS1(TwoWayTree tree) {
        if (null == tree) {
            return;
        }
        System.out.print(tree.getData());
        DFS1(tree.getLeft());
        DFS1(tree.getRight());
    }

    /**
     * broad first search
     *
     * @param tree
     */
    public static void BFS(TwoWayTree tree) {
        Queue<TwoWayTree> queue = new LinkedList<TwoWayTree>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            TwoWayTree poll = queue.poll();
            System.out.print(poll.getData());
            if (null != poll.getLeft()) {
                queue.add(poll.getLeft());
            }
            if (null != poll.getRight()) {
                queue.add(poll.getRight());
            }
        }
        System.out.println();
    }

    /**
     * 翻转单链表
     *
     * @param oneWayTree
     */
    public static OneWayTree reverseTree(OneWayTree oneWayTree) {
        OneWayTree pre = null;
        OneWayTree temp = null;
        while (Objects.nonNull(oneWayTree)) {
            temp = oneWayTree.next;
            //头插法
            oneWayTree.next = pre;
            pre = oneWayTree;
            oneWayTree = temp;
        }
        return pre;
    }


}
