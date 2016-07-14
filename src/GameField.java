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
}
