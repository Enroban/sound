package com.enroban.sound.wav;

import org.junit.Test;

import javax.swing.*;

public class WaveFileReadDemo {


    /**
     * 这个test可以用main方法来运行
     */
    @Test
    public void testwavepanel() {
        // TODO Auto-generated method stub
        String filename = "/Users/enroban/Desktop/03 对味.wav";
        JFrame frame = new JFrame();
        WaveFileReader reader = new WaveFileReader(filename);
        if(reader.isSuccess()){
            int[] data = reader.getData()[0]; //获取第一声道
            DrawPanel drawPanel = new DrawPanel(data); // 创建一个绘制波形的面板
            frame.add(drawPanel);
            frame.setTitle(filename);
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
        else{
            System.err.println(filename + "不是一个正常的wav文件");
        }
    }

}
