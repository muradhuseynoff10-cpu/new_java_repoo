public class Maincar {
    public static void main(String[] args) {
        car car = new car();

        car.model = "BMW";
        car.color = "Grey";
        car.speed = 350;
        car.price = 145000;

        car.showInfo();
    }
}