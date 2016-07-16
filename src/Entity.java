import java.util.Arrays;

/**
 * Created by Виктория on 30.06.16.
 */
public class Entity {

    private EntityType _currentType;

    Entity(EntityType setType)
    {
        _currentType = setType;
    }

    public EntityType getType()
    {


        return _currentType;
    }


    enum EntityType
    {
        None,
        Food,
        Dog,
        Free
    }

    public static void main(String[] args) {
      //  GameField.printMassive(GameField.getMassive());

      //int mass[][]=
      GameField.generateNumber();
       /* for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                System.out.println(mass[i][j]);
            }
        }*/
    }
}




