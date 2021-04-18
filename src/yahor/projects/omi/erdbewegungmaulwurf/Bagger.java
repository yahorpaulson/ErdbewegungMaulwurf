package yahor.projects.omi.erdbewegungmaulwurf;

public interface Bagger extends  Baumaschine{
    double MAX_GRABTIEFE = 15; //static final
    double MAX_REICHWEITE = 18;

    double getGrabtiefe();
    void setGrabtiefe(double grabtiefe);
    double getReichweite();
    void setReichweite (double reichweite);

    default void druckeBeschreibung() {
        System.out.println(
                "Grabtiefe: " + getGrabtiefe() + "\n" +
                "Reichweith: " + getReichweite() + "\n" +
                "**********************************"
        );
    }

    void graben();
}
