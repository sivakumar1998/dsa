package fundamentals;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EqualityTester {
    public static void main(String[] args) {
        Class1 c= new Class1();
        Class1 c1=new Class1();
        System.out.println(c.equals(c1));
        String a="siva";
        String b=new String("siva");
        System.out.println(a.equals(b));
        Map<Class1,String>test=new HashMap<>();
        System.out.println(test.put(c,"1"));
        System.out.println( test.put(c1,"2"));
        System.out.println(test);
        System.out.println(test.get(new Class1()));


    }

}
class Class1{
    int a;
    int b;
public boolean equals(Class1 obj){

    return obj!=null&&this.a== obj.b && this.b== obj.b;
}
    public String toString(){
        return "a= "+a+" ,"+"b= "+b;
    }
    public int hashCode(){
    return Objects.hash(a,b);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Class1)) return false;
        Class1 other = (Class1) obj;
        return a == other.a&& b== other.b;
    }
}