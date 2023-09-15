package Device;

public class Television implements ElectronicDevice{
    private int volume = 0;
    private String name;
    public Television(String name) {
        this.name = name;
}
    @Override
    public void on() {
        System.out.println(name + "TELEVISION is on");
    }
    @Override
    public void off() {
        System.out.println(name + "TELEVISION is on");
    }
    @Override
    public void volumeUp() {
        volume ++;
        System.out.println(name + "RADIO Volume at: " + volume);
    }
    @Override
    public void volumeDown() {
        volume --;
        System.out.println(name + "RADIO Volume at: " + volume);
    }
}