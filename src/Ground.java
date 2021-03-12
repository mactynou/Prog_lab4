public class Ground{
    private String name="ground";
    private boolean digable=false;

    public enum GroundMaterial {
        ASPHALT(false,"asphalt"),
        PRIMING(true,"priming"),
        DIRT(true,"dirt");
        boolean diggable;
        String url;

        GroundMaterial(boolean diggable, String url) {
            this.diggable = diggable;
            this.url = url;
        }
    }
    public Ground(String name, GroundMaterial groundMaterial) {
        this.name = name;
        this.digable= groundMaterial.diggable;
    }
    public boolean isDigable() {
        return digable;
    }
    public String getName() {
        return name;
    }

}