import java.util.Objects;

public abstract class Human implements Walking{
    private final String name;
    private final Head head = new Head("head");
    private final Head.Eyes eyes = head.new Eyes("eyes");
    private final PartOfBody hand = new PartOfBody("hand");
    private Direction lookDirection=Direction.UNKNOWN;

    public Human(String name){
        this.name=name;
    }

    public void stay(Adverb ... adverbs){
        StringBuilder help= new StringBuilder();
        for (Adverb adverb : adverbs) {
            help.append(' ').append(adverb.getAdverb());
        }
        System.out.println(getName()+" stays"+help);
    }

    public void raised(Direction direction, Adverb adverb){
        System.out.println(adverb +" " +getName() + " " + direction + " head");
        setLookDirection(direction);
    }

    @Override
    public void walking(WalkingMode walkingMode, boolean isPrint) {
        System.out.println(getName()+" walking");
        if(isPrint){
            System.out.println("Walkingmode is: " + walkingMode);
        }
    }

    public void haveItem(Item item, PartOfBody partOfBody){
        System.out.println(getName()+" with "+item.getName()+" in his "+partOfBody.getName());
    }

    public String getName() {
        return name;
    }

    public Head.Eyes getEyes() {
        return eyes;
    }

    public PartOfBody getHand() {
        return hand;
    }

    public boolean equals(Object o)
    {
        return o instanceof Human && Objects.equals(getName(), ((Human) o).getName());
    }

    public int hashCode()
    {
        return Objects.hash(getName());
    }

    public String toString()
    {
        return "Human " + getName();
    }

    public Direction getLookDirection() {
        return lookDirection;
    }

    public void setLookDirection(Direction lookDirection) {
        this.lookDirection = lookDirection;
    }
}
