package input;

import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);
    static int intValue;
    static float floatValue;
    static double doubleValue;
    static String stringValue;
    static long longValue;

    private static void getInt(){intValue = Integer.parseInt(sc.nextLine());}
    public static int getIntValue(){
        getInt();
        return intValue;
    }

    private static void getFloat(){floatValue = Float.parseFloat(sc.nextLine());}
    public static float getFloatValue(){
        getFloat();
        return floatValue;
    }

    private static void getDouble(){doubleValue = Double.parseDouble(sc.nextLine());}
    public static double getDoubleValue(){
        getDouble();
        return doubleValue;
    }

    private static void getString(){stringValue = sc.nextLine();}
    public static String getStringValue(){
        getString();
        return stringValue;
    }

    private static void getLong(){longValue = Long.parseLong(sc.nextLine());}
    public static long getLongValue(){
        getLong();
        return longValue;
    }
}
