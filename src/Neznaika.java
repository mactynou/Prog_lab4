public class Neznaika extends Korotyshka implements Cansee{
    private Throat throat;
    public Neznaika(String name) {
        super(name);
    }

    //Локальный класс
    public void digTheGround(Ground ground) throws DigException{
        class Boot extends Item{
            public Boot(String name) {
                super(name);
            }
        }
        Boot boot = new Boot("boot");
        if(ground.isDigable()) {
            System.out.println(getName() + " digs the ground using his " + boot.getName());
        }
        else{
            throw new DigException(boot);
        }
    }
    //Вложенный статический класс
    public static class Throat extends PartOfBody{
        private boolean isClosely=false;
        public Throat(String name, boolean isClosely) {
            super(name);
            this.isClosely=isClosely;
        }
        public boolean isClosely() {
            return isClosely;
        }

        public void setClosely(boolean closely) {
            this.isClosely=closely;
        }
    }
    public void tryToSay() throws ThroatException {
        if(getThroat()!=null) {
            if (getThroat().isClosely) {
                System.out.print(getName() + " tries to say but ");
                System.out.print("in " + getName() + "'s " + getThroat().getName() + " closely");
                System.out.println(" and words didn't come from within");
            } else {
                System.out.println(getName() + " says");
            }
        }
        else throw new ThroatException();
    }
    @Override
    public void lookTo(Human human, Adverb adverb) {
        System.out.println(getName() + " " + adverb.getAdverb() + " look to " + human.getName());
    }
    @Override
    public void see(Direction direction) {
        System.out.println(getName()+ " looked "+direction.name());
        setLookDirection(direction);
    }

    public void wasAfraid(){
        System.out.println(getName() + " was afraid what");
    }

    public Throat getThroat() {
        return throat;
    }

    public void setThroat(Throat throat) {
        this.throat = throat;
    }

}
