package Task1.Pojo;

public class Version {
    private final int major;
    private final int minor;
    private final int maintenance;

    public Version(int major, int minor, int maintenance) {
        this.major = major;
        this.minor = minor;
        this.maintenance = maintenance;
    }

    @Override
    public String toString() {
        return this.major + "." + this.minor + "." + this.maintenance;
    }

    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }

    public int getMaintenance() {
        return maintenance;
    }

}
