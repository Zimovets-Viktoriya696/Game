import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Виктория on 29.06.16.
 */
public class GameField {

    public static Entity [][] getMassive (){
    Entity massive[][] = new Entity[6][6];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[0].length; j++) {
                massive[i][j]=Emptiness.getEmptiness(); // индексы мы как то хитро зададим, я нюхом чую что рандомно
              //  massive[0][1]=Food.getFood();
              //  massive[0][2]=Dog.getDog();
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
            for (int i = 0; i < 1; i++) {
                listForNumbers.add(random.nextInt(36));}
        int v = 0;
            while(v<37) {
            int x = random.nextInt(36);
                if( listForNumbers.contains(x)) { }
                else {listForNumbers.add(x);
                    System.out.println(listForNumbers.get(v) + " els");
                    v++;
                }
            }
        return listForNumbers;
         }
     }

