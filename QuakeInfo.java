/**
 * Program to display earthquake details from a USGS dataset.
 */
public class QuakeInfo {
  public static void main(String[] args) {
    if (args.length >2 || args.length < 2){
      // System.out.println("hey you forgot the arguments [QuakeInfo <level> <period>]");
      throw new QuakeException("hey you forgot the arguments [QuakeInfo <level> <period>]");

    }
    String level = args[0];
    String period = args[1];
    QuakeDataset qk = new QuakeDataset();
    qk.readData(level,period);
    // qk.readData("2.5","day");
    System.out.println(qk.size()+" in dataset");
    System.out.println(" ");
    qk.printQuakes();
    System.out.println(" ");
    qk.fullStrongQuake();
    qk.fullShallowQuake();

  }
}
