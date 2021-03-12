public class DigException extends RuntimeException{
    public DigException(Item item){
        super("can't dig the ground using his "+item.getName());
    }
}
