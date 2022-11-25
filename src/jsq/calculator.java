/*简易的计算器，只有加减乘除。
*/
package jsq;

import java.util.Scanner;

public class calculator {
    public float jia(float a,float b){return a+b;}
    public float jian(float a,float b){return a-b;}
    public float cheng(float a,float b){return a*b;}
    public float chu(float a,float b){return a/b;}
    public void zhongh(){
        System.out.println("请输入第一个数");
        Scanner sca=new Scanner(System.in);
        String one=sca.nextLine();
        float a=Float.parseFloat(one);
        while (true){//关闭closing
            System.out.println("请输入符号");
            String fuh=sca.nextLine();
            if (fuh.equals("=")){
                System.out.println("运行结束");
                break;
            }
            if (!(fuh.equals("+")||fuh.equals("-")||fuh.equals("*")||fuh.equals("/"))){
                System.out.println("你输入的符号不对,符号【+ - * /】只能这个");
                continue;
            }
            System.out.println("请输入第二个数");
            String twn=sca.nextLine();
            float b=Float.parseFloat(twn);
            switch (fuh){
            case "+":
                a=this.jia(a,b);
                break;
            case "-":
                a=this.jian(a,b);
                break;
            case "*":
                a=this.cheng(a,b);
                break;
            case "/":
                a=this.chu(a,b);
                break;
            }
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
    A0 p=new A0();
    p.zhongh();
    }
}
