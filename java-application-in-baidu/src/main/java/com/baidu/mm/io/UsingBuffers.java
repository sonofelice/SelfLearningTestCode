package com.baidu.mm.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * Created by zhangmengmeng on 16/8/8.
 */
public class UsingBuffers {
    private static void symemetricScramble(CharBuffer buffer){
        while (buffer.hasRemaining()){
            buffer.mark();//mark 方法会将标记设置成当前 position 的值
            char c1 = buffer.get();
            char c2 = buffer.get();
            buffer.reset();
            buffer.put(c2).put(c1);
        }
    }

    public static void main(String[] args) {
        char[] data = "UsingBuffers".toCharArray();
        ByteBuffer bb = ByteBuffer.allocate(data.length * 2);
        CharBuffer cb = bb.asCharBuffer();
        cb.put(data);
        System.out.println(cb.rewind());
        symemetricScramble(cb);
        System.out.println(cb.rewind());
        symemetricScramble(cb);
        System.out.println(cb.rewind());
    }
}
