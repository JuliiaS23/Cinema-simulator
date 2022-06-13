public class Cinema {
    public static void main(String[] args) {
        Film inception = new Film("inception", 100);
        Film tenet = new Film("tenet", 150);
        Serials siliconValley = new Serials(10, "silicon valley", 30);
        show(tenet);
        show(siliconValley);
        show(inception);
    }

    static void show (Production smth){
        smth.play();
    }
}
