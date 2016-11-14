package com.homework.tool;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 * Created by dell on 2016/11/14.
 */
public class LineCounter {
    public static int countEffectiveLine(File file) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String tempString = null;
        int line = 0;
        // 一次读入一行，直到读入null为文件结束
        while ((tempString = reader.readLine()) != null) {
            if(!tempString.trim().isEmpty() && !tempString.trim().startsWith("//")){
                // debug
                line++;
                System.out.println("line " + line + ": " + tempString);
            }
        }
        reader.close();
        return line;
    }
}
