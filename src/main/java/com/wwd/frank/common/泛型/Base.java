package com.wwd.frank.common.泛型;

public class Base {
    public static <E> void printway(E[] array){
        // 输出数组元素
        System.out.println("输出开始！");
        for ( E element : array ){
            System.out.printf( "%s ", element );
        }
        System.out.println("\n输出完成！");
    }
}
