package com.moglu.patterns.decorator.ioexample;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        //Actually we should not use FileInputStream while reading character-based data
        // but the purpose is showing decorator pattern

        try(InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/main/resources/test.txt")))){
            int i = 0;
            while((i = in.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
