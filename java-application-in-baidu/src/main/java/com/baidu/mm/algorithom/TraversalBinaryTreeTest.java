package com.baidu.mm.algorithom;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月22日 上午10:04:57 类说明 :
 */
public class TraversalBinaryTreeTest {
    public static int count = 0;
    public static ArrayList<Integer> arrayOne = new ArrayList<Integer>();
    public static Stack<Integer> rest = new Stack<Integer>();

    public static void preTraverse(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preTraverse(root.left);
            preTraverse(root.right);
        }
    }

    public static void printAllPath(Node root, int path[], int pathlen) {
        if (root == null)
            return;
        path[pathlen] = root.value;
        pathlen++;
        if (root.left == null && root.right == null) {
            printP(path, pathlen);
        } else {
            printAllPath(root.left, path, pathlen);
            printAllPath(root.right, path, pathlen);
        }
    }

    public static void printP(int path[], int pathlen) {
        int i;
        for (i = 0; i < pathlen; i++) {
            System.out.print(path[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(5);
        root.left.right = new Node(2);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.left = new Node(8);
        // preTraverse(root);
        int path[] = new int[1000];
        printAllPath(root, path, 0);
    }
}
