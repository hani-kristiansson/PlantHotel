package planthotel;

// interface
// varför abstract class? : plant kan inte vara en giltig objekt men subklasser kan vara
public abstract class Plants implements ICalculateLiquid {

    //inkapsling
    private String name;
    private double height;

    // constructor som används i 3 subklasser
    public Plants(String name, double height) {
        this.name = name;
        this.height = height;
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
