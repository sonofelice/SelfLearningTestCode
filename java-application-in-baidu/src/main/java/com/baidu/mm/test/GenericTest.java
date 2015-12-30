package com.baidu.mm.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by baidu on 15/12/30.
 */
public class GenericTest {
    public static void main(String[] args){
        Set<String> guys = new HashSet<String>(Arrays.asList("Tom","Dick","Harry"));
        Set<String> stooges = new HashSet<String>(Arrays.asList("Larry","Moe","Curly"));
        Set<String> aflCio = union(guys,stooges);
        System.out.println(aflCio);

    }
    public static <E> Set<E> union(Set<E> s1,Set<E> s2){
        Set<E> res = new HashSet<E>(s1);
        res.addAll(s2);
        return res;
    }
}
