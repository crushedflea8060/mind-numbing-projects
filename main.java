import java.io.*;      //the File class
import java.util.*;    //the Scanner class

public class Driver03
{
    public static final int NUMITEMS = 20;
    
    public static void main(String[] args) throws Exception
    {
        Scanner infile = new Scanner( new File("data.txt") );
        
        double[] fahrenheit = new double[NUMITEMS];
        double[] celsius = new double[NUMITEMS];
        for(int x = 0; x < NUMITEMS; x++)
        {
            fahrenheit[x] = infile.nextDouble();
            celsius[x] = ((int)(100 * ((5 * (fahrenheit[x] - 32)) / 9.0))) / 100;
        }
        try (FileWriter fileWriter = new FileWriter("main.java");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
             bufferedWriter.write("Fahrenheit\t | Celsius\n");
             bufferedWriter.write("----------\t | --------------\n");
            for(int i = 0; i < NUMITEMS; i++)
                bufferedWriter.write(""+ fahrenheit[i] + "\t\t" +  " | " + celsius[i] + "\n");
            System.out.println("Successfully wrote to the file with BufferedWriter.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
      }
}
