public enum Adverb {
    SILENTLY("Silently"),
    FORAWHILE("For a while"),
    NEXTDAY("Next day"),
    FINALLY("Finally"),
    DIDNTDARETO("didnt dare");
    private final String realAdverb;
    Adverb(String adverb){
        this.realAdverb = adverb;
    }
    public String getAdverb() {
        return realAdverb;
    }
}
