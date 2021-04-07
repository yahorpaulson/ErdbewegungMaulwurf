package yahor.projects.omi.erdbewegungmaulwurf;

public abstract class BaggerImpl extends BaummachineImpl implements Bagger{

    private double grabtiefe;
    private double reichweite;



    public BaggerImpl(String name, double gewicht, int leistung, double grabtiefe, double reichweite) {
        super(name, gewicht, leistung);
        setGrabtiefe(grabtiefe);
        setReichweite(reichweite);
    }


    @Override
    public double getReichweite() {
        return this.reichweite;
    }

    @Override
    public double getGrabtiefe() {
        return this.grabtiefe;
    }

    @Override
    public void setGrabtiefe(double grabtiefe) throws IllegalArgumentException{
        if(grabtiefe > MAX_GRABTIEFE){
            throw new IllegalArgumentException("Input Grabtiefe is more than " + MAX_GRABTIEFE);
        } else
            this.grabtiefe = grabtiefe;
    }

    @Override
    public double getBetriebsstunden() {
        return super.betriebstunden;
    }

    @Override
    public void setReichweite(double reichweite) throws IllegalArgumentException{
        if (reichweite > MAX_REICHWEITE){
            throw new IllegalArgumentException("Input Reichweite is more than " + MAX_REICHWEITE);
        }
        this.reichweite = reichweite;
    }

    /**
     * Show all information about Bagger
     */


    @Override
    public void druckeBeschreibung() {
        super.druckeBeschreibung();
        System.out.println(
                        "Grabtiefe: " + getGrabtiefe() + "\n" +
                        "Reichweith: " + getReichweite() + "\n" +
                        "**********************************"
        );
    }

    @Override
    public void graben() {
        this.betriebstunden++;
    }
}
