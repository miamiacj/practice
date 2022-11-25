/*请定义一个交通工具(vehicle)的类
*   其中有属性
*   速度：velocity
*   体积：volume
*   方法移动：(move())
*   设置：速度(setSpeed(int speed))
*   加速：speedup().
*   减速：speedDown()等等
*
*   最后在测试类vehicle中的main()中实例化一个交通工具对象
*   并通过方法给他初始化，速度{setVelocity}，体积{setVolume}的值并且打印出来。
*   另外调用加速减速的方法对速度进行改变。
* */
package lianxi;

import java.util.Scanner;

public class CalculateTheSpeed {
    public static void main(String[] args) {
        /*例如：公交车速度：120，体积：5米长*/
        /*通过无参来调用*/
        Scanner scan=new Scanner(System.in);

        vehicle v=new vehicle();
        /*速度：setVelocity*/
        v.setVelocity(0);
        System.out.print("起步速度"+v.getVelocity());
        /*体积：setVolume*/
        v.setVolume(5);
        System.out.println("公交车长"+v.getVolume());
        /*加速：speedup*/
        while (true){
            System.out.println("请输入你加速多少");
            int set=scan.nextInt();
            v.speedup(set);
            System.out.println("加速之后"+v.getVelocity());
            /*减速:speedDown*/
            System.out.println("请输入你减速多少");
            int spe=scan.nextInt();
            v.speedDown(spe);
            System.out.println("减速之后"+v.getVelocity());
        }

    }
}
class vehicle {
    //    速度
    private int velocity;
    //    体积
    private double volume;

    public vehicle() {
    }

    public vehicle(int velocity, double volume) {
        this.velocity = velocity;
        this.volume = volume;
    }

    public int getVelocity() {
        return velocity;
    }

    //    设置速度方法
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    //    设置方法移动
    public void move() {

    }

    /*加速*/
    public void speedup(int i) {
        if (i == 0) {
            System.out.println("你没有加速");
            System.exit(0);//<--终止程序，退出jvm；
        } else if ((this.getVelocity() <= 120 && this.getVelocity() >= 0)) {
            this.setVelocity((this.getVelocity() + i));
        } else {
            System.out.println("你的车速过快，你超速了");
            System.exit(0);//<--终止程序，退出jvm；
        }
    }

    /*减速*/
    public void speedDown(int i) {
        if (i == 0) {
            System.out.println("你没有减速");
            if (this.getVelocity() > 120) {
                System.out.println("你的车速过快，你超速了");
                System.exit(0);//<--终止程序，退出jvm；
            } else if (this.getVelocity() <= 120 && this.getVelocity() >= 0) {
                this.setVelocity((this.getVelocity() - i));
            } else {
                System.out.println("你的车速以小于0或者大于120，已停");
                System.exit(0);//<--终止程序，退出jvm；
            }

        }
    }
}
