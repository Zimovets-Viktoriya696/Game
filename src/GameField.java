import java.util.*;

/**
 * Created by Виктория on 29.06.16.
 */
public class GameField {

    public static Entity [][] getMassive (){

        Entity massive[][] = new Entity[6][6];

        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                Random random = new Random();
                    int number1 = random.nextInt(36);
                        if( number1 > 15 ){
                            massive[i][j]= Food.getFood();}
                        else  {
                            massive[i][j]= Emptiness.getEmptiness();}
                }
            }

        Random random1 = new Random();
            int in1 = random1.nextInt(6);
            int in2 = random1.nextInt(6);
                 massive[in1][in2] = Dog.getDog();

    return massive;
    }



    public static void printMassive (Entity[][] massive){
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[0].length; j++) {
                if(massive[i][j].getType()== Food.EntityType.Food)
                    {System.out.print("+");}
                else if(massive[i][j].getType()== Dog.EntityType.Dog)
                    {System.out.print("@");}
                else if(massive[i][j].getType()== Emptiness.EntityType.Free)
                    {System.out.print("0");}
            }
            System.out.println();
        }
    }

    public static Set<Integer> generateNumber (){
        Random rng = new Random();
        Set<Integer> generated = new LinkedHashSet<Integer>();
        while (generated.size() < 35)
        {
            Integer next = rng.nextInt(35) + 1;
            generated.add(next);

         }
        return generated;
  }
}
