import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaGenegicDemo1 {
    @Test

    public void test1() {
        //用ArrayList存储字符元素，并遍历。用泛型改进代码
        ArrayList<String> array = new ArrayList<String>();


        array.add("hello");
        array.add("world");
        array.add("java");

        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("----------------");
        for (int x = 0; x < array.size(); x++) {
            String s = array.get(x);
            System.out.println();
        }
    }

    public class ObjectTool<T> {
        private T obj;

        public T getObj() {
            return obj;
        }

        public void setObj(T obj) {
            this.obj = obj;
        }

        public <T> void show(T t) {
            System.out.println(t);
        }


    }

    @Test
    public void test2() {
        //ObjectTool ot = new ObjectTool();
        //
        //ot.setObj(new String("张二"));
        //String s = (String)ot.getObj();
        //System.out.println("姓名是:"+s);
        //
        //ot.setObj(new Integer(30));
        //Integer i =(Integer)ot.getObj();
        //System.out.println("年龄是:"+i);

        //ot.setObj(new String("林二")）;
        //ClassCastException
        //System.out.println("姓名是:"+i);

        System.out.println("----------");
        ObjectTool<String> ot = new ObjectTool<String>();
        //ot.setObj(new String("张二"));//编译能不过
        ot.setObj(new String("林二"));
        String s = ot.getObj();
        System.out.println("姓名是:" + s);
        ObjectTool<Integer> ot2 = new ObjectTool<>();
        //ot2.setObj(new String("张二"))://编译能不过
        ot2.setObj(new Integer(27));
        Integer i = ot2.getObj();
        System.out.println("年龄是:" + i);

    }


    @Test
    public void test3() {
        //ObjectTool ot = new ObjectTool();
        //ot.show("hello");
        //ot.show(100);
        //ot.show(true);

        //ObjectTool<String>ot = new ObjectTool<String>();
        //ot.show("hello");
        //
        //ObjectTool<Integer>ot2 = new ObjectTool<Integer>();
        //ot2.show(100);
        //
        //ObjectTool<Boolean>ot3 = new ObjectTool<Boolean>();
        //ot3.show(true);


        //定义泛型方法后
        ObjectTool ot = new ObjectTool();
        ot.show("hello");
        ot.show(100);
        ot.show(true);


    }




}




