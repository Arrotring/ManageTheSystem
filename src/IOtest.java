import java.io.File;
import java.io.IOException;

public class IOtest {
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\test\\Tsest.java");
        File file1=new File("E:\\test\\Tsest");
        System.out.println(file.createNewFile()); //创建文件
        System.out.println(file1.mkdir());//创建文件夹
    }
}
