package LecturesAndExercises.p18ObjectsAndClassesMoreExercise.P02RawData;



public class Car {
    String model;
    Tyre[] tyreSet;
    Engine engine;
    Cargo cargo;
    public class Engine{
        int speed;
        int power;

        public Engine(int speed, int power) {
            this.speed = speed;
            this.power = power;
        }

        public int getPower() {
            return power;
        }
    }
    public class Cargo{
        int weight;
        String type;

        public Cargo(int weight, String type) {
            this.weight = weight;
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }
    public class Tyre{
        double pressure;
        int age;

        public Tyre(double airPressure, int age) {
            this.pressure = airPressure;
            this.age = age;
        }

        public double getPressure() {
            return pressure;
        }
    }

    public Car(String model,int engineSpeed, int enginePower, int cargoWeiht, String cargoType, double press1, int age1, double press2, int age2, double press3 , int age3, double press4, int age4 ) {
        this.model = model;
        this.engine  = new Engine(engineSpeed, enginePower);
        this.cargo = new Cargo(cargoWeiht, cargoType);
        Tyre one = new Tyre(press1, age1);
        Tyre two = new Tyre(press2, age2);
        Tyre three = new Tyre(press3, age3);
        Tyre four = new Tyre(press4, age4);
        this.tyreSet = new Tyre[]{one, two, three, four};
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }
}
