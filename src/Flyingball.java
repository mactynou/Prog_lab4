public class Flyingball extends Item{
    private boolean isHardToFix=false;

    public Flyingball(String name) {
        super(name);
    }

    public void burst(){
        System.out.println(getName() + " burst");
    }

    public void setHardToFix(boolean hardToFix) {
        isHardToFix = hardToFix;
    }

    public void fix(){
        if(isHardToFix) {
            System.out.println("It was hard to fix");
        }
        else{
            System.out.println("It was easy to fix");
        }
    }
}
