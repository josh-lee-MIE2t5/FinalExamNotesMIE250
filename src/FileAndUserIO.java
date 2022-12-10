import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileAndUserIO {
    public static void main(String[] args) throws IOException {
        // User input using BufferedReader and InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();// method returns string of the line read
        long charsSkipped = br.skip(5);// returns 5 if 5 characters are skipped
        br.close();

        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader brFile = new BufferedReader(fr);
        brFile.readLine();// returns a String and skips the line read returns null if line is blank
        brFile.close();

        // User input using scanner
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        int x = cin.nextInt();
        cin.close();

        // file reading with scanner
        File f = new File("path.txt");
        Scanner scannerFile = new Scanner(f);
        int lineNumber = 1;
        while (scannerFile.hasNextLine()) {// checks the line after the one currently on
            String line = scannerFile.nextLine();// returns string of the line skipped
            System.out.println("line " + lineNumber + " :" + line);
            lineNumber++;
        }
        scannerFile.close();
    }
}
