/*
    어떤 이유로 더하기 클래스가 필요함
    근데 시간이 부족함
    외주를 맡김, 메일로 보냄
    RealCal로 바꾸면 밑에 sum이 작동을 안 함.
    따라서 자바의 기능을 사용하여 규격을 엄격하게 요구함.

    인터페이스는 약속. 클래스의 형태를 규제함.
*/

interface Calculable{
    double PI = 3.14;
    int sum(int v1, int v2);
}

// 출력하는 기능이 필요할 때 인터페이스 사용 방법
// 메소드를 인터페이스에 정의할 때 내용 X (변수는 O)
interface Printable{
    void print();
}

// 하나의 클래스는 여러개의 인터페이스를 사용할 수 있음.
class RealCal implements Calculable, Printable{
    public int sum(int v1, int v2) {
        return v1+v2;
    }

    public void print() {
        System.out.println("This is RealCal!!");
    }
}

class AdvancedPrint implements Printable{
    public void print() {
        System.out.println("This is RealCal!!");
    }
}

/*
    클래스가 어떤 인터페이스를 구현하고 있을 때 컴파일에 성공했다는 것은
    그 인터페이스가 규제하고 있는 형태를 정확하게 엄수했다는 뜻임.
*/

public class InterfaceApp {
    public static void main(String[] args) {
        // 나한테 필요한 기능만? -> 기능 감추기
        Printable c = new AdvancedPrint();
        c.print();
    }
}

