import java.util.Random;

public class TypeC extends Thing {
    private int timeSinceLast;

    public TypeC(int row, int col){
        super(row, col,'k');
    }

    public void maybeTurn(Random rand){
        timeSinceLast++;

        if(timeSinceLast == 100){
            step();
        } else {
            leftTurn();
            rightTurn();
            step();
            leftTurn();
        }
    }
    
}
