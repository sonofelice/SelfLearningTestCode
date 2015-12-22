package com.baidu.mm.algorithom;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月22日 上午10:02:23 类说明 :
 */
public class Node {

    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}
