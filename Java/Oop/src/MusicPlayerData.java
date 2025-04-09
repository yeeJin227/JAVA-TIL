//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class MusicPlayerData {
    boolean isOn = false;
    int volumn = 0;

    public MusicPlayerData() {
    }

    void on() {
        this.isOn = true;
        System.out.println("플레이어 on");
    }

    void off() {
        this.isOn = false;
        System.out.println("플레이어 off");
    }

    void volumnUp() {
        ++this.volumn;
        System.out.println("볼륨: " + this.volumn);
    }

    void volumnDown() {
        --this.volumn;
        System.out.println("볼륨: " + this.volumn);
    }
}
