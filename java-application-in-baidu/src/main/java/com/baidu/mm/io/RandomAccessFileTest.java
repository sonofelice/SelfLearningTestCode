package com.baidu.mm.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by zhangmengmeng on 16/8/8.
 */
public class RandomAccessFileTest {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
        raf.setLength(1024 * 1024);
        raf.close();

        String s1 = "first";
        String s2 = "second";
        String s3 = "third";
        String s4 = "forth";
        String s5 = "fifth";
        new FileWriteThread(1024 * 1, s1.getBytes()).start(); // 从文件的1024字节之后开始写入数据
        new FileWriteThread(1024 * 2, s2.getBytes()).start(); // 从文件的2048字节之后开始写入数据
        new FileWriteThread(1024 * 3, s3.getBytes()).start(); // 从文件的3072字节之后开始写入数据
        new FileWriteThread(1024 * 4, s4.getBytes()).start(); // 从文件的4096字节之后开始写入数据
        new FileWriteThread(1024 * 5, s5.getBytes()).start(); // 从文件的5120字节之后开始写入数据

    }

    static class FileWriteThread extends Thread {
        private int skip;
        private byte[] content;

        public FileWriteThread(int skip, byte[] content) {
            this.skip = skip;
            this.content = content;
        }

        public void run() {
            RandomAccessFile raf = null;
            try {
                raf = new RandomAccessFile("raf.txt", "rw");
                raf.seek(skip);
                raf.write(content);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                try {
                    raf.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
