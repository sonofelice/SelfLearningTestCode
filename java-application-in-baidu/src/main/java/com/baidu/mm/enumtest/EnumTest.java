package com.baidu.mm.enumtest;

/**
 * Created by baidu on 16/8/9.
 */
public enum EnumTest {
    SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;
    public String toString(){
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for (EnumTest e : values()){
            System.out.println(e );
        }
    }
}
