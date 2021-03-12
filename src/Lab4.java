public class Lab4 {
    public static void main(String[] args) {
        Neznaika neznaika = new Neznaika("Neznaika");
        Sineglazka sineglazka = new Sineglazka("Sineglazka");
        Neznaika.Throat throat = new Neznaika.Throat("throat", true);
        Ground dirt = new Ground("dirt", Ground.GroundMaterial.DIRT);
        Korotyshka znaika = new Korotyshka("Znaika");
        Korotyshka pilylkin = new Korotyshka("Pinylkin");
        Korotyshka vintik = new Korotyshka("Vintik");
        Korotyshka shpuntik = new Korotyshka("Shpuntik");
        Flyingball flyingball = new Flyingball("flyingball");

        sineglazka.thought(Emotions.SADNESS, DressColors.RED);
        sineglazka.said(Emotions.GOOD, DressColors.RED);

        neznaika.stay(Adverb.FORAWHILE, Adverb.SILENTLY);
        sineglazka.stay(Adverb.FORAWHILE, Adverb.SILENTLY);

        neznaika.setThroat(throat);
        try {
            neznaika.tryToSay();
        } catch (ThroatException e) {
            e.printStackTrace();
        }

        neznaika.see(Direction.DOWN);
        neznaika.digTheGround(dirt);

        neznaika.lookTo(sineglazka, Adverb.DIDNTDARETO);
        neznaika.wasAfraid();

        sineglazka.willNotice(neznaika.getEyes(),Emotions.SHYNESS,DressColors.RED);

        neznaika.raised(Direction.UP,Adverb.FINALLY);
        sineglazka.raised(Direction.UP,Adverb.FINALLY);
        neznaika.getEyes().meetOtherEyes(sineglazka.getEyes());

        znaika.wentHiking(Adverb.NEXTDAY);
        shpuntik.wentHiking(Adverb.NEXTDAY);
        pilylkin.wentHiking(Adverb.NEXTDAY);
        vintik.wentHiking(Adverb.NEXTDAY);
        neznaika.wentHiking(Adverb.NEXTDAY);
        sineglazka.wentHiking(Adverb.NEXTDAY);
        neznaika.walking(WalkingMode.ONBOOT, true);

        flyingball.burst();
        flyingball.setHardToFix(true);
        flyingball.fix();
        Wind.setWind();
        Wind.isWind();

        System.out.print("first was: ");
        znaika.haveItem(new Item("compass"),znaika.getHand());

        System.out.print("second was: ");
        System.out.println(pilylkin.getName());

        System.out.print("third was: ");
        System.out.println(vintik.getName() + " and " + shpuntik.getName());
        System.out.println("behind them were:");
        for (int j = 0; j < (int) (Math.random() * 3 + 3); ++j) {
            //Анонимный класс
            MalyshKorotysh malyshKorotush = new MalyshKorotysh() {
                @Override
                public void go() {
                    System.out.print(getName() + ' ');
                }
            };
            malyshKorotush.go();
            System.out.println(j + 1);
        }
        System.out.println("The last one was: "+neznaika.getName());
    }

    public static class Wind{
        private static boolean isWind=true;
        private static void isWind() {
            if(isWind)
                System.out.println("The wind is fair");
            else
                System.out.println("The wind is not fair");
        }
        private static void setWind() {
            Wind.isWind= false;
        }
    }
}