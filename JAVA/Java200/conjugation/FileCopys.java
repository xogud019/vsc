//j132
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileCopys{
    public static void copyUsingFiles(File source,File target){
        try{
            Files.copy(source.toPath(), target.toPath());
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        File ff= new File("upload");
        File[] ffs= ff.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");

        for(File fff:ffs){
            String absFile = fff.getAbsolutePath();
            if(fff.isFile()){
                String f= (absFile).substring(absFile.lastIndexOf("\\")+1);
                String fre="";
                if(f.indexOf('.')>=0){
                    fre= f.substring(0, f.indexOf('.'));
                }

                Date longDay = new Date(Long.parseLong(fre));
                String fname = sdf.format(longDay);
                String newFname = sdf1.format(longDay);
                System.out.println(fname+"\t\t"+newFname);

                File newFile = new File("upload\\"+newFname);
                File toFile = new File("upload\\"+newFname+"\\"+f);
                if(!newFile.exists()){
                    boolean iss = newFile.mkdirs();
                    if(iss){
                        copyUsingFiles(fff, toFile);
                    }
                }
                else{
                    copyUsingFiles(fff, toFile);
                }
            }
        }
    }
}