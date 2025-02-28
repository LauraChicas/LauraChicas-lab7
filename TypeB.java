import java.util.Random;

public class TypeB extends Thing {
    private int timeSinceLast;
    
    public TypeB(int row, int col){
        super(row, col, 'm');
    }

    public void maybeTurn(Random rand){
        int i = rand.nextInt(3);

        timeSinceLast++;

        if(this.timeSinceLast == 10){
            this.timeSinceLast = 0;
        }
        else if(this.timeSinceLast == 10){
            rightTurn();
        }
        else if(this.timeSinceLast == 10){
            leftTurn();
        }

    }

}
