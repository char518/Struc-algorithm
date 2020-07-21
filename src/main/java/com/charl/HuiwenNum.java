package com.charl;

/**
 * 回文数 1221,12321
 * 有多种解法：
 * 1.采用栈先进后出的结构，倒序
 * 2.采用单链表，采用一个快指针，一个满指针先确定中位数，
 * 3.采用数组，
 * Create by charl
 * Date 2020/7/14 11:07
 */
public class HuiwenNum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int[] arr1 = {1, 2, 3};
        Node node = buildNode(arr1);

        Node node1 = reverseNode(node);
        System.out.println(node1);
        boolean b = checkIsHuiwen(node);
        System.out.println(b);
    }


    public static Node buildNode(int[] arr) {
        Node node = new Node(arr[0]);
        Node pre = node;
        for (int i = 1; i < arr.length; i++) {
            Node nodeEle = new Node(arr[i]);
            pre.setNext(nodeEle);
            pre = nodeEle;
        }
        return node;
    }

    public static boolean checkIsHuiwen(Node node) {
        if (null == node) {
            return false;
        }
        //选取两个指针：一个快指针，一个慢指针
        Node slowIndex = node;
        Node quickIndex = node;
        while (slowIndex.next != null && quickIndex.next.next != null) {
            slowIndex = slowIndex.next;
            quickIndex = quickIndex.next.next;
        }
        //翻转后半段链表  --- 翻转链表
        Node next = slowIndex.next;
        Node temp = null;
        Node pre = null;
        while (null != next) {
            temp = next.next;//保存下一个节点到值
            next.next = pre;//当前节点的下个节点指向前一个节点
            pre = next;//将当前节点保存起来
            next = temp;//当前节点向后移动
        }

        while (null != pre) {
            if (!pre.getDate().equals(node.getDate())) {
                return false;
            }
            pre = pre.next;
            node = node.next;
        }
        return true;
    }

    public static Node reverseNode(Node node) {
        Node temp = null;
        Node newNode = null;
        while (node != null) {
            temp = node.next;
            //对新链表做头插法
            node.next = newNode;
            newNode = node;
            node = temp;
        }
        return newNode;
    }


}
