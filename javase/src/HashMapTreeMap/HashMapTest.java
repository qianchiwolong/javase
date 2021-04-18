package HashMapTreeMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Student s1=new Student("侯弟弟 ",22);
        Student s2=new Student("卢本伟",24);
         HashMap<Integer,Student> m= new HashMap<>();
       // Set<Student> set1=new HashSet<>();
        m.put(201200,s1);
        m.put(201200,s2);
        m.put(20120,s1);
        System.out.println(m.size());
        System.out.println(m.get(20120));
        Set<Map.Entry<Integer,Student>> set1=m.entrySet();
        System.out.println(set1.size());
        for(Map.Entry<Integer,Student> A: set1)
        {
            System.out.println(A);
        }

    }

}
