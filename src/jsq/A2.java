package jsq;

import java.util.Scanner;
/*设计一个方法，用来实现登录用户验证
*/
public class A2 {
    private String[][] yhm={{"杜","12"},{"潘","666"}};//设计属性//private<-->(私有的)
    public String a(String a,String c){             //设计方法
        String mzhi="账户名或密码输入错误";
        for (int i=0;i<yhm.length;i++){
            if (yhm[i][0].equals(a)){//string判断条件是（数组.equals（第一个输入的值））
                if (yhm[i][1].equals(c)){
                    mzhi= "登录成功";
                }
                break;
            }
        }
        return mzhi;
    }

    public static void main(String[] args) {
        //用户输入
        Scanner b=new Scanner(System.in);
        System.out.println("请输入账户名：");
        String a=b.nextLine();
        System.out.println("请输入密码：");
        String c=b.nextLine();
        A2 p=new A2();
        String Zhu=p.a(a,c);
        System.out.println(Zhu);
    }
}
