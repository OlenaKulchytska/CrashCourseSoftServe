package task7;

public abstract class Bird {
    private String feather;
    private int layEggs;

    public void setFeather(String father) {
        this.feather = father;
    }

    public String getFeather() {
        return feather;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public abstract boolean fly();
}
