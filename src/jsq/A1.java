package jsq;

import java.util.Objects;
import java.util.Scanner;

//
public class A1 {
    public static void main(String[] args) {
        String[][] yhm={{"杜","12"},{"潘","666"}};
        //用户输入
        Scanner b=new Scanner(System.in);
        System.out.println("请输入账户名：");
        String a=b.nextLine();
        System.out.println("请输入密码：");
        String c=b.nextLine();
        //验证
        boolean y =false;
       for (int i=0;i<yhm.length;i++){
           if (yhm[i][0].equals(a)){//string判断条件是（数组.equals（第一个输入的值））
            if (yhm[i][1].equals(c)){
                System.out.println("登录成功");
                y=true;
            }
            break;
           }
       }
        if (!y){
            System.out.println("账户名或密码输入错误");
        }
    }
}
