// import Quake;

public class QuakeTest{
    public static void main(String args[]){
        String quakeinfo = "2022-08-02T23:47:14.452Z,37.3214,141.076,53.726,4.2,mwr,78,111,2.425,0.45,us,us6000i7ld,2022-08-03T01:01:08.390Z,\"19 km SSE of Namie, Japan\",earthquake,9,6.048,0.078,16,reviewed,us,us";
        Quake quake = new Quake(quakeinfo);
        String  p  = quake.ToString();
        System.out.println(p.split(",")[1].split(" ")[1]);
    }
}
