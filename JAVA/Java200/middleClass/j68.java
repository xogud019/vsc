import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class j68{
    public static String toModi(int n){
        String s ="";
        switch(n){
            case 0: s= ""; 
            break;
            case 1: s= "publc";
            break;
            case 2: s= "private";
            break; 
            case 4: s= "protected";
            break;
            case 8: s= "static";
            break;
            case 10: s= "private static";
            break;
            case 9: 
            break;
            case 137: s= "public static";
            break;
            case 17: s= "public final";
            break;
            case 257: s= "public native";
            break;
            case 260: s= "protected native";
            break;
            case 270: s = "public final native";
            break;
            default: s="xxxx";
            break;
           
        }

        return s;
    }

    public static String toRe(String msg) {
      String s= "";
      if(msg.indexOf("[")!=-1){
          if(msg.contains("[C")){
              s= msg.substring(msg.indexOf(" ")+1).trim();
              s= s.replace("[C","char[]");
          }
          else if(msg.contains("[L")){
              s= msg.substring(msg.indexOf(" ")+1).trim();
              s= s.replace("[L","").replace(";","");
              s= s.concat("[]");
          }
          else if(msg.contains("[B")){
            s= msg.substring(msg.indexOf(" ")+1).trim();
            s= s.replace("[B","byre[] ");
        }
      }
      else if(msg.indexOf(" ")!=-1){
        s= msg.substring(msg.indexOf(" ")+1).trim();
      }  
      else{
          s=msg.trim();
      }
      return s;
    } 

    public static void main(String[] args){
        Object obj1 = new Object();
        try{
            Class classes = Class.forName("java.lang.String");
            System.out.println("----------Method-----------");
            Method[] med = classes.getDeclaredMethods();

            for(Method me : med){
                if(me.getModifiers()>4000){
                    continue;
                }
                System.out.print(toModi(me.getModifiers())+"\t\t");
                System.out.printf("%-30s\t\t",toRe(me.getReturnType().toString()));
                System.out.print(me.getName());
                System.out.printf(",","");
                
                Class [] aa= me.getParameterTypes();
                for(int i=0;i<aa.length;i++){
                    System.out.print(toRe(aa[i].getName()));
                    if(i!=aa.length-1){
                        System.out.printf(",");
                    }
                }
                System.out.printf(",","");
                System.out.println();
            }
            System.out.println("---------Constructor------------");
            Constructor [] constructor = classes.getDeclaredConstructors();

            for(Constructor con:constructor){
                System.out.print(con.getName());
                System.out.printf("(","");

                Class [] aa= con.getParameterTypes();

                for(int i = 0; i<aa.length; i++){
                    System.out.print(toRe(aa[i].getName()));
                    if(i!=aa.length-1){
                        System.out.printf(",");
                    }
                }

                System.out.printf(")","");
                System.out.println();
            }
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
