import java.util.Scanner;

public class App {
    public static UnitConverter Checker = new UnitConverter();
    public App(){
        System.out.println("Welcome to UnitConverter ! ");
        System.out.println("Make sure to ennter value as double [0.0, 1.5, 2.75] !");
            }

    public void Converter(String category, String type, Double value){
        switch (category) {
            case "Length":
                System.out.println("The Value is " + Checker.lengthConverter(type, value));
                break;
            
            case "Weight":
                System.out.println("The Value is " + Checker.weightConverter(type, value));
                break;
            
            case "Temperature":
                System.out.println("The Value is " + Checker.temperatureConverter(type, value));
                break;
            
            case "Time":
                System.out.println("The Value is " + Checker.timeConverter(type, value));
                break;
            
            case "Volume":
                System.out.println("The Value is " + Checker.volumeConverter(type, value));
                break;
        }
    }


    public static void main(String[] args) throws Exception {
        boolean running = true;
        Scanner userinput = new Scanner(System.in);
        App ObjectConverter = new App();
        String userType;
        String userNumber;
        Double value;
        while (running) {
            System.out.println("==========================");
            System.out.println("Choose category:");
            System.out.println("1. Length");
            System.out.println("2. Weight");
            System.out.println("3. Temperature");
            System.out.println("4. Time");
            System.out.println("5. Volume");
            System.out.println("6. Exit");
            System.out.print("Your choice: ");

            String userChoice = userinput.nextLine();

            switch (userChoice) {
                
                case "1":
                    System.out.println("-------------------------");
                    System.out.println("Choose conversion: ");
                    System.out.println("1. Meter -> Kilometer");
                    System.out.println("2. Centimeter -> Meter");
                    System.out.println("3. Inch -> Centimeter");
                    System.out.println("4. Foot -> Meter");
                    System.out.println("5. Kilometer -> Meter");
                    System.out.println("6. Meter -> Centimeter");
                    System.out.println("7. Centimeter -> Inch");
                    System.out.println("8. Meter -> Foot");
                    System.out.print("Your choice: ");
                    userType = userinput.nextLine();
                    System.out.print("Enter value: ");
                    userNumber = userinput.nextLine();
                    value = Double.parseDouble(userNumber);

                    switch (userType) {
                        case "1":
                            ObjectConverter.Converter("Length", "Meter -> Kilometer", value);
                            break;
                        case "2":
                            ObjectConverter.Converter("Length", "Centimeter -> Meter", value);
                            break;
                        case "3":
                            ObjectConverter.Converter("Length", "Inch -> Centimeter", value);
                            break;
                        case "4":
                            ObjectConverter.Converter("Length", "Foot -> Meter", value);   
                            break;
                        case "5":
                            ObjectConverter.Converter("Length", "Kilometer -> Meter", value);
                            break;
                        case "6":
                            ObjectConverter.Converter("Length", "Meter -> Centimeter", value);
                            break;
                        case "7":
                            ObjectConverter.Converter("Length", "Centimeter -> Inch", value);
                            break;
                        case "8":
                            ObjectConverter.Converter("Length", "Meter -> Foot", value);
                            break;
                        }
                        continue;

                case "2":
                    System.out.println("-------------------------");
                    System.out.println("Choose conversion: ");
                    System.out.println("1. Kilogram -> Gram");
                    System.out.println("2. Pound -> Kilogram");
                    System.out.println("3. Ounce -> Gram");
                    System.out.println("4. Gram -> Kilogram");
                    System.out.println("5. Kilogram -> Pound");
                    System.out.println("6. Gram -> Ounce");
                    System.out.print("Your choice: ");
                    userType = userinput.nextLine();
                    System.out.print("Enter value: ");
                    userNumber = userinput.nextLine();
                    value = Double.parseDouble(userNumber);
                    switch (userType) {
                        case "1":
                            ObjectConverter.Converter("Weight", "Kilogram -> Gram", value);
                            break;
                        case "2":
                            ObjectConverter.Converter("Weight", "Pound -> Kilogram", value);
                            break;
                        case "3":
                            ObjectConverter.Converter("Weight", "Ounce -> Gram", value);
                            break;
                        case "4":
                            ObjectConverter.Converter("Weight", "Gram -> Kilogram", value);
                            break;
                        case "5":
                            ObjectConverter.Converter("Weight", "Kilogram -> Pound", value);
                            break;
                        case "6":
                            ObjectConverter.Converter("Weight", "Gram -> Ounce", value);
                            break;
                        }
                        continue;
                case "3" :
                    System.out.println("-------------------------");
                    System.out.println("Choose conversion: ");
                    System.out.println("1. Celcius -> Farenheit");
                    System.out.println("2. Celcius -> Kelvin");
                    System.out.println("3. Farenheit -> Celcius");
                    System.out.println("4. Kelvin -> Celcius");
                    System.out.print("Your choice: ");
                    userType = userinput.nextLine();
                    System.out.print("Enter value: ");
                    userNumber = userinput.nextLine();
                    value = Double.parseDouble(userNumber);
                    switch (userType) {
                        case "1":
                            ObjectConverter.Converter("Temperature", "Celcius -> Farenheit", value);
                            break;
                        case "2":
                            ObjectConverter.Converter("Temperature", "Celcius -> Kelvin", value);
                            break;
                        case "3":
                            ObjectConverter.Converter("Temperature", "Farenheit -> Celcius", value);
                            break;
                        case "4":
                            ObjectConverter.Converter("Temperature", "Kelvin -> Celcius", value);
                        }
                        continue;
                case "4":
                    System.out.println("-------------------------");
                    System.out.println("Choose conversion: ");
                    System.out.println("1. Second -> Minute");
                    System.out.println("2. Minute -> Hour");
                    System.out.println("3. Hour -> Day");
                    System.out.println("4. Minute -> Second");
                    System.out.println("5. Hour -> Minute");
                    System.out.println("6. Day -> Hour");
                    System.out.print("Your choice: ");
                    userType = userinput.nextLine();
                    System.out.print("Enter value: ");
                    userNumber = userinput.nextLine();
                    value = Double.parseDouble(userNumber);
                    switch (userType) {
                        case "1":
                            ObjectConverter.Converter("Time", "Second -> Minute", value);
                            break;
                        case "2":
                            ObjectConverter.Converter("Time", "Minute -> Hour", value);
                            break;
                        case "3":
                            ObjectConverter.Converter("Time", "Hour -> Day", value);
                            break;
                        case "4":
                            ObjectConverter.Converter("Time", "Minute -> Second", value);
                            break;
                        case "5":
                            ObjectConverter.Converter("Time", "Hour -> Minute", value);
                            break;
                        case "6":
                            ObjectConverter.Converter("Time", "Day -> Hour", value);
                            break;
                        }
                        continue;
                case "5":
                    System.out.println("-------------------------");
                    System.out.println("Choose conversion: ");
                    System.out.println("1. Liter -> Mililiter");
                    System.out.println("2. Gallon -> Liter");
                    System.out.println("3. Mililiter -> Liter");
                    System.out.println("4. Liter -> Gallon");
                    System.out.print("Your choice: ");
                    userType = userinput.nextLine();
                    System.out.print("Enter value: ");
                    userNumber = userinput.nextLine();
                    value = Double.parseDouble(userNumber);
                    switch (userType) {
                        case "1":
                            ObjectConverter.Converter("Volume", "Liter -> Mililiter", value);
                            break;
                        case "2":
                            ObjectConverter.Converter("Volume", "Gallon -> Liter", value);
                            break;
                        case "3":
                            ObjectConverter.Converter("Volume", "Mililiter -> Liter", value);
                            break;
                        case "4":
                            ObjectConverter.Converter("Volume", "Liter -> Gallon", value);
                            break;
                    }
                    continue;
                    case "6":
                        System.out.println("Okay ! See ya !");
                        running = false;
                        break;
                    
            }
                    
        }
        userinput.close();
    }
        
}

