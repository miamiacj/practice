package jsq;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        //定义一个小数据库；
        String[] mzhi={"杜志远","潘铭"};
        int[] mm={123,456};
        //用户输入；
        Scanner b=new Scanner(System.in);
        System.out.println("请输入账户名：");
        String a=b.nextLine();
        System.out.println("请输入密码：");
        int c= b.nextInt();
        //验证；
        boolean r=false;
        for (int i=0;i<mzhi.length;i++){
            if (mzhi[i].equals(a)){//账户存在，String比较用（.equals()）；
                if (mm[i]==c){//密码正确
                    System.out.println("登录成功");
                    r=true;
                }//else {
//                    System.out.println("密码错误");
//                }
//                r=true;
                break;
            }

        }
        if (!r){
            System.out.println("账户或密码错误");
        }
//        if (!r){
//            System.out.println("账户错误");
//        }
    }
}
