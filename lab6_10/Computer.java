package lab6_10;

public class Computer {
    private Processor cpu;
    private Monitor monitor;
    private Memory memory;
    private Brands brand;


    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public String toString() {
        return String.format("Марка: %s, Процессор: %s, Память: %d, Монитор: %s", brand, cpu.getName(), memory.getMemory(), monitor.getName());
    }
}
