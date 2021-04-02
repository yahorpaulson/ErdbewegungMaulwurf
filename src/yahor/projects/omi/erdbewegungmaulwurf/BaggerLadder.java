package yahor.projects.omi.erdbewegungmaulwurf;

public class BaggerLadder extends BaggerImpl implements IBaggerLader{
    private double schaufelvolumen;
    private double kipphoehe;

    public BaggerLadder(String name, double gewicht, int leistung, double grabtiefe, double reichweite, double schaufelvolumen, double kipphoehe) {
        super(name, gewicht, leistung, grabtiefe, reichweite);
        this.schaufelvolumen = getSchaufelvolumen();
        this.kipphoehe = getKipphoehe();
    }

    @Override
    public double getSchaufelvolumen() {
        return this.schaufelvolumen;
    }

    @Override
    public void setSchaufelvolumen(double schaufelvolumen) throws IllegalArgumentException{
        if(schaufelvolumen > MAX_SCHAUFELVOLUMEN){
            throw new IllegalArgumentException("Input Schaufelvolumen is more than " + MAX_SCHAUFELVOLUMEN);
        } else
            this.schaufelvolumen = schaufelvolumen;
    }

    @Override
    public double getKipphoehe() {
        return this.kipphoehe;
    }

    @Override
    public void setKipphoehe(double kipphoehe) throws IllegalArgumentException{
        if(kipphoehe > MAX_KIPPHOEHE){
            throw new IllegalArgumentException("Input Kipphöhe is more than " + MAX_KIPPHOEHE);
        } else
            this.kipphoehe = kipphoehe;
    }

    @Override
    public void laden() {
        this.betriebstunden++;
    }

    @Override
    public void druckeBeschreibung(){
        System.out.println(
                "Name: " + getName() + "\n" +
                        "Gewicht: " + getGewicht() + "\n" +
                        "Leistung: " + getLeistung() + "\n" +
                        "Betriebsstunden: " + getBetriebsstunden() + "\n" +
                        "Grabtiefe: " + getGrabtiefe() + "\n" +
                        "Reichweith: " + getReichweite() + "\n" +
                        "Kipphöhe: " + getKipphoehe() + "\n" +
                        "Schaufelvolumen" + getSchaufelvolumen() + "\n" +
                        "**********************************"
        );
    }
}
