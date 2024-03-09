package If;

public class ControlIf {
    public static void main(String[] args) {
        ControlIf sumin = new ControlIf();
        sumin.sumin();
    }
    public void sumin(){
        if(true); // if가 true임
        if(true) System.out.println("it's true"); // 조건중 if가 true일때 출력문이 나옴
        if(true) // if가 true 일때
            System.out.println("It's alos true."); // 이 문장을 출력함
        if(false) System.out.println("It's false"); // 만약 위에 문장에 false 일때 출력하는데 이건 true가 아니기 때문에 출력이 되지 않지
    }
}
