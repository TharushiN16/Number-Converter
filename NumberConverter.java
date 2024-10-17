import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class NumberConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
	    mainMenu();
            displayMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    convertDecimal(scanner);
                    break;
                case 2:
                    convertBinary(scanner);
                    break;
                case 3:
                    convertOctal(scanner);
                    break;
                case 4:
                    convertHexadecimal(scanner);
                    break;
                case 5:
                    convertRoman(scanner);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);

        scanner.close();
    }

    private static void mainMenu() {                                                                           
        System.out.println("                                                                                       ");
        System.out.println("  _   _                 _                  _____                          _            ");
        System.out.println(" | \\ | |               | |                / ____|                        | |           ");
        System.out.println(" |  \\| |_   _ _ __ ___ | |__   ___ _ __  | |     ___  _ ____   _____ _ __| |_ ___ _ __ ");
        System.out.println(" | . ` | | | | '_ ` _ \\| '_ \\ / _ \\ '__| | |    / _ \\| '_ \\ \\ / / _ \\ '__| __/ _ \\ '__|");
        System.out.println(" | |\\  | |_| | | | | | | |_) |  __/ |    | |___| (_) | | | \\ V /  __/ |  | ||  __/ |   ");
        System.out.println(" |_| \\_|\\__,_|_| |_| |_|_.__/ \\___|_|     \\_____\\___/|_| |_|\\_/ \\___|_|   \\__\\___|_|   ");
        System.out.println("                                                                                       ");
        System.out.println("                                                                                       ");
    }
    private static void displayMenu() {
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("                                                                                       ");
        System.out.println("[01] Decimal Converter");
        System.out.println("[02] Binary Converter");
        System.out.println("[03] Octal Converter");
        System.out.println("[04] Hexadecimal Converter");
        System.out.println("[05] Roman Number Converter");
        System.out.println("                           ");
        System.out.print("Enter Option -> ");
    }

    private static void convertDecimal(Scanner scanner) {
        boolean validInput = false;

        while (!validInput) {
            System.out.println("                           ");
            System.out.println("+----------------------------+");
            System.out.println("|       Decimal Converter     |");
            System.out.println("+----------------------------+");
            System.out.println("                           ");

            System.out.print("Enter a Decimal number: ");
            int decimal = scanner.nextInt();
	    System.out.println("                           ");

            if (decimal < 0) {
		System.out.println("                           ");
                System.out.println("Invalid input...");
        	System.out.println("                           ");
                System.out.print("Do you want to input number again (Y/N) -> ");
                String retry = scanner.next();
                if (!retry.equalsIgnoreCase("Y")) {
                    return; 
                }
            } else {
                validInput = true;
                System.out.println("Binary number: " + Integer.toBinaryString(decimal));
                System.out.println("Octal number: " + Integer.toOctalString(decimal));
                System.out.println("Hexadecimal number: " + Integer.toHexString(decimal).toUpperCase());
		System.out.println("                           ");
                System.out.print("Do you want to go to homepage (Y/N) -> ");
	        System.out.println("                           ");
                String home = scanner.next();
                if (!home.equalsIgnoreCase("Y")) {
                    System.exit(0);
                }
            }
        }
    }

    private static void convertBinary(Scanner scanner) {
        boolean validInput = false;

        while (!validInput) {
            System.out.println("                           ");
            System.out.println("+----------------------------+");
            System.out.println("|        Binary Converter     |");
            System.out.println("+----------------------------+");
            System.out.println("                           ");

            System.out.print("Enter a Binary number: ");
            String binary = scanner.next();
	    System.out.println("                           ");

            try {
                int decimal = Integer.parseInt(binary, 2);
                validInput = true;
	        System.out.println("                           ");
                System.out.println("Decimal number: " + decimal);
                System.out.println("Octal number: " + Integer.toOctalString(decimal));
                System.out.println("Hexadecimal number: " + Integer.toHexString(decimal).toUpperCase());
        	System.out.println("                           ");
                System.out.print("Do you want to go to homepage (Y/N) -> ");
                String home = scanner.next();
                if (!home.equalsIgnoreCase("Y")) {
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
	        System.out.println("                           ");
                System.out.println("Invalid input...");
	        System.out.println("                           ");
                System.out.print("Do you want to input number again (Y/N) -> ");
                String retry = scanner.next();
                if (!retry.equalsIgnoreCase("Y")) {
                    return; 
                }
            }
        }
    }

    private static void convertOctal(Scanner scanner) {
        boolean validInput = false;

        while (!validInput) {
	    System.out.println("                              ");
            System.out.println("+----------------------------+");
            System.out.println("|         Octal Converter     |");
            System.out.println("+----------------------------+");
            System.out.println("                           ");

            System.out.print("Enter an Octal number: ");
            String octal = scanner.next();
	    System.out.println("                           ");

            try {
                int decimal = Integer.parseInt(octal, 8);
                validInput = true;
	        System.out.println("                           ");
                System.out.println("Decimal number: " + decimal);
                System.out.println("Binary number: " + Integer.toBinaryString(decimal));
                System.out.println("Hexadecimal number: " + Integer.toHexString(decimal).toUpperCase());
	        System.out.println("                           ");
                System.out.print("Do you want to go to homepage (Y/N) -> ");
                String home = scanner.next();
                if (!home.equalsIgnoreCase("Y")) {
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
	        System.out.println("                           ");
                System.out.println("Invalid input...");
	        System.out.println("                           ");
                System.out.print("Do you want to input number again (Y/N) -> ");
                String retry = scanner.next();
                if (!retry.equalsIgnoreCase("Y")) {
                    return;
                }
            }
        }
    }

    private static void convertHexadecimal(Scanner scanner) {
        boolean validInput = false;

        while (!validInput) {
	    System.out.println("                           ");
            System.out.println("+----------------------------+");
            System.out.println("|      Hexadecimal Converter  |");
            System.out.println("+----------------------------+");
            System.out.println("                           ");

            System.out.print("Enter a Hexadecimal number: ");
            String hex = scanner.next();
	    System.out.println("                           ");

            try {
                int decimal = Integer.parseInt(hex, 16);
                validInput = true;
	        System.out.println("                           ");
                System.out.println("Decimal number: " + decimal);
                System.out.println("Binary number: " + Integer.toBinaryString(decimal));
                System.out.println("Octal number: " + Integer.toOctalString(decimal));
	        System.out.println("                           ");
                System.out.print("Do you want to go to homepage (Y/N) -> ");
                String home = scanner.next();
                if (!home.equalsIgnoreCase("Y")) {
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
	        System.out.println("                           ");
                System.out.println("Invalid input...");
	        System.out.println("                           ");
                System.out.print("Do you want to input number again (Y/N) -> ");
                String retry = scanner.next();
                if (!retry.equalsIgnoreCase("Y")) {
                    return; 
                }
            }
        }
    }

    private static void convertRoman(Scanner scanner) {
        System.out.print("Enter a decimal number to convert to Roman: ");
        int decimal = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Roman: " + toRoman(decimal));
    }

    private static String toRoman(int number) {
        String[] m = {"", "M", "MM", "MMM"};
        String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] x = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return m[number / 1000] +
               c[(number % 1000) / 100] +
               x[(number % 100) / 10] +
               i[number % 10];
    }
}


class RomanNumberConverter {

    private static final Map<Character, Integer> romanToDecimal = new HashMap<>();
    private static final Map<Integer, String> decimalToRoman = new HashMap<>();

    static {
        romanToDecimal.put('I', 1);
        romanToDecimal.put('V', 5);
        romanToDecimal.put('X', 10);
        romanToDecimal.put('L', 50);
        romanToDecimal.put('C', 100);
        romanToDecimal.put('D', 500);
        romanToDecimal.put('M', 1000);

        decimalToRoman.put(1, "I");
        decimalToRoman.put(4, "IV");
        decimalToRoman.put(5, "V");
        decimalToRoman.put(9, "IX");
        decimalToRoman.put(10, "X");
        decimalToRoman.put(40, "XL");
        decimalToRoman.put(50, "L");
        decimalToRoman.put(90, "XC");
        decimalToRoman.put(100, "C");
        decimalToRoman.put(400, "CD");
        decimalToRoman.put(500, "D");
        decimalToRoman.put(900, "CM");
        decimalToRoman.put(1000, "M");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("+--------------------------------+");
            System.out.println("|      Roman Number Converter    |");
            System.out.println("+--------------------------------+");
	    System.out.println("                                  ");
            System.out.println("[01] Decimal Number to Roman Number Converter");
	    System.out.println("                                             ");
            System.out.println("[02] Roman Number to Decimal Number Converter");
	    System.out.println("                                             ");
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
	    	    System.out.println("                                                    ");
	            System.out.println("+--------------------------------------------------+");
            	    System.out.println("|      Decimal Number to Roman Number Converter    |");
                    System.out.println("+--------------------------------------------------+");
	            System.out.println("                                  ");
                    System.out.print("Enter a Decimal number: ");
                    int decimal = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Roman numeral: " + convertDecimalToRoman(decimal));
                    break;
                case 2:
	    	    System.out.println("                                                    ");
	            System.out.println("+--------------------------------------------------+");
            	    System.out.println("|      Roman Number to Decimal Number Converter    |");
                    System.out.println("+--------------------------------------------------+");
	            System.out.println("                                  ");
                    System.out.print("Enter a Roman number: ");
                    String roman = scanner.nextLine();
                    System.out.println("Decimal number: " + convertRomanToDecimal(roman));
                    break;
                default:
                    System.out.println("Invalid option...");
                    return;
            }

            System.out.print("Do you want to go to homepage (Y/N) -> ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("N")) {
                System.out.println("Exiting...");
                return;
            }
        }
    }

    private static int convertRomanToDecimal(String roman) {
        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int currentValue = romanToDecimal.get(roman.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }

    private static String convertDecimalToRoman(int decimal) {
        StringBuilder result = new StringBuilder();

        for (int value : decimalToRoman.keySet()) {
            while (decimal >= value) {
                result.append(decimalToRoman.get(value));
                decimal -= value;
            }
        }

        return result.toString();
    }
}
