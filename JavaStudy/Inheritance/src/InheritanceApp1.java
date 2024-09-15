class Call {
    public int sum(int v1, int v2){
        return v1+v2;
    }
}
/*
* 많은 사람이 쓰거나, 내가 만든 클래스가 아니거나,
* 자바가 가지고 있는 내장된 클래스는 수정 불가함.
* 새 클래스를 만들고 싶다면 복사해서 바꿈
*/

class Call2{
    public int sum(int v1, int v2){
        return v1+v2;
    }
    public int minus(int v1, int v2){
        return v1-v2;
    }
}

/*
* 이 상태도 만족 못하는 경우? 버그 있는 경우?
* 일일이 수정하는게 어렵고 코드가 많아질 수 있음.
* 이 경우 '상속'을 이용함.
*/


class Call3 extends Call {

}

public class InheritanceApp1 {
    public static void main(String[] args){
        Call c = new Call();
        System.out.println(c.sum(2,1));

        Call3 c3 = new Call3 ();
        System.out.println(c3.sum(2,1));
    }
}
/*
   상속은 어떠한 클래스가 있을 때 그 클래스의 변수와 메소드를
   확장해서 다른 클래스가 갖게 함.
   (재사용성, 유지보수, 가독성 향상 및 코드의 양 줄임)
 */