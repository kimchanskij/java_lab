package lab2_4;

public class Computer {
    private String name;
    private String os;
    private String cpu;
    private String videocard;

    public Computer(String name, String os, String cpu, String videocard) {
        this.name = name;
        this.os = os;
        this.cpu = cpu;
        this.videocard = videocard;
    }

    public String getName() {
        return name;
    }

    public String getOs() {
        return os;
    }

    public String getCpu() {
        return cpu;
    }

    public String getVideocard() {
        return videocard;
    }

    @Override
    public String toString() {
        return "Название: " + name + ", OS: " + os + ", CPU: " + cpu + ", Video card: " + videocard;
     }
}
