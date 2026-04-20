package thigk2.doanphiphong;

public class LandScapeNT {
    private String imageName;
    private String name;
    private String address;

    public LandScapeNT(String imageName, String name, String address) {
        this.imageName = imageName;
        this.name = name;
        this.address = address;
    }

    public String getImageName() { return imageName; }
    public String getName() { return name; }
    public String getAddress() { return address; }
}