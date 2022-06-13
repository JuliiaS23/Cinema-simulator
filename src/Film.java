public class Film extends ProductionImpl{

    public Film(String title, int runningTime) {
        this.setTitle(title);
        this.setRunningTime(runningTime);
    }

    @Override
    public void play() {
        String message = "title " + getTitle()  + "; runningTime " + getRunningTime();
        System.out.println(message);
    }
}
