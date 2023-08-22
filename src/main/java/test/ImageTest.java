package test;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.data.PictureRenderData;
import com.deepoove.poi.data.PictureType;
import com.deepoove.poi.data.Pictures;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * @autor lzc
 * @create 2023-06-13 下午4:43
 */
public class ImageTest {
        // 替换docx文件中的信息
        private static File docxReplace(String wordPath) throws IOException {
            downloadImgByNet("https://p0.ssl.qhimgs1.com/sdr/400__/t01a31d8f07bf783dde.jpg","/Users/admin/Desktop/log","签名.JPG");
            // 将要替换的文字、图片写入map集合中
            Map<String, Object> map = new HashMap<>();
            try {
                // 图片的处理
                PictureRenderData pictureRenderData = Pictures.ofStream(new FileInputStream("/Users/admin/Desktop/log/签名.JPG"), PictureType.PNG)
                        .size(102, 126).create();
                map.put("photo", pictureRenderData);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            // 生成的新文件保存路径
            File repotrFile = new File("/Users/admin/Desktop/log/new.docx");
            try {
                // 生成新的文件并写到硬盘
                XWPFTemplate.compile(wordPath).render(map, new FileOutputStream(repotrFile));
            } catch (IOException e) {
                e.printStackTrace();
            }
            // Todo
            // 可以对文件执行其他操作，例如：打印，在打印完毕后删除文件
            // repotrFile.delete();
            // 或者直接返回File
            return repotrFile;
        }

        public static void main(String[] args) throws IOException {
            File file = new ImageTest().docxReplace("/Users/admin/Desktop/log/招标计划审查记录.docx");
        }

    public static void download(String urlString, String savePath, String filename) throws IOException {
        // 构造URL
        URL url = new URL(urlString);
        // 打开连接
        URLConnection con = url.openConnection();
        //设置请求超时为20s
        con.setConnectTimeout(20 * 1000);
        //文件路径不存在 则创建
        File sf = new File(savePath);
        if (!sf.exists()) {
            sf.mkdirs();
        }
        //jdk 1.7 新特性自动关闭
        try (InputStream in = con.getInputStream();
             OutputStream out = new FileOutputStream(sf.getPath() + "\\" + filename)) {
            //创建缓冲区
            byte[] buff = new byte[1024];
            int n;
            // 开始读取
            while ((n = in.read(buff)) >= 0) {
                out.write(buff, 0, n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void downloadImgByNet(String imgSrc,String filePath,String fileName){
        try{
            URL url = new URL(imgSrc);
            URLConnection conn = url.openConnection();
            //设置超时间为3秒
            conn.setConnectTimeout(3*1000);
            //防止屏蔽程序抓取而返回403错误
            conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            //输出流
            InputStream str = conn.getInputStream();

            //控制流的大小为1k
            byte[] bs = new byte[1024];

            //读取到的长度
            int len = 0;

            //是否需要创建文件夹
            File saveDir = new File(filePath);
            if(!saveDir.exists()){
                saveDir.mkdir();
            }
            File file = new File(saveDir+File.separator+fileName);

            //实例输出一个对象
            FileOutputStream out = new FileOutputStream(file);
            //循环判断，如果读取的个数b为空了，则is.read()方法返回-1，具体请参考InputStream的read();
            while ((len = str.read(bs)) != -1) {
                //将对象写入到对应的文件中
                out.write(bs, 0, len);
            }

            //刷新流
            out.flush();
            //关闭流
            out.close();
            str.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
