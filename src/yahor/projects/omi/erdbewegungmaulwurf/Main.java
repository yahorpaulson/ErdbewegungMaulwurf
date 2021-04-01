package yahor.projects.omi.erdbewegungmaulwurf;

public class Main {
    public static void main(String[] args) {
        LaderImpl lader = new LaderImpl("Name1", 2,4,1,4) {
        };




        System.out.println(lader.getBetriebsstunden());
        lader.laden();
        System.out.println(lader.getBetriebsstunden());

        Bagger bagger = new BaggerImpl("Name2", 2,5,3,5) {
        };
/*



        System.out.println(bagger.getBetriebsstunden());
        bagger.graben();
        bagger.graben();
        System.out.println(bagger.getBetriebsstunden());
*/

        bagger.druckeBeschreibung();
        lader.druckeBeschreibung();



    }
}
