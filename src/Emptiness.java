/**
 * Created by Виктория on 29.06.16.
 */
public class Emptiness extends Entity{

    Emptiness(EntityType setType) {
        super(setType);
    }

    public static Emptiness getEmptiness() {
        Emptiness empty = new Emptiness(EntityType.Free);
        return empty;
         }



    // а еще они должны знать съели ли их или нет


}
