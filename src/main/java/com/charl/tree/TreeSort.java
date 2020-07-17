package com.charl.tree;

import java.util.*;

/**
 * Create by charl
 * Date 2020/7/3 11:10
 */
public class TreeSort {

    Tree tree;

    public TreeSort() {
        tree = init();
    }

    public static void main(String[] args) {
        TreeSort treeSort = new TreeSort();
        Tree tree = treeSort.tree;
        DFS(tree);
        DFS1(tree);
        System.out.println();
        BFS(tree);
    }

    public Tree init() {
        Tree tree1 = new Tree(1);
        Tree tree2 = new Tree(2);
        Tree tree3 = new Tree(3);
        Tree tree4 = new Tree(4);
        Tree tree5 = new Tree(5);
        Tree tree6 = new Tree(6);
        Tree tree7 = new Tree(7);
        Tree tree8 = new Tree(8);
        Tree tree9 = new Tree(9);
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
    public static void DFS(Tree tree) {
        Stack<Tree> stack = new Stack<Tree>();
        stack.push(tree);
        while (!stack.isEmpty()) {
            Tree pop = stack.pop();
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
    public static void DFS1(Tree tree) {
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
    public static void BFS(Tree tree) {
        Queue<Tree> queue = new LinkedList<Tree>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            Tree poll = queue.poll();
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

    public static void BFS1(Tree tree, int level, List<List<Tree>> list) {
        if (null == tree) {
            return;
        }
        if (level == 0) {
            list.set(0, Arrays.asList(tree));
        } else {

        }

    }


}
