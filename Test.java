import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Test
{
public static void main(String[] args)
{
// String line = "2022-07-28T04:15:05.140Z -21.9342  -70.3404  54  6.1 mww 111 33  0.556 1 us  us6000i636  2022-07-29T16:21:02.772Z  22 km NW of Tocopilla, Chile  earthquake  6 1.9 0.036 73  reviewed  us  us";
// String[] parts = line.trim().split("\\s+");
// System.out.println(splitted[1]);
// Quake test = new Quake(line);
// System.out.println(test.getLat());
// system.out.println(new Quake())
    try {
    String line;
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("significant_month.csv")));
    while ((line = br.readLine()) != null) {
        System.out.println(line);
}
}catch(IOException e){
    throw new QuakeException("exception");
}
}
}

