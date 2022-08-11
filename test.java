import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test
{
public static void main(String[] args)
{
String line = "";
String splitBy = ",";
try{
//parsing a CSV file into BufferedReader class constructor
    BufferedReader br = new BufferedReader(new FileReader("significant_month.csv"));
    while ((br.readLine()) != null){
        System.out.println(br.readLine());}}
catch (IOException e){
e.printStackTrace();
}
}
}
