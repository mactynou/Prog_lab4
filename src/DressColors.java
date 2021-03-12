public enum DressColors {
    BLUE("blue"),
    RED("red");
    private final String dresscolor;
    DressColors(String value){
        this.dresscolor=value;
    }
    public String getValue() {
        return dresscolor;
    }
}
