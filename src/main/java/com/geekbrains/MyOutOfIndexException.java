package com.geekbrains;

public class MyOutOfIndexException extends RuntimeException {

    public MyOutOfIndexException(String s) {
        System.out.println(s);
    }

}
