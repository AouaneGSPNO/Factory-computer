
public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC","6 GB","500 GB","2.8 GHz");
        Computer server = ComputerFactory.getComputer("Server","32 GB","2 TB","2.9 GHz");
        System.out.println("**********Factory PC Config :"+pc);
        System.out.println("**********Factory Server Config::"+server);
    }
}