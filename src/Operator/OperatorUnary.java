package Operator;

public class OperatorUnary {
    public static void main(String[] args) {
        OperatorUnary suminfight = new OperatorUnary();
        suminfight.unary();
        suminfight.increment();
        suminfight.sef();
        suminfight.complement();
    }
    public void unary(){
        int value =-10; // 10 * -1
        int result = +value;
        System.out.println(result);
        result= -value; // -10 * -1
        System.out.println(result);
        /*음수는 양수를 출력 , 양수는 음수를 출력*/

    }
    public void increment(){
        int num1 = 1;
        System.out.println(num1++); //1 후위증강연산자여서 1이 나옴
        System.out.println(num1); //2 후위증강연산자의 결과값이 나옴
        System.out.println(++num1); //3 전위증강연산자로 인해 결과값이 3이 나온다
    }

    public void sef() {
        int num1 = 1;
        System.out.println(num1);
        num1++;
        System.out.println(num1); //2 후위증강연산자의 결과값이 나옴
        System.out.println(++num1); //3 전위증강연산자로 인해 결과값이 3이 나온다
    }
    public void complement(){
        boolean flag = true;
        System.out.println(flag);
        System.out.println(!flag);
    }

}
