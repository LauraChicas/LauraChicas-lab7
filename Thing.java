import java.util.Random;

public abstract class Thing {
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    protected int row;
    protected int col;
    protected int  dir;
    protected int  timeSinceLast;
    protected  char lab = 'r';
    private boolean isTypeB;
    protected Random rand = new Random(System.currentTimeMillis());

    public Thing(int row, int col, char lab){
        this.row = row;
        this.col = col; 
        this.dir = dir; 
        this.lab = lab;
      }

    public void rightTurn() {
    this.dir = (this.dir + 1) % 4;
  }

  public void leftTurn() {
    this.dir = (this.dir + 3) % 4;
  }

  public abstract void maybeTurn(Random rand);

  public void step() {
    final int[] dc = {
      0, 1, 0, -1
    }, dr = {
      1, 0, -1, 0
    };
    this.row += dr[this.dir];
    this.col += dc[this.dir];
  }

  public String toString(){
    return row + "" + col + "" + lab;
  }
}
