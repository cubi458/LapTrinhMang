package LapTrinhMang.lab1;

import java.io.File;

public class FileOperation {
    public static void main(String[] args) {
        FileOperation f = new FileOperation();
        String dir = "D:\\Bi\\Test01";
//        List<String> list = f.filesList(dir);
        String[] list = new File("D:\\Bi\\Test01").list();
        for(String s:list){
            System.out.println(s);
        }
//        System.out.println(list);
    }

//    public List<String> filesList(String forder) {
//        List<String> list = new ArrayList<>();
//        File dir = new File(forder);
//        File[] files = dir.listFiles();
//        for(File file:files){
//            list.add(file.getPath());
//        }
//        return list;
//    }
}
