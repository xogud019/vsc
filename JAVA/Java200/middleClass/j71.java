import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

public class j71{
    public static void main(String[] args){
        long lTime = System.currentTimeMillis();
        System.out.println(lTime);
        for(int i =0; i<100000; i++){
            System.out.print("");
        }

        long lTime1 = System.currentTimeMillis();
        System.out.println(lTime1- lTime);
        System.out.println(lTime1/1000/60/60/24/365+"year");
        Properties pro = System.getProperties();

        System.out.println(pro.getProperty("java.vm.version"));
        System.out.println(pro.getProperty("file.separator"));
        
        System.out.println(new Date(System.currentTimeMillis()));

        Enumeration<Object> en = pro.keys();
        int i = 0;
        while(en.hasMoreElements()){
            String keys = (String)en.nextElement();
            System.out.println((++i+"")+keys+" : "+pro.getProperty(keys));
        }

        
    }
}