package yahor.projects.omi.erdbewegungmaulwurf;


public abstract class LaderImpl extends BaummachineImpl implements Lader{

    private double kipphoehe;
    private double schaufelvolumen;

    public LaderImpl(String name, double gewicht, int leistung, double kipphoehe, double schaufelvolumen) {
        super(name, gewicht, leistung);
        this.schaufelvolumen = schaufelvolumen;
        this.kipphoehe = kipphoehe;
    }



    @Override
    public void setKipphoehe(double kipphoehe) throws IllegalArgumentException{
        if(kipphoehe > MAX_KIPPHOEHE){
            throw new IllegalArgumentException("Input Kipphöhe is more than " + MAX_KIPPHOEHE);
        } else
            this.kipphoehe = kipphoehe;
    }

    @Override
    public void setSchaufelvolumen(double schaufelvolumen) throws IllegalArgumentException{
        if(schaufelvolumen > MAX_SCHAUFELVOLUMEN){
            throw new IllegalArgumentException("Input Schaufelvolumen is more than " + MAX_SCHAUFELVOLUMEN);
        } else
            this.schaufelvolumen = schaufelvolumen;
    }

    @Override
    public double getSchaufelvolumen() {
        return this.schaufelvolumen;
    }

    @Override
    public double getBetriebsstunden() {
        return this.betriebstunden;
    }

    @Override
    public double getKipphoehe() {
        return this.kipphoehe;
    }

    /**
     * Show all information about Lader
     */

    @Override
    public void druckeBeschreibung() {
        System.out.println(
                "Name: " + getName() + "\n" +
                "Gewicht: " + getGewicht() + "\n" +
                "Leistung: " + getLeistung() + "\n" +
                "Betriebsstunden: " + getBetriebsstunden() + "\n" +
                "Kipphöhe: " + getKipphoehe() + "\n" +
                "Schaufelvolumen: " +getSchaufelvolumen() + "\n" +
                        "**********************************"
        );

    }



    @Override
    public void laden() {
        this.betriebstunden++;
    }
}
