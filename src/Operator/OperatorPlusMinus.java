package Operator;

public class OperatorPlusMinus {
    public static void main(String[] args) {
        OperatorPlusMinus test = new OperatorPlusMinus();
        test.sumin();
        test.multipleDivistion();
        test.divideInt();
        test.reaminder();
    }
    public void sumin(){
        int values1 = 2;
        int values2 = 5;
        int result1 = values1 + values2;
        System.out.println(result1);
    }
    public void multipleDivistion(){
        int values3 = 4;
        int values4 = 10;
        int result2 = values3 * values4;
        int result3 = values3 / values4; // 타입이 int(정수형)여서 double로 바꿔주면 소수점을 얻을수 있다.
     /*   double values5 = 5;
        double values6 = 10;
        double result4 = values5 / values6;
        System.out.println(result4); */
        System.out.println(result2);
        System.out.println(result3);
    }
    public void divideInt(){
        double doubleValues1 = 5;
        double doubleValues2 = 10;
        double result = doubleValues1 / doubleValues2;
        System.out.println(result);
    }
    public void reaminder(){
        int values6 = 53;
        int values7 = 10;
        int result = values6 % values7;
        System.out.println(result);
    }
}
