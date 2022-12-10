public class StringFormatting {
    public static void main(String[] args) {
        // System.out.printf( “format-string” [, arg1, arg2, … ] );
        // String.format("format-string",[, arg1, arg2, … ] );
        /* % [flags] [width] [.precision] conversion-character */
        /*
         * 
         * 
         * Flags:
         * - : left-justify ( default is to right-justify )
         * + : output a plus ( + ) or minus ( - ) sign for a numerical value
         * 0 : forces numerical values to be zero-padded ( default is blank padding )
         * , : comma grouping separator (for numbers > 1000)
         * : space will display a minus sign if the number is negative or a space if it
         * is positive
         * 
         * 
         * 
         * Width:
         * Specifies the field width for outputting the argument and represents the
         * minimum number of characters to
         * be written to the output. Include space for expected commas and a decimal
         * point in the determination of
         * the width for numerical values.
         * 
         * 
         * Precision:
         * Used to restrict the output depending on the conversion. It specifies the
         * number of digits of precision when
         * outputting floating-point values or the length of a substring to extract from
         * a String. Numbers are rounded
         * to the specified precision.
         * 
         * 
         * 
         * Conversion-Characters:
         * d : decimal integer [byte, short, int, long]
         * f : floating-point number [float, double]
         * c : character Capital C will uppercase the letter
         * s : String Capital S will uppercase all the letters in the string
         * h : hashcode A hashcode is like an address. This is useful for printing a
         * reference
         * n : newline Platform specific newline character- use %n instead of \n for
         * greater compatibility
         */

        // Exmaples
        System.out.printf("Total is: $%,.2f%n", 1000000.98849239);
        // output: Total is: $1,000,000.99

        System.out.printf("Total: %-10.2f: %n", 1.9884);
        // output: Total: 1.99______: ("_" represent blank spaces)

        System.out.printf("%4d%n", 6);
        // Output: ___6

        System.out.printf("%04d%n", 6);
        // Output: 0006

        System.out.printf("%20.10s%n", "SomeStringfhsjkfdsjhfdshfjksd");
        // Output:__________SomeString

        String s = "Hello World";
        System.out.printf("The String object %s is at hash code %h%n", s, s);
        // Output: The String object Hello World is at hash code cc969a84

    }
}
