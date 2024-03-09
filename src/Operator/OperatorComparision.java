package Operator;

public class OperatorComparision {
    public static void main(String[] args) {
        OperatorComparision operator = new OperatorComparision();
        operator.comparision1();
        operator.comparision2();
        operator.relational();
        operator.casting();
        operator.casting2();
        operator.compound();
    }
    public void comparision1(){
        /* 왼쪽 == 오른쪽 값이 같으면 true
        * 왼쪽 != 오른쪽 값이 다르면 true */
        int value1 = 1;
        int value2 = 2;
        int value3 = 1;
        System.out.println(value1 == value2); // 1과 2의 값이 같지 ? 다르니까 false
        System.out.println(value1 == value3); // 1과 1의 값이 같지 ? 같으니까 true

        System.out.println(value1 != value2); // 1과 2의 값이 다르지? 다르니까 true
        System.out.println(value1 != value3); // 1과 1의 값이 다르지? 같으니까 false
    }
    public void comparision2(){
        char charValue = 'a';
        System.out.println(97 == charValue); //a의 유니코드가 97인데 97과 97이 같아? 같으니까 true
        int intValue = 1;
        double doubleValue = 1.0;
        System.out.println(intValue == doubleValue); // 1과 1.0이 같아 ? 같으니까 true가 나온다
        System.out.println("===========================================");
    }
    public void relational(){
        int num1 = 1;
        int num2 = 2;
        System.out.println(num1 > num2); // 1 > 2 ? false
        System.out.println(num1 < num2); // 1 < 2 ? true
        System.out.println(num1 >= num2); // 1 >= 2 ? false
        System.out.println(num1 <= num2); // 1 <= 2 ? true
    }
    public void casting(){
        byte byteValue = 127;
        short shortValue = byteValue; // byte가 short로 형변환이 된거고 short는 127이 됨
        shortValue++; // 127에서 1을 증감시켰으니까 128이 된거임
        System.out.println(shortValue); // 128
        byteValue=(byte)shortValue; // short를 byte로 강제형변환 시켜서 bytevaluedp 담았어
        System.out.println(byteValue); // 최댓값이 127까지 인데 127이 초과해서 -128로 출력된거임
    }
    public void casting2(){
        // 큰 타입을 작은타입으로 변환할때 생기는 값은 에측이 어렵다
        short shortValue = 256;
        byte byteValue = (byte)shortValue; // byte를 short로 강제 형변환을 시도 함
        System.out.println(byteValue); // 0이 나옴 왜? byte가 short보다 작아서 값을 표현할수가 없어서 0이 나온다
        shortValue = 255; // short를 255를 넣음
        byteValue = (byte) shortValue; // short를 byte로 강제 형변환함
        System.out.println(byteValue); // byte값을 출력하면 1이 나옴 왜? 255가 byte에 넣을수 없는 값이라서 오버플로우 규칙에 의해서 1이 나온다
    }
    public void compound(){
        int num = 10;
        num += 5;
        System.out.println(num); // 15
        num -= 5;
        System.out.println(num); // 10
        num *= 5;
        System.out.println(num); // 50
        num /= 5;
        System.out.println(num); // 10
        num %= 5;
        System.out.println(num); // 0
    }
}
