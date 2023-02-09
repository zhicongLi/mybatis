import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipTest {

    public static void main(String[] args) throws IOException {
        String path = "/Users/admin/Desktop/";
        File file = new File("/Users/admin/Desktop/摄像头");

        ZipOutputStream zipOutput = null;
        if(file.isDirectory()){
            zipOutput = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(path + "摄像头.zip")));
            compressZip(zipOutput, file, "");
        }
        zipOutput.closeEntry();
        zipOutput.close();
    }

    private static void compressZip(ZipOutputStream zipOutput, File file, String suffixpath) {
        File[] listFiles = file.listFiles();// 列出所有的文件
        for(File fi : listFiles){
            if(fi.isDirectory()){
                if(suffixpath.equals("")){
                    compressZip(zipOutput, fi, fi.getName());
                }else{
                    compressZip(zipOutput, fi, suffixpath + File.separator + fi.getName());
                }
            }else{
                zip(zipOutput, fi, suffixpath);
            }
        }
    }

    public static void zip(ZipOutputStream zipOutput, File file, String suffixpath) {
        try {
            ZipEntry zEntry = null;
            if (suffixpath.equals("")) {
                zEntry = new ZipEntry(file.getName());
            } else {
                zEntry = new ZipEntry(suffixpath + File.separator + file.getName());
            }
            zipOutput.putNextEntry(zEntry);
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            byte[] buffer = new byte[1024];
            int read = 0;
            while ((read = bis.read(buffer)) != -1) {
                zipOutput.write(buffer, 0, read);
            }
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
