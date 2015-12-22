package com.baidu.mm.algorithom;

import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Node root = new Node(3);
        Node r1 = new Node(1);
        Node r2 = new Node(2);
        Node r5 = new Node(5);
        Node r6 = new Node(6);
        Node r8 = new Node(8);
        Node r7 = new Node(7);
        root.left = r1;
        root.right = r5;
        r1.right = r2;
        r5.left = r6;
        r5.right = r7;
        r6.left = r8;
        allRoad(root);

    }

    public static void allRoad(Node root) {
        List<Node> list = new LinkedList<Node>();
        if (root == null) {
            return;
        }
        list.add(root);
        boolean isLeft = true;
        Node tmpNode = null;
        while (true) {
            if (root.left != null && isLeft) {
                list.add(root.left);
                root = root.left;
                continue;
            } else if (root.right != null) {
                isLeft = true;
                list.add(root.right);
                root = root.right;
                continue;
            } else {
                printRoad(list);
            }
            // RollBack
            while (list.size() > 1) {
                tmpNode = list.get(list.size() - 1);
                list.remove(list.size() - 1);
                if (list.get(list.size() - 1).left == tmpNode) {
                    if (list.get(list.size() - 1).right != null) {
                        isLeft = false;
                        root = list.get(list.size() - 1);
                        break;
                    }
                } else if (list.get(list.size() - 1).right == tmpNode) {
                    continue;
                }
            }
            if (isLeft && list.size() == 1 && (list.get(0).right != null || list.get(0).left != null)) {
                System.out.println("end of pro");
                break;
            }
        }
    }

    public static void printRoad(List<Node> list) {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str = str + list.get(i).value + " ";
        }
        System.out.println(str);
    }

}
