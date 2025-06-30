public class UnitConverter {

    public UnitConverter(){
        System.out.println("===== Unit Converter =====");
    }

    public double lengthConverter(String type, Double value){
        double answer = 0.0;
        switch (type) {
            case "Meter -> Kilometer":
                answer = (double) value / 1000;
                break;
        
            case "Centimeter -> Meter":
                answer = (double) value / 100;
                break;
            
            case "Inch -> Centimeter":
                answer = (double) value * 2.54;
                break;

            case "Foot -> Meter":
                answer = (double) value / 3.281;
                break;
            
            case "Kilometer -> Meter":
                answer = (double) value * 1000;
                break;
            
            case "Meter -> Centimeter":
                answer = (double) value * 100;
                break;
            
            case "Centimeter -> Inch":
                answer = (double) value / 2.54;
                break;

            case "Meter -> Foot":
                answer = (double) value * 3.281;
                break;
        }
        return answer;
    }
    public double weightConverter(String type, Double value){
        double answer = 0.0;
        switch (type) {
            case "Kilogram -> Gram":
                answer = (double) value * 1000;
                break;

            case "Pound -> Kilogram":
                answer = (double) value / 2.205;
                break;
            
            case "Ounce -> Gram":
                answer = (double) value * 28.35;
                break;
            
            case "Gram -> Kilogram":
                answer = (double) value / 1000;
                break;
            
            case "Kilogram -> Pound":
                answer = (double) value * 2.205;
                break;
            
            case "Gram -> Ounce":
                answer = (double) value / 28.35;
                break;
        }
        return answer;
    }
    public double temperatureConverter(String type, Double value){
        double answer = 0.0;
        switch (type) {
            case "Celcius -> Farenheit":
                answer = ((double) value * 9/5) + 32;
                break;
        
            case "Celcius -> Kelvin":
                answer = (double) value + 273.15;
                break;
            
            case "Farenheit -> Celcius":
                answer = ((double) value - 32) * 5/9;
                break;
            case "Kelvin -> Celcius":
                answer = (double) value - 273.15;
                break;
        }
        return answer;
    }
    public double timeConverter(String type, Double value){
        double answer = 0.0;
        switch (type) {
            case "Second -> Minute":
                answer = (double) value / 60;
                break;

            case "Minute -> Hour":
                answer = (double) value / 60;
                break;
            
            case "Hour -> Day":
                answer = (double) value / 24;
                break;

            case "Minute -> Second":
                answer = (double) value * 60;
                break;
            
            case "Hour -> Minute":
                answer = (double) value * 60;
                break;
            
            case "Day -> Hour":
                answer = (double) value * 24;
                break;

        }
        return answer;
    }
    public double volumeConverter(String type, Double value){
        double answer = 0.0;
        switch (type) {
            case "Liter -> Mililiter":
                answer = (double) value * 1000;
                break;

            case "Gallon -> Liter":
                answer = (double) value * 3.785;
                break;

            case "Mililiter -> Liter":
                answer = (double) value / 1000;
                break;
            
            case "Liter -> Gallon":
                answer = (double) value / 3.785;
        }
        return answer;
    }
}
