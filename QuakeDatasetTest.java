public class QuakeDatasetTest {
    public static void main(String[] args) {
        QuakeDataset qk = new QuakeDataset();
        qk.readData("significant","month");
        // System.out.println(qk.size());
        // System.out.println(qk.getQuake(3));
        // System.out.println(qk.findStrongQuake());
        System.out.println(qk.findShallowQuake());
        qk.printQuakes();
        qk.fullStrongQuake();
        qk.fullShallowQuake();
    }
}
