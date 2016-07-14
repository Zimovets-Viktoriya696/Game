/**
 * Created by Виктория on 29.06.16.
 */
public class Dog extends Entity {


    Dog(EntityType setType) {
        super(setType);
    }

    public static Dog getDog() {
        Dog dog = new Dog(EntityType.Dog);
        return dog;
    }
}
