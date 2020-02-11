//j131
import java.io.File;

public class AboutFile{
    public static void printTree(File ff){
        if(ff.exists()){
            File[] fd = ff.listFiles();
            if(fd==null||fd.length==0){
                return;
            }
            else{
                for(File f:fd){
                    if(f.isDirectory()){
                        System.out.println(f.getAbsolutePath());
                    }
                }
            }
        }
    }

    public static void aboutFile(File f){
        System.out.println("-------------------------------");
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getName());
        System.out.println("canRead"+f.canRead());
        System.out.println(f.length()+"bytes");
    }

    public static void printTree2(File ff){
        File[] fd = ff.listFiles();
        if(fd==null||fd.length==0){
            return;
        }
        else{
            for(File f:fd){
                if(f.isDirectory()){
                    System.out.println("==========="+f.getAbsolutePath());
                    printTree2(f);
                }
                else{
                    aboutFile(f);
                }
            }
        }
    }

    public static void main(String[] args){
        File[] fs = File.listRoots();
        for(File f:fs){
            if(f.isDirectory()){
                printTree(new File(f.getAbsolutePath()));
            }
        }

        File f = new File("C:\\vsc");
        printTree2(f);
        System.out.println("-------------------------------");

        for(char c='A'; c<='Z'; c++){
            String dirName = c+":/";
            File allDirs = new File(dirName);
            if(allDirs.exists()){
                long total = (long)allDirs.getTotalSpace();
                long free = (long)allDirs.getFreeSpace();
                double used = (double)(1-free*1.0/total)*100;
                String str = c+":\\used of directory"+used+"%";
                System.out.println(str);
            }
        }
    }
}