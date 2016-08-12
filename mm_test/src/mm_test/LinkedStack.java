package mm_test;

/**
 * 泛型的使用，栈
 * 
 * @Date: 2016年4月21日 上午10:19:17
 *
 * @author zhangmengmeng01@baidu.com
 */
public class LinkedStack<T> {
    public static class Node<U> {
        U item;
        Node<U> next;

        Node() {
            item = null;
            next = null;
        }

        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return (item == null && next == null);
        }
    }

    private Node<T> top = new Node<T>();

    public void push(T item) {
        top = new Node<T>(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }
}
