public class Sineglazka extends Korotyshka {
    private String emotion;
    Dress dress = new Dress("dress");

    static class Dress extends Item {
        private String dressColor;
        public Dress(String name) {
            super(name);
        }
    }
    public Sineglazka(String name) {
        super(name);
    }
    public void thought(Emotions emotions, DressColors dressColors){
         emotion = emotions.getEmotionname();
         dress.dressColor = dressColors.getValue();
         System.out.print(getName() + " in " + dress.dressColor + " " + dress.getName() + " with " + emotion + " emotion" + " thought about something");
    }
    public void said(Emotions emotions, DressColors dressColors){
        boolean goodEmotion = false;
        emotion = emotions.getEmotionname();
        dress.dressColor = dressColors.getValue();
        if(emotion.equals(Emotions.GOOD.getEmotionname()) || emotion.equals(Emotions.HAPPY.getEmotionname()))
            goodEmotion = true;
        if(goodEmotion) {
            System.out.println(" after with " + emotion + " mood said");
        }
    }
    public void willNotice(Head.Eyes eyes, Emotions emotions, DressColors dressColors){
        emotion = emotions.getEmotionname();
        dress.dressColor = dressColors.getValue();
        System.out.println(getName() + " will notice " + eyes.getName() + " with water" );
    }
}
