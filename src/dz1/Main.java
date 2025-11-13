package dz1;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(1, "Toyota", "Camry", "Red", 25000.0, 2112, "A123BC"),
                new Car(2, "BMW", "X5", "Black", 55000.0,2018, "B456DE"),
                new Car(3, "Toyota", "Corolla", "Blue", 18000.0, 2010,"C789FG"),
                new Car(4, "Ford", "Focus", "White", 15000.0, 2000,"D012HI"),
                new Car(5, "Toyota", "RAV4", "Silver", 28000.0, 2025,"E345JK"),
                new Car(6, "BMW", "3 Series", "Gray", 30000.0, 2016,"F678LM")
        };
        System.out.println(" Все машины марки Toyota ");
        Car[] toyotas = getCarByBrend(cars, "Toyota");
        for (Car car : toyotas) {
            System.out.println(car.getBrand() + " " + car.getModel() + " (" + car.getYear() + ")");
        }
        System.out.println("\n Toyota, эксплуатируемые дольше 5 лет ");
        Car[] oldToyotas = getCarByBrendAndYearOperational(cars, "Toyota", 5);
        for (Car car : oldToyotas) {
            int age = java.time.Year.now().getValue() - car.getYear();
            System.out.println(car.getBrand() + " " + car.getModel() + " (" + car.getYear() + ") — возраст: " + age + " лет");
        }
    }
    public static Car[] getCarByBrend(Car[] cars, String brend){
        int count = 0;
        for (Car car : cars) {
            if (car != null && brend.equals(car.getBrand())) {
                count++;
            }
        }
        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car != null && brend.equals(car.getBrand())) {
                result[index] = car;
                index++;
            }
        }
        return result;
    }
    public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brand, int years) {
        int currentYear = java.time.Year.now().getValue();
        int count = 0;
        for (Car car : cars) {
            if (car != null && brand.equals(car.getBrand())) {
                int age = currentYear - car.getYear();
                if (age > years) {
                    count++;
                }
            }
        }
        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car != null && brand.equals(car.getBrand())) {
                int age = currentYear - car.getYear();
                if (age > years) {
                    result[index] = car;
                    index++;
                }
            }
        }
        return result;
    }
}