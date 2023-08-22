package test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @autor lzc
 * @create 2023-08-10 下午5:06
 */
public class PTest1 {

    public static void main(String[] args) throws IOException {
        // 拼接百度搜索的URL地址
        String url = "http://localhost:8081/test1.html";
        // 调用getHtml方法，获取HTML文档对象
        Document doc = getHtml(url);
        // 调用parseHtml方法，解析HTML文档，并打印搜索结果
        parseHtml(doc);
    }

    public static void parseHtml(Document doc) {
        // 选择所有包含搜索结果的div元素
        Elements results = doc.select("font");
        System.out.println(results);
        // 遍历每个div元素
        for (Element result : results) {
            // 选择标题中的a元素
            Element title = result.selectFirst("#3jzfh");
            if(title != null){
                System.out.println(title);
                // 获取标题文本和链接地址
                String text = title.text();
                //String text = title.text();
                /*String link = title.attr("href");*/
                // 打印标题和链接
                System.out.println("获取的指标数据为" + text);
                /*  System.out.println(link);*/
            }
        }
    }

    public static Document getHtml(String url) throws IOException {
        // 创建一个URL对象
        URL u = new URL(url);
        // 打开一个HTTP连接
        HttpURLConnection conn = (HttpURLConnection) u.openConnection();
        // 设置请求方法为GET
        //conn.setRequestMethod("GET");
        // 设置连接超时和读取超时时间
        conn.setConnectTimeout(1000);
        conn.setReadTimeout(1000);
        // 判断响应码是否为200
        if (conn.getResponseCode() == 200) {
            // 使用Jsoup解析HTML文档
            Document doc = Jsoup.parse(conn.getInputStream(), "utf-8", url);
            // 关闭连接
            conn.disconnect();
            // 返回文档对象
            return doc;
        } else {
            // 抛出异常
            throw new IOException("请求失败，响应码为" + conn.getResponseCode());
        }
    }
}
