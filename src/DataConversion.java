public class DataConversion {
    public static void main(String[] args) {
        String s = "joshua";
        String sUpper = s.toUpperCase();// returns the string but all characters in upper case
        String sLower = sUpper.toLowerCase();// returns the string but all characters in lower case
        System.out.println(s.length());// returns int which equals length of the string (6 in this case)

        String j = "JOSHUA";
        System.out.println(j.equals(s));// will be false
        System.out.println(j.equalsIgnoreCase(s));// will be true

        String nickName = s.substring(0, 4);
        // Output: josh

        String clutter = "    strings are cool     ";
        clutter.trim();
        // Output: strings are cool
        // removes trailing and leading spaces

        String numStr = "9.8";
        double numStrToDouble = Double.parseDouble(numStr);
        String numDoubleToStr = Double.toString(numStrToDouble);// same thing can be done with integers just use Integer
                                                                // object ***Integer.parseInt()***

        String commaSeperated = "Josh, Beliz, Kate, Aaron";
        String[] csArray = commaSeperated.split(", ");// returns an array of the string seperatign about the string
                                                      // inputted
    }
}
