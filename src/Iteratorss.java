import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iteratorss {
    public static void main(String[] args) {
        /*
        1、迭代器是 集合中专属的
         */
        Collection<String> collection=new ArrayList<String>();
        collection.add("test1");
        collection.add("test2");
        collection.add("test3");
        collection.add("test4");
        Iterator<String> iterators=collection.iterator();
        System.out.println(iterators.next());//取出第一个元素
    }
}
