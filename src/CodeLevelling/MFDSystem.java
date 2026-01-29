package CodeLevelling;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class MFDSystem{
public static ArrayList<String> transactionHistory = new ArrayList<>();
public static void main(String...args){
Scanner input = new Scanner(System.in);
//java.util.Scanner input = new java.util.Scanner(System.in);


menu:while(true){
    System.out.println("""
    === WELCOME TO SAMMYCEE PETROLEUM ===
    1. Buy Petroleum.
    2. Show Transaction history.
    0. Exit
    """);
    
    int option = isValidInt(input, "Enter an option");
    switch (option){
        case 1 -> {
            System.out.println("""
            Available Petroleum
            1. Petrol => 650/Liter
            2. Diesel => 720/Liter
            3. Kerosene => 550/Liter
            4. Gas => 480/Liter
            0. Back
            """);
            option:while(true){
            int fuelOption =  isValidInt(input, "Enter an option");
                switch(fuelOption){
                    case 1 -> {
                        input.nextLine();
                        String petrolOption = isValidPetrolOption(input);
                        double petrolValue = handlePetrolPurchase(input, petrolOption);
                        processAndPrintReceipt("Petrol",petrolOption,petrolValue, 650,"L");
                        break option;
                        }
                    case 2 -> {
                        input.nextLine();
                        String dieselOption = isValidDiestelOption(input);
                        double dieselValue = handleDieselPurchase(input, dieselOption);
                        processAndPrintReceipt("Diesel",dieselOption,dieselValue, 720,"L");
                        break option;
                        }
                    case 3 -> {
                        input.nextLine();
                        String keroseneOption = isValidKeroseneOption(input);
                        double keroseneValue = handleKerosenePurchase(input, keroseneOption);
                        processAndPrintReceipt("Kerosene",keroseneOption,keroseneValue, 550,"L");
                        break option;
                        }
                    case 4 -> {
                        input.nextLine();
                        String gasOption = isValidGasOption(input);
                        double gasValue = handleGasPurchase(input, gasOption);
                        processAndPrintReceipt("Gas",gasOption,gasValue, 480,"Kg");
                        break option;
                        }
                    case 0 -> {break option;}
                    default -> System.out.println("invalid Option. Try again");
                }
                }   
        }
        case 2 -> {
        showTransactionHistory();
        }
        case 0 ->{break menu;}
        default -> System.out.println("invalid Option. Try again");
    }
}
}

public static void showTransactionHistory() {
    if (transactionHistory.isEmpty()) {
        System.out.println("No transactions yet.");
        return;
    }

    System.out.println("All Transactions");

    for (int count = 0; count < transactionHistory.size(); count++) {
        System.out.println(transactionHistory.get(count));
    }
}


public static void saveTransaction(String petroleumName,double amount,double liters,String unitLabel) {
LocalDate date = LocalDate.now();
    String receipt = 
            "==================================\n" +
            "Product" +": " + petroleumName + "\n" +
            "Amount" + ": #" + amount + "\n" +
            "Liters" + ": " + liters + unitLabel + "\n" +
            "Date" +": " + date + "\n" +
            "==================================";

transactionHistory.add(receipt);
}


public static void processAndPrintReceipt( String petroleumName, String option, double value, double pricePerUnit, String unitLabel) {
double amount;
double units;
    if (option.equals("amount")) {
        amount = value;
        units = amount / pricePerUnit;
    } else { 
        units = value;
        amount = units * pricePerUnit;
    }

    printReceipt(petroleumName, amount, units, unitLabel);
    saveTransaction(petroleumName, amount, units, unitLabel);
}

public static void printReceipt(String product, double amount, double units, String unitLabel ) {
    System.out.println("Customers Transaction Receipt");
    System.out.println("==================================");
    System.out.println("Product : " + product);
    System.out.println("Amount  : #" + amount);
    System.out.println("Liters  : " + units + unitLabel);
    System.out.println("Thank you For your Patronage");
    System.out.println("==================================");
}


public static double handlePetrolPurchase( Scanner input, String petrolOption) {
if (petrolOption.equals("amount")) {
    double petrolOptionAmount =
            isValidDouble(input, "How much petrol are you buying?");

    while (isValidAmountPetrol(petrolOptionAmount) == false) {
        System.out.println(
            "Amount must be greater than a liter price and not more than the price of 50 litres"
        );
        petrolOptionAmount =
            isValidDouble(input, "How much petrol are you buying?");
    }

    return petrolOptionAmount;
} else if (petrolOption.equals("liter")) {
    double petrolOptionLiter =
            isValidDouble(input, "How many liters of petrol are you buying?");
    while (isValidFuel(petrolOptionLiter) == false) {
        System.out.println(
            "Liter must be more than a liter and not more than 50 litres"
        );
        petrolOptionLiter =
            isValidDouble(input, "How many liters of petrol are you buying?");
    }
    return petrolOptionLiter;
}
return 0; 
}

public static double handleDieselPurchase( Scanner input, String dieselOption) {
if (dieselOption.equals("amount")) {
    double dieselOptionAmount =
            isValidDouble(input, "How much diesel are you buying?");
    while (isValidAmountDiesel(dieselOptionAmount) == false) {
        System.out.println(
            "Amount must be greater than a liter price and not more than the price of 50 litres"
        );
        dieselOptionAmount =
            isValidDouble(input, "How much diesel are you buying?");
    }
    return dieselOptionAmount;
} else if (dieselOption.equals("liter")) {
    double dieselOptionLiter =
            isValidDouble(input, "How many liters of diesel are you buying?");
    while (isValidFuel(dieselOptionLiter) == false) {
        System.out.println(
            "Liter must be more than a liter and not more than 50 litres"
        );
        dieselOptionLiter =
            isValidDouble(input, "How many liters of diesel are you buying?");
    }
    return dieselOptionLiter;
}

return 0; 
}


public static double handleGasPurchase(Scanner input, String gasOption) {
if (gasOption.equals("amount")) {
    double gasOptionAmount =
            isValidDouble(input, "How much gas are you buying?");
    while (isValidAmountGas(gasOptionAmount) == false) {
        System.out.println(
            "Amount must be greater than a kilogram price and not more than the price of 50 kilograms"
        );
        gasOptionAmount =
            isValidDouble(input, "How much gas are you buying?");
    }
    return gasOptionAmount;
} else if (gasOption.equals("kilogram")) {
    double gasOptionLiter =
            isValidDouble(input, "How many kilogram of gas are you buying?");

    while (isValidFuel(gasOptionLiter) == false) {
        System.out.println(
            "Liter must be more than a kilogram and not more than 50 kilograms"
        );
        gasOptionLiter =
            isValidDouble(input, "How many kilogram of gas are you buying?");
    }
    return gasOptionLiter;
}
return 0; 
}


public static double handleKerosenePurchase(Scanner input, String keroseneOption) {
if (keroseneOption.equals("amount")) {
    double keroseneOptionAmount = isValidDouble(input, "How much kerosene are you buying?");
    while (isValidAmountKerosene(keroseneOptionAmount) == false) {
        System.out.println( "Amount must be greater than a liter price and not more than the price of 50 litres");
        keroseneOptionAmount = isValidDouble(input, "How much kerosene are you buying?");
    }
    return keroseneOptionAmount;
} else if (keroseneOption.equals("liter")) {
    double keroseneOptionLiter =
            isValidDouble(input, "How many liters of kerosene are you buying?");
    while (isValidFuel(keroseneOptionLiter) == false) {
        System.out.println("Liter must be more than a liter and not more than 50 litres");
        keroseneOptionLiter = isValidDouble(input, "How many liters of kerosene are you buying?");
    }
    return keroseneOptionLiter;
}
return 0; 
}


public static String isValidGasOption(Scanner input){
System.out.print("Kilogram or Amount: ");
String gasOption = input.nextLine().toLowerCase().trim();
                        
while(isValidGasOption(gasOption) == false){
    System.out.print("Invalid Option. Enter Kilogram or Amount");
     gasOption = input.nextLine().toLowerCase().trim();
}
return gasOption;
}

public static String isValidKeroseneOption(Scanner input){
System.out.print("Liter or Amount: ");
String keroseneOption = input.nextLine().toLowerCase().trim();
                        
while(isValidPetrolOption(keroseneOption) == false){
    System.out.print("Invalid Option. Enter Liter or Amount");
     keroseneOption = input.nextLine().toLowerCase().trim();
}
return keroseneOption;
}

public static String isValidDiestelOption(Scanner input){
System.out.print("Liter or Amount: ");
String dieselOption = input.nextLine().toLowerCase().trim();
                        
while(isValidPetrolOption(dieselOption) == false){
    System.out.print("Invalid Option. Enter Liter or Amount");
     dieselOption = input.nextLine().toLowerCase().trim();
}
return dieselOption;
}

public static String isValidPetrolOption(Scanner input){
System.out.print("Liter or Amount: ");
String petrolOption = input.nextLine().toLowerCase().trim();
                        
while(isValidPetrolOption(petrolOption) == false){
    System.out.println("Invalid Option. Enter Liter or Amount");
    petrolOption = input.nextLine().toLowerCase().trim();
}
return petrolOption;
}

public static int isValidInt(Scanner input, String option){
int number = 0;   
 while(true){
        System.out.println(option);
        
        if(input.hasNextInt()){
          number = input.nextInt();
            break;
        }else{
         System.out.println("Invalid Option, Enter a Valid Option");
         input.next();
        }
    }
 return number;
}

public static double isValidDouble(Scanner input, String option){
double decimal = 0;   
 while(true){
        System.out.println(option);
        
        if(input.hasNextDouble()){
          decimal = input.nextDouble();
            break;
        }else{
         System.out.println("Invalid Option, Enter a Valid Option");
         input.next();
        }
    }
 return decimal;
}

public static boolean isValidGasOption(String gasOption){
if(gasOption.equals("kilogram")  || gasOption.equals ("amount" )){
return true;
}
return false;
}

public static boolean isValidPetrolOption(String petrolOption){
if(petrolOption.equals("liter")  || petrolOption.equals ("amount" )){
return true;
}
return false;
}

public static boolean isValidFuel(double liter){
final int MAXIMUMLITER = 50;
final int MINIMUMLITER = 1;

if(liter > MAXIMUMLITER || liter < MINIMUMLITER){
return false;}
return true;
}

public static boolean isValidAmountPetrol(double amount){
final int TOTALAMOUNT = 50 * 650;
final int MINIMUMAMOUNT = 650;

if(amount > TOTALAMOUNT || amount < MINIMUMAMOUNT){
return false;}
return true;
}

public static boolean isValidAmountDiesel(double amount){
final int TOTALAMOUNT = 50 * 720;
final int MINIMUMAMOUNT = 720;

if(amount > TOTALAMOUNT || amount < MINIMUMAMOUNT){
return false;}
return true;
}

public static boolean isValidAmountGas(double amount){
final int TOTALAMOUNT = 50 * 480;
final int MINIMUMAMOUNT = 480;

if(amount > TOTALAMOUNT || amount < MINIMUMAMOUNT){
return false;}
return true;
}
public static boolean isValidAmountKerosene(double amount){
final int TOTALAMOUNT = 50 * 550;
final int MINIMUMAMOUNT = 550;

if(amount > TOTALAMOUNT || amount < MINIMUMAMOUNT){
return false;}
return true;
}
}
