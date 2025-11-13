public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(1, "Toyota", "Camry", "Red", 25000.0, "A123BC", 2018),
                new Car(2, "BMW", "X5", "Black", 55000.0, "B456DE", 2020),
                new Car(3, "Toyota", "Corolla", "Blue", 18000.0, "C789FG", 2015),
                new Car(4, "Ford", "Focus", "White", 15000.0, "D012HI", 2022),
                new Car(5, "Toyota", "RAV4", "Silver", 28000.0, "E345JK", 2010),
                new Car(6, "BMW", "3 Series", "Gray", 30000.0, "F678LM", 2017)
        };
        System.out.println("=== Все машины марки Toyota ===");
        Car[] toyotas = getCarByBrend(cars, "Toyota");
        for (Car car : toyotas) {
            System.out.println(car.getBrand() + " " + car.getModel() + " (" + car.getYear() + ")");
        }
        System.out.println("\n=== Toyota, эксплуатируемые дольше 5 лет ===");
        Car[] oldToyotas = getCarByBrendAndYearOperational(cars, "Toyota", 5);
        for (Car car : oldToyotas) {
            int age = java.time.Year.now().getValue() - car.getYear();
            System.out.println(car.getBrand() + " " + car.getModel() + " (" + car.getYear() + ") — возраст: " + age + " лет");
        }
    }
    public static void  Car[] getCarByBrend(Car[] cars, String brend){
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