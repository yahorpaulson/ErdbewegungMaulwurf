package yahor.projects.omi.erdbewegungmaulwurf;

public class Main {
    public static void main(String[] args) {

        /**
         * LADER
         */
        LaderImpl lader = new LaderImpl(
                "This is Lader-------->",
                2,
                4,
                4,
                4) {
        };

        lader.laden();
        lader.druckeBeschreibung();

        /**
         * BAGGER
         */

        BaggerImpl bagger = new BaggerImpl("This is Bagger--------->",
                4,
                5,
                9,
                5
                ) {
        };


        bagger.graben();
        bagger.graben();
        bagger.druckeBeschreibung();

        /**
         * LADERBAGGER
         */

        BaggerLadder baggerLadder = new BaggerLadder(
                "This is BaggerLader---------->",
                20,
                10,
                15,
                10,
                10,
                5
        );

        baggerLadder.laden();
        baggerLadder.graben();

        baggerLadder.druckeBeschreibung();


        NextClass next = new NextClass();
        next.druckeBeschreibung();



    }
}
