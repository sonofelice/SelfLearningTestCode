package mm_test; 

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/** 
 * 队列的使用
 * @Date: 2016年4月18日 下午6:45:58 
 *
 * @author zhangmengmeng01@baidu.com
 */
public class QueueTest {
    public static void printQ(Queue queue){
        while(queue.peek() != null){
            System.out.print(queue.remove() + "");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for(int i = 0;i<10;i++){
            queue.offer(rand.nextInt(i+10));
        }
        printQ(queue);
        
        Queue<Character> qc = new LinkedList<Character>();
        for(char c : "SonoFelice".toCharArray()){
            qc.offer(c);
        }
        printQ(qc);
    }
}
 