package 系统常用类;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        File[] disks = File.listRoots();
        for(File file:disks){
            System.out.println(file.getCanonicalPath()+" ");
            long totalSpace = file.getTotalSpace();
            long freeSpace = file.getFreeSpace();
            System.out.println("总大小："+totalSpace/1024/1024/1024+"GB");
            System.out.println("可用大小："+freeSpace/1024/1024/1024+"GB");
        }
    }
}
