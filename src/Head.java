public class Head extends PartOfBody{
    private final Eyes eyes = new Eyes("eyes");
    public Head(String name) {
        super(name);
    }
    public class Eyes{
        private String name;
        public Eyes(String name){
            this.name = name;
        }
        public void meetOtherEyes(Eyes eyes){
            System.out.println("Their "+ getName() +" meeted");
        }
        public String getName() {
            return name;
        }
    }
    public Eyes getEyes() {
        return eyes;
    }
}
