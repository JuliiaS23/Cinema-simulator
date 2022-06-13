public class Serials extends ProductionImpl{
    private int episodesAmount;

    public Serials(int episodesAmount, String title, int runningTime) {
        this.episodesAmount = episodesAmount;
        this.setRunningTime(runningTime);
        this.setTitle(title);
    }

    public int getEpisodesAmount() {
        return episodesAmount;
    }

    public void setEpisodesAmount(int episodesAmount) {
        this.episodesAmount = episodesAmount;
    }

    @Override
    public void play() {
        String message = "title " + getTitle() + "; episodes " + episodesAmount + "; runningTime " + getRunningTime();
        System.out.println(message);
    }
}
