package com.example.demo._04_builder._03_java;

public class StringBuilderExample {

    public static void main(String[] args) {
        //synchronized 사용하지 않음
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("whiteship").append("keesun").toString();
        System.out.println(result);
    }
}
