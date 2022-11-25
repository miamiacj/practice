/*
* 一个随机数字，让用户输入并猜出来
* */
package lianxi;

import java.util.Random;
import java.util.Scanner;

public class Guessthenumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random r= new Random();//<--这个是随机数字
        int y=r.nextInt(100);
        A a=new A(y);
        B b=new B(a);
        System.out.println(y);
        while (true){
            System.out.println("请输入数字");
            int cd=scan.nextInt();
            b.cdl(cd);
        }

    }
}
 class A {
    public int x;

    public A() {
    }

    public A(int x) {
        this.x = x;
    }

    public void a(int x) {
        this.x = x;
    }

    public int b() {
        return x;
    }
}

 class B {
    public A x;

    public B() {
    }

    public B(A x) {
        this.x = x;
    }
    public void a(A x) {
        this.x = x;
    }

    public A getA() {
        return x;
    }

    public void cdl(int num) {
        int js = x.b();
        if (num == js) {
            System.out.println("猜到了");
            System.exit(0);//<--终止程序，退出jvm；
        } else if (js > num) {
            System.out.println("猜小了");
        } else {
            System.out.println("猜大了");
        }
    }

}

