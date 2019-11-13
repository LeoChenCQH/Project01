package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author leo-lockbell
 * @date 2019/11/13-17:13
 **/
public class TemplateTest {
    //模板6 prsf
    private static final Customer cust = new Customer();
    //变形 psf
    public static final int NUM = 1;
    //psfi psfs

    //模板1
    public static void main(String[] args) {
        //模板2
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        System.out.println("args = " + args);
        System.out.println("TemplateTest.main");
          int num1 = 10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);

        //模板3 fori
       String[] arr = new String[]{"tom","sout","clearlove7"};
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //模板4 iter
        for (String s : arr) {
            System.out.println(s);
        }
        //模板5 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }

        //模板4
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {
            
        }
        //变形 list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形 list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            //倒序遍历
            
        }
        //条件判断

    }

    public void method(){
        System.out.println("true = " + true);
        //模板5 ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        if (list == null) {
            
        }
        //变形：inn
        if (list != null) {
            
        }
        //

    }


}
