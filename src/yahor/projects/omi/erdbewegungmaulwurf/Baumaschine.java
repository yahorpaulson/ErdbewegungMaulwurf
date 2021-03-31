package yahor.projects.omi.erdbewegungmaulwurf;

public interface Baumaschine {
    String getName();
    void setName(String name);
    int getLeistung();
    void setLeistung(int leistung);
    double getGewicht();
    void setGewicht(double gewicht);
    void druckeBeschreibung();
    double getBetriebsstunden();
}
