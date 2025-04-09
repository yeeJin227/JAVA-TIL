// 객체 지향 프로그래밍이 나오기 전까지는 데이터와 기능이 분리되어있었다.
// 그런데, 객체 지향 프로그래밍이 나오면서 데이터와 기능을 하나로 묶어서 사용할 수 있게 되었다.

// 클래스는, 데이터(멤버변수)와 메서드를 포함할 수 있다.

public class MusicPlayer {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData(); //뮤직플레이어데이터 객체 생성

        data.on();
        data.volumnUp();
        data.volumnUp();
        data.volumnDown();

        data.off();

    }
}
