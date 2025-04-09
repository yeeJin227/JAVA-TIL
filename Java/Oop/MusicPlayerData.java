public class MusicPlayerData {
    boolean isOn = false;
    int volumn = 0;

    void on() {
        isOn = true;
        System.out.println("플레이어 on");
    }

    void off() {
        isOn = false;
        System.out.println("플레이어 off");
    }

    void volumnUp() {
        volumn++;
        System.out.println("볼륨: " + volumn);
    }

    void volumnDown() {
        volumn--;
        System.out.println("볼륨: " + volumn);
    }

    //음악 플레이어의 속성과 기능이 하나의 클래스 안에 담겨있다.
    //이렇게 속성과 가능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부로 제공하는 것을 '캡슐화'라고 한다.

}