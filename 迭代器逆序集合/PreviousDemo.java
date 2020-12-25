package 迭代器逆序集合;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/11/1 8:59
 */
public class PreviousDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ListIterator<Integer> i ;
        //将游标定义到列表的尾节点
        for (i = list.listIterator(); i.hasNext() ;) {
            i.next();
        }
        //逆序输出
        while (i.hasPrevious()) {
            System.out.print(i.previous()+" ");
        }
    }
}
