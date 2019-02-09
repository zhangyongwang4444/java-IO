package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        //标准输出
        System.out.println("Java IO流 和异常处理");
        System.out.println("第二行这是");

        //标准输入 和 Reader
        InputStream val = System.in;
        InputStreamReader stdReader = new InputStreamReader(val);
        char[] buffer = new char[20];
        try {
            int length = stdReader.read(buffer);
            System.out.println(length);
            System.out.println(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
