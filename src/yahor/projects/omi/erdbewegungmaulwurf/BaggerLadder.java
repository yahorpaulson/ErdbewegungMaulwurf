package yahor.projects.omi.erdbewegungmaulwurf;

public class BaggerLadder extends BaummachineImpl implements Bagger, Lader{
    private double schaufelvolumen;
    private double kipphoehe;
    private double grabtiefe;
    private double reichweite;

    public BaggerLadder(String name, double gewicht, int leistung, double grabtiefe, double reichweite, double schaufelvolumen, double kipphoehe) {
        super(name, gewicht, leistung);
        setSchaufelvolumen(schaufelvolumen);
        setKipphoehe(kipphoehe);
        setGrabtiefe(grabtiefe);
        setReichweite(reichweite);
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
    public double getGrabtiefe() {
        return this.reichweite;
    }

    @Override
    public void setGrabtiefe(double grabtiefe) {
        this.grabtiefe = grabtiefe;
    }

    @Override
    public double getReichweite() {
        return this.reichweite;
    }

    @Override
    public void setReichweite(double reichweite) {
        this.reichweite = reichweite;
    }


    /** Methods of BaggerLader
     *
     */
    @Override
    public void graben() { super.betriebstunden++; }

    @Override
    public void laden() {
        super.betriebstunden++;
    }
    @Override
    public void druckeBeschreibung(){
        super.druckeBeschreibung();
        System.out.println(
                        "Grabtiefe: " + this.grabtiefe + "\n" +
                        "Reichweith: " + this.reichweite + "\n" +
                        "Kipphöhe: " + this.kipphoehe + "\n" +
                        "Schaufelvolumen " + this.schaufelvolumen + "\n" +
                        "**********************************"
        );
    }


}
