package DB;

/**
 *
 * @author mathe
 */
public class DbIntegrityException extends RuntimeException{
    public DbIntegrityException (String msg){
        super (msg);
    }
}
