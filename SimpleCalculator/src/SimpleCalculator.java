import java.util.Scanner;

public class SimpleCalculator {
    
    public SimpleCalculator(){
        System.out.println("Welcome to CLI Calculator !");
        }
    
    public void SimpleCalculation(Integer num1, String operator, Integer num2){
        
        if (operator.equals("+")){
            System.out.println("The answer is : " + SimpleSum(num1, num2));
        }
        else if (operator.equals("-")){
            System.out.println("The answer is : " + SimpleSub(num1, num2));
        }
        else if (operator.equals("*")){
            System.out.println("The answer is : " + SimpleMultiple(num1, num2));
        }
        else if (operator.equals("/")){
            System.out.println("The answer is : " + SimpleDivide(num1, num2));
        }
        else{
            System.out.println("Error ! Unknown operator");
        }    
    }

    public int SimpleSum(Integer num1, Integer num2){
        return num1 + num2;
    }
    public int SimpleSub(Integer num1, Integer num2){
        return num1 - num2;
    }
    public int SimpleMultiple(Integer num1, Integer num2){
        return num1 * num2;
    }
    public float SimpleDivide(Integer num1, Integer num2){
        return (float) num1 / num2;
    }
    public static void main(String[] args) throws Exception {
        
        Scanner userinput = new Scanner(System.in);
        SimpleCalculator Calculator = new SimpleCalculator();
        while (true) {
            try{
            System.out.print("Enter the calculation [x + y] : ");
            String CalculationInput = userinput.nextLine();
            if (CalculationInput.equalsIgnoreCase("Exit")){
                break;
            }
            String[] Calculation = CalculationInput.split("\\s+");

            Integer num1 = Integer.parseInt(Calculation[0]);
            String operator = Calculation[1];
            Integer num2 = Integer.parseInt(Calculation[2]);
            
                Calculator.SimpleCalculation(num1, operator, num2);}
            catch (Exception e){
                System.out.println("Error ! : " + e.getMessage());
            }
        }
        userinput.close();
    }
}
