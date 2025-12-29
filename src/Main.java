class car {
    private int carId;
    private String carModel;
    private String carBrand;
    private double basePricePerDay;
    private boolean isAvailable;

    public car(int carId, String carModel, String carBrand, double basePricePerDay) {
        this.carId = carId;
        this.carModel = carModel;
        this.carBrand = carBrand;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }

    public int getCarId() {
        return carId;
    }

    public String getCarModel(){
        return carModel;
    }
    public String getCarBrand(){
        return carBrand;
    }

    public double calculatePrice(int rentalDays) {
        return basePricePerDay * rentalDays;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void rent() {
        isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }
}

class coustomer{
    private String coustomerId;
    private String name;

    public coustomer(String coustomerId , String name){
        this.coustomerId = coustomerId ;
        this.name = name;
    }

    public String getCoustomerId(){
        return coustomerId;
    }

    public String getName() {
        return name ;
    }
}

class rental{
    private car car;
    private coustomer coustomer;
    private int days;

    public rental(car car , coustomer coustomer , int days){
        this.car = car;
        this.coustomer = coustomer;
        this.days = days;
    }

    public car getCar() {
        return car;
    }

    public coustomer getCoustomer() {
        return coustomer;
    }

    public int getDays() {
        return days;
    }
}

class carRentalSystem{

}







public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");
    }
}