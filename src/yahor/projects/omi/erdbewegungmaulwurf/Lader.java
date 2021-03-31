package yahor.projects.omi.erdbewegungmaulwurf;

public interface Lader extends Baumaschine{
    double MAX_SCHAUFELVOLUMEN = 10;
    double MAX_KIPPHOEHE = 5;

    double getSchaufelvolumen();
    void setSchaufelvolumen(double schaufelvolumen);
    double getKipphoehe();
    void setKipphoehe(double kipphoehe);
    void druckeBeschreibung();
    void laden();
}
