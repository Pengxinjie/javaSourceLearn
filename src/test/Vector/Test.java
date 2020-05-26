package test.Vector;

import java.util.Vector;

/**
 * @author Pengxinjie
 * @DATE 2020/5/25 - 21:29
 *
 * Vector源码
 */
public class Test {
    public static void main(String[] args) {
        Vector v = new Vector();
        //1.new Vector():初始化长度为10的数组，默认增量是0

        v.add("2");
        v.add("1");
        //2.add(E e):默认扩容为原来的两倍，如果手动指定了capacityIncrement的值，那么就按照指定的来

        v.add(1,"2");
        //3.add(int index,E e):考虑扩容-->移动元素-->添加-->元素个数增加

        v.remove(1);
        //4.remove(int index):计算移动元素的个数-->调用System.arrayCopy移动元素-->elementData[--elementCount] = null让gc回收

        v.remove("1");
        //5.remove(Object obj):先查找obj的下标-->同4

    }
}
