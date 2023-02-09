package test;

import com.sun.glass.events.KeyEvent;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class Test10 {
    public static void main(String[] args) throws AWTException {    //程序入口
        //1.需要发送的内容
        String a = "";
        //2.将我们定义好的内容复制到系统的截切板
        Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();//截切板--工具--默认工具箱--系统截切板
        Transferable t = new StringSelection(a);//把内容转换成电能可识别的
        c.setContents(t,null);//识别不了中文，英文，只能识别二进制
        //3.粘贴、发送、粘贴、发送、粘贴、发送
        Robot r = new Robot();//创建一个机器人
        //用一个循环来显示执行次数
        for (int i=1;i<=20;i++){
            r.keyPress(KeyEvent.VK_CONTROL);//按下CTRL键
            r.keyPress(KeyEvent.VK_V);//按下v键
            r.keyRelease(KeyEvent.VK_CONTROL);//释放CTRL键
            r.delay(500);//延时500ms
            r.keyPress(KeyEvent.VK_ENTER);//按下enter键
        }
    }
}
