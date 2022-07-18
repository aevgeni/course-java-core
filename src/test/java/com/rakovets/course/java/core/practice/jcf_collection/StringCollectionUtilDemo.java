package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.List;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        StringCollectionUtil test = new StringCollectionUtil();
        List<String> words = new ArrayList<>();
        words.add("word");
        words.add("WorD");
        words.add("Spring");
        words.add("test");
        words.add("Java");
        words.add("1_2_3_4");
        words.add("/!#$");
        words.add("H ha");
        words.add("****");

        test.resetWordsByLength(words, 4);
        System.out.println("List after resetWordsByLength: " + words);

        test.removeWordsByLength(words, 1);
        System.out.println("List after removeWordsByLength: " + words);
    }
}
