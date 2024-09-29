package planthotel;

public class Plants {

    private String name;
    private double height;

    public Plants(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public Plants() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}