public class Pilot {
    private String name;
    private Rank rank;
    private String license;

    public Pilot(String name, Rank rank, String license) {
        this.name = name;
        this.rank = rank;
        this.license = license;
    }

    public String flyPlane() {
        return "Whoosh!";
    }
}
