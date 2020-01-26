public class j67{
    public static void main(String[] args){
        String s1 = "Hello Java";
        String s2 = "HEllo Java";

        System.out.println(s1.charAt(2));
        System.out.println(s1.concat("s"));
        System.out.println(s1.contains("and"));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.lastIndexOf("a"));
        System.out.println(s1.trim());
        System.out.println(s1.length());
        System.out.println(s1.substring(7));
        System.out.println(s1.substring(1, 7));
        System.out.println(s1.replace(" ","-"));
        System.out.println(s1.replaceAll(" ","-"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        String[] sp = s1.split(" ");
        for(int i=0; i<sp.length;i++){
            System.out.println(i+"\t"+sp[i]+"\t"+sp[i].length());
        }
    }
}