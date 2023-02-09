package com.example.mybatis.jdbc.test;

import java.sql.*;

public class TestCon {
    public static void main(String[] args){
        try{
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取链接
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbsql","root","root");
            //拿取执行器
            Statement sta = con.createStatement();

            //sql
            //String sql = "select * from pi_user where name = ''or 1=1#'";
            String sql = "insert into pi_user(id,name,pass) values ('5','钱七','123')";
            //String sql = "select * from pi_user where name = '张三'";
            //String sql = "select * from pi_user where name = ?";

            /*PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,"'");*/
            //执行期执行sql 获取结果
            ResultSet res = sta.executeQuery(sql);
            while(res.next()){
                System.out.println("id=" + res.getString("id") + "name" + res.getString("name") + "budget" + res.getString("budget"));
            }
            res.close();
            sta.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
