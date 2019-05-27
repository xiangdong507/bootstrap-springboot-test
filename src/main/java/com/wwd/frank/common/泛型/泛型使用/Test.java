package com.wwd.frank.common.泛型.泛型使用;

import com.wwd.frank.common.泛型.Base;

public class Test {
    public static void main(String[] args) {
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        System.out.println( "整型数组元素为:" );
        Base.printway(intArray); // 传递一个整型数组

        System.out.println( "\n双精度型数组元素为:" );
        Base.printway( doubleArray ); // 传递一个双精度型数组

        System.out.println( "\n字符型数组元素为:" );
        Base.printway( charArray ); // 传递一个字符型数组
    }
}
