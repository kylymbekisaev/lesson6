public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(20,30));
        System.out.println(ageAndTemperature(20,28 ));
        System.out.println(ageAndTemperature(45,25 ));
    }
    public static String ageAndTemperature(int age,int temperature){
        if (age >= 20 && age <= 45 && temperature >-20 && temperature <=30){
            return "Можно идти гулять";
        }else if (age < 20 && temperature >=0 && temperature <=28){
            return "Можно идти гулять";
        }else if (age > 45 && temperature >=-10 && temperature <=25){
            return "Можно идти гулять";
        }else {
            return "Остовайся дома";
        }

    }
}