/**
 * Details of a single earthquake.
 */
public class Quake {
  String latitude;
  String longitude;
  String depth;
  String magnitude;

// 2022-07-28T04:15:05.140Z -21.9342  -70.3404  54  6.1 mww 111 33  0.556 1 us  us6000i636  2022-07-29T16:21:02.772Z  22 km NW of Tocopilla, Chile  earthquake  6 1.9 0.036 73  reviewed  us  us

  Quake(String quakeInfo){
    String[] parts = quakeInfo.split(",");
    // String[] splitted = quakeInfo.split("\\s+");
    // String[] parts = quakeInfo.split("\\s+");
    // System.out.println(parts[1]);

    if(Double.parseDouble(parts[1]) > 90.9 || Double.parseDouble(parts[1]) < -90.9 ){
      throw new QuakeException("Error in latitude. should be of range -90 to 90");
    }else{
      this.latitude = parts[1];
    }

    if(Double.parseDouble(parts[2]) > 180.9 || Double.parseDouble(parts[2]) < -180.9 ){
      throw new QuakeException("Error in latitude. should be of range -90 to 90");
    }else{
      this.longitude = parts[2];
    }

    this.depth = parts[3];
    this.magnitude = parts[4];
  }
  public String getLat(){
    return this.latitude;
  }

  public String getLong(){
    return this.longitude;
  }

  public String getDepth(){
    return this.depth;
  }

  public String getMag(){
    return this.magnitude;
  }

  public String ToString(){
    String newQuake = String.format("M%s, %s km, (%s°, %s°)",this.getMag(),this.getDepth(),this.getLat(),this.getLong());
    return newQuake;
  }
}
