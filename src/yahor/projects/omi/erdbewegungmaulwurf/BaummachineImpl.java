package yahor.projects.omi.erdbewegungmaulwurf;

public abstract class BaummachineImpl implements Baumaschine{
    private String name;
    private double gewicht;
    private int leistung;
    protected int betriebstunden = 0;

    public BaummachineImpl(String name, double gewicht, int leistung){
        this.name = name;
        this.gewicht = gewicht;
        this.leistung = leistung;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public double getGewicht() {
        return gewicht;
    }

    @Override
    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    @Override
    public int getLeistung() {
        return leistung;
    }

    @Override
    public double getBetriebsstunden() {
        return betriebstunden;
    }

    @Override
    public void druckeBeschreibung() {
        System.out.println(
                "Name: " + getName() + "\n" +
                "Gewicht: " + getGewicht() + "\n" +
                "Leistung: " + getLeistung() + "\n" +
                "Betriebsstunden: " + getBetriebsstunden()
        );
    }
}
