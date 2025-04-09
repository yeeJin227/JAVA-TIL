
// 객체 지향 프로그래밍이 나오기 전까지는 데이터와 기능이 분리되어있었다.
// 그런데, 객체 지향 프로그래밍이 나오면서 데이터와 기능을 하나로 묶어서 사용할 수 있게 되었다.
// 즉, 객체지향과 절차지향의 중요한 차이는 : 절차지향은 데이터와 기능이 분리되어있지만, 객체지향은 데이터와 그 데이터에 대한 기능이 하나의 객체 안에 포함되어있다는 것이다(=캡슐화).
// 객체 지향 프로그래밍은 모든 사물을 속성과 기능을 가진 객체로 생각한다. 객체에는 속성과 기능만 존재한다.
// 이렇듯, 객체 지향의 특징에는 속성과 기능을 하나로 묶는 캡슐화가 있다.


package musicplayer;

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
