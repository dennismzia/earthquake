import java.io.InputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileReader;
import java.io.*;



/**
 * An earthquake dataset derived from USGS data feeds.
 */
public class QuakeDataset {
  ArrayList<Quake> quakedata = new ArrayList<Quake>();
  ArrayList<String> list3 = new ArrayList<>();
  ArrayList<String> list2  = new ArrayList<>();
  ArrayList<String> tst = new ArrayList<>();
  String line = "";
  public void readData(String severityLevel ,String timePeriod){
    if (severityLevel.contains("4.5")||severityLevel.contains("2.5")||severityLevel.contains("1.0")||severityLevel.contains("all")||severityLevel.contains("significant")){
    String str = severityLevel+"_"+timePeriod+".csv";
    System.out.println("reading from file "+str);
    File file = new File(str);
    if (!file.exists()){
      throw new QuakeException("specified file doesn't exists, check the read data arguments");
    }else{
          try {
            BufferedReader br = new BufferedReader( new InputStreamReader(new FileInputStream(str)));
            br.readLine();
            while ((line = br.readLine()) != null){
              System.out.println(" ");
              // System.out.print(line);
              quakedata.add(new Quake(line));

            // list3.add(sc.next());

            }
            // sc.close();
            // System.out.println(list3);
         }catch(Exception e){
          System.out.println("error occurred at reading data from csv file");
          throw new QuakeException("error");
         }
      }
    }
  }

  public int size(){
    return quakedata.size();
  }
  public Quake getQuake(int index){
    System.out.println((quakedata.get(index)) instanceof Quake);

    return((Quake)quakedata.get(index));

  }
  public double findStrongQuake(){
    List<Double> list = new ArrayList<Double>();
    for (Quake i : quakedata){
      list.add(Double.parseDouble(i.getMag()));
    }
    return Collections.max(list);

     }
  // TODO: add a method that finds and returns the shallowest Quake
  public double findShallowQuake(){
    List<Double> list = new ArrayList<Double>();
    for (Quake i : quakedata){
      list.add(Double.parseDouble(i.getDepth()));
    }
    return (Collections.min(list));

 }
  public void printQuakes(){
    for (Quake i : quakedata){
      list2.add(i.ToString());
      System.out.println(i.ToString());
    }
  }
  public void fullStrongQuake(){
    String p = "";
    // double  max2 = Collections.max(list2);
    for (String q : list2 ){
      // System.out.println(q);
      p = q.split(" ")[0].substring(1).split(",")[0];
      if (Double.parseDouble(p) == this.findStrongQuake()){
          System.out.println(" ");
          System.out.println("Strongest: "+q); // returns full quake info from list2
      }
    }
  }
  public void fullShallowQuake(){
    String t = "";
    for (String q : list2 ){
      t = q.split(",")[1].split(" ")[1];
      if (Double.parseDouble(t) == this.findShallowQuake()){
          tst.add(q);
      }


  }
        System.out.println("Shallowest: "+tst.get(0));
  }
}


