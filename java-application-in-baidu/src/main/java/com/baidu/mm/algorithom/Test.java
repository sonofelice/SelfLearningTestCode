package com.baidu.mm.algorithom;

import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r5 = new TreeNode(5);
        TreeNode r6 = new TreeNode(6);
        TreeNode r8 = new TreeNode(8);
        TreeNode r7 = new TreeNode(7);
        root.left = r1;
        root.right = r5;
        r1.right = r2;
        r5.left = r6;
        r5.right = r7;
        r6.left = r8;
        allRoad(root);

    }

    public static void allRoad(TreeNode root) {
        List<TreeNode> list = new LinkedList<TreeNode>();
        if (root == null) {
            return;
        }
        list.add(root);
        boolean isLeft = true;
        TreeNode tmpNode = null;
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

    public static void printRoad(List<TreeNode> list) {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str = str + list.get(i).val + " ";
        }
        System.out.println(str);
    }

}
