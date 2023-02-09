package com.example.mybatis.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Factory {
    static{
        try{
            //加载驱动
            Class.forName("com.mysql.jdbc.cj.Driver");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //创建方法 拿取驱动
    public static Connection getCon(){
        try{
            return DriverManager.getConnection("192.168.0.96:3306/mydbsql","root","root");
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    //此方法用来依次关闭结果集 执行器 和链接
    public static void close(ResultSet rs
            , Statement st, Connection con){
        try{
            if(rs!=null)
                rs.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                if(st!=null)
                    st.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }finally{
                try{
                    if(con!=null)
                        con.close();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
