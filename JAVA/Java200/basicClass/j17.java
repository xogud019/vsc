class kim{
    public int age;
    public int birth;
}

public class j17{
    public static void main(String[] args){
        int a = 25;
        int b = 950101;

        kim k = new kim();

        k.age = a;
        k.birth = b;
       
        System.out.println(k.age +"\t"+ k.birth);

    }
}