package paket.Automobiles;
public class Car extends MainInfo1 {
    private String driverName;
    private String EngineName;

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }


    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getEngineName() {
        return EngineName;
    }

    public void setEngineName(String engineName) {
        EngineName = engineName;
    }

    public void toStringTest() {
        System.out.println( "Car Brand: " + getCarBrend() + "\n"
                + "Car Class: " + getCarClass() + "\n"
                + "Car Weight (kg): " + getCarWeight() + "\n"
                + "Driver: " + driverName + "\n"
                + "Engine VIN: " +  EngineName);

    }
}

