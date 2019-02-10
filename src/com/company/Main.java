package com.company;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //标准输出
        System.out.println("Java IO流 和异常处理");
        System.out.println("第二行这是");

        //标准输入 和 Reader
        InputStream val = System.in;
        InputStreamReader stdReader = new InputStreamReader(val);
        char[] buffer = new char[20];
        try {
            int length = stdReader.read(buffer);
            stdReader.close();
            System.out.println(length);
            System.out.println(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //从一个文件读取内容 输出到另一个文件
        FileInputStream input = new FileInputStream("res/input.txt");
        FileOutputStream output = new FileOutputStream("res/output.txt");

        InputStreamReader reader = new InputStreamReader(input, "UTF-8");
        OutputStreamWriter writer = new OutputStreamWriter(output, "UTF-8");

//        BufferedReader bufferedReader = new BufferedReader(reader);
//        PrintWriter printWriter = new PrintWriter(writer);

//        String context = "";
//        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
//            //处理这一行
//            context += line;
//        }

//        String context2 = "";
//        String line = null;
//        while ((line = bufferedReader.readLine()) != null) {
//            context2 += line + "\n";
//        }

        int ch;
        while ((ch = reader.read()) != -1) {
            writer.write(ch);
        }
        reader.close();
        input.close();


        writer.close();
        output.close();

        // IO Utils
        File inputfile = new File("res/input.txt");
        String content = FileUtils.readFileToString(inputfile);
        System.out.println("content");
        System.out.println(content);
    }
}
