package Java_attestation;

public class NoteBook {
    private String name;
    private int ram;
    private int hdd;
    private String oc;
    private String color;

    public void setName(String name, String color, String oc) {
        this.name = name;
        this.color = color;
        this.oc = oc;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOc() {
        return oc;
    }

    public String getColor() {
        return color;
    }
}
