import java.util.*;

/**
 * Created by Виктория on 29.06.16.
 */
public class GameField {

    public static Entity [][] getMassive (){

        ArrayList<Integer> indexes1 = GameField.generateNumber();

        Entity massive[][] = new Entity[6][6];

        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {

                Random random = new Random();
                    int number1 = random.nextInt(36);
                        if( number1 == 15 ){
                            massive[i][j]= Food.getFood();}
                        else if (number1 < 5){
                            massive[i][j]= Emptiness.getEmptiness();}
                        else {
                            massive[i][j] = Dog.getDog();
                        }

                }
            }








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

    public static ArrayList<Integer> generateNumber (){
        ArrayList<Integer> listForNumbers = new ArrayList<Integer>();
        Random random = new Random();
        int i = 0;
        while ( i < 36 ) {
            int x = random.nextInt(36);
            if( listForNumbers.contains(x)) { }
            else {listForNumbers.add(x); i++;}
            }
        return listForNumbers;
         }
  }
