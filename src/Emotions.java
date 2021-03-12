public enum Emotions {
    BAD("bad"),
    GOOD("good"),
    SADNESS("sadness"),
    HAPPY("happy"),
    SHYNESS("shyness");
    public String getEmotionname() {
        return Emotionname;
    }
    private final String Emotionname;
    Emotions (String emotoin){
        this.Emotionname=emotoin;
    }
}
