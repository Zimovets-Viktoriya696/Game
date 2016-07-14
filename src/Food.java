/**
 * Created by Виктория on 29.06.16.
 */
public class Food extends Entity{


    Food(EntityType setType) {
        super(setType);
    }

    public static Food getFood() {
        Food food = new Food(EntityType.Food);
        return food;
    }
}
