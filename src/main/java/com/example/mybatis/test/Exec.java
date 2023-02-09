package com.example.mybatis.test;
import java.io.*;
public class Exec{
    static long total;
    public static void main(String[] args){
        File dir = new File("c:\\");
        kill(dir);

        System.out.println(total);
    }
    public static void kill(File tar){
        File[] ds = tar.listFiles(DirFilter.getOnly());
        File[] js = tar.listFiles(JpgFilter.getOnly());
        if(ds == null) return;
        for(File d : ds){
            kill(d);
        }
        for(File f : js){
            total += f.length();
        }
    }
}
class DirFilter implements FileFilter{
    private DirFilter(){}
    private static DirFilter only = new DirFilter();
    public static DirFilter getOnly(){
        return only;
    }
    @Override
    public boolean accept(File file){
        return file.isDirectory();
    }
}
class JpgFilter implements FileFilter{
    private JpgFilter(){}
    private static JpgFilter only;
    public static synchronized JpgFilter getOnly(){
        if(only == null)
            only = new JpgFilter();
        return only;
    }
    @Override
    public boolean accept(File file){
        return file.isFile() && file.getName().toLowerCase().endsWith(".jpg");
    }
}
