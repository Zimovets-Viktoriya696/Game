import java.util.*;

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
       /* Set<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> listForNumbers = new ArrayList<Integer>();

        listForNumbers=  GameField.generateNumber();
        for (int i = 0; i < listForNumbers.size(); i++) {
          //  System.out.println(listForNumbers.size() + "size");
            System.out.println(listForNumbers.get(i) + " element");

        }
*/

        GameField.printMassive(GameField.getMassive());
       // GameField.getMassive();

       /* ArrayList<Integer> indexes1 = new ArrayList<Integer>();
        indexes1=  GameField.generateNumber();
        System.out.println(indexes1.size());

        for (int i = 0; i < indexes1.size(); i++) {

        }*/

      //int mass[][]=
       /* for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                System.out.println(mass[i][j]);
            }
        }*/
    }
}




