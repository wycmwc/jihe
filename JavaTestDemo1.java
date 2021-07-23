import org.junit.Test;

import java.util.*;

public class JavaTestDemo1 {

    @Test
    public void test() {
        Map<String, String> map = new HashMap<String, String>();
// 添加元素
// V put(K key,V value):添加元素。
// System.out.println("put:" + map.put("文章", "马伊俐"));
// System.out.println("put:" + map.put("文章", "姚笛"));
        map.put("邓超", "孙俪");
        map.put("黄晓明", "杨颖");
        map.put("周杰伦", "蔡依林");
        map.put("刘恺威", "杨幂");
// void clear():移除所有键值对元素
// map.clear();
// V remove(Object key)：根据键删除键值对元素，并把值返回
// System.out.println("remove:" + map.remove("黄晓明"));
// System.out.println("remove:" + map.remove("黄晓波"));
// boolean containsKey(Object key)：判断集合是否包含指定键
// System.out.println("containsKey:" + map.containsKey("黄晓明"));
// System.out.println("containsKey:" + map.containsKey("黄晓波"));
// boolean isEmpty()：判断集合是否为空
// System.out.println("isEmpty:"+map.isEmpty());
//int size()：返回集合中的键值对数量
        System.out.println("size:" + map.size());
        // 输出集合名称
        System.out.println("map:" + map);

    }

@Test
    public void test1(){// 创建集合对象
    List<Integer> list = new ArrayList<>();
// 添加元素
    list.add(30);
    list.add(20);
    list.add(50);
    list.add(10);
    list.add(40);
    System.out.println("list:" + list);
// public static <T> void sort(List<T> list)：排序 默认情况下是自然顺序。
// Collections.sort(list);
// System.out.println("list:" + list);
// [10, 20, 30, 40, 50]
// public static <T> int binarySearch(List<?> list,T key):二分查找
// System.out
// .println("binarySearch:" + Collections.binarySearch(list, 30));
// System.out.println("binarySearch:"
// + Collections.binarySearch(list, 300));
// public static <T> T max(Collection<?> coll):最大值
// System.out.println("max:"+Collections.max(list));
// public static void reverse(List<?> list):反转
// Collections.reverse(list);
// System.out.println("list:" + list);
//public static void shuffle(List<?> list):随机置换
    Collections.shuffle(list);
    System.out.println("list:" + list);
}


}

