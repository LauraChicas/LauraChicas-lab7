import java.util.*;

public class DotChaser {
  public static Random rand = new Random(System.currentTimeMillis());

  /**
   * A "Thing" moves in a grid world. A TypeA Thing randomly
   * decides to turn left or right (or not turn) every "round",
   * and, afterward, takes a step forward.  A TypeB Thing
   * only considers making a random turn every 10th round.
   *
   * A STATIC CLASS? OH NO! GET IT OUT OF HERE!
   */
  //public static class Thing {
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    //public int  row, col, dir, timeSinceLast;
    //public char lab = 'r';
    //public boolean isTypeB;
  //}

  /**
   * YOU'LL NEED TO PUT THIS SOMEWHERE ELSE
   * HINT: WOULDN'T IT BE NICE TO HAVE A LIST OR QUEUE SO THAT
   *       WE DON'T HAVE TO USE NODES HERE?
   * This class is for linked lists of Thing's
   */
  //public static class Node {
    //public Thing data;
    //public Node  next;
  //}

  /*public static void step(Thing t) {
    final int[] dc = {
      0, 1, 0, -1
    }, dr = {
      1, 0, -1, 0
    };
    t.row += dr[t.dir];
    t.col += dc[t.dir];
  }*/

  
  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    // INSTEAD OF A NODE, CREATE SOMETHING MORE USER-FRIENDLY.
    ThingList thing = new ThingList();
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {

        // Add a typeA thing to the list.
        // (GEE, THAT'S A LOT OF CODE FOR JUST CREATING ONE THING)
        Thing typeA = new TypeA(45, 50);
        thing.addNode(typeA);
        

        // Add a typeB thing to the list
        Thing typeB = new TypeB(55, 50);
        thing.addNode(typeB);
        
        //we create a typeC thing to the list
        Thing typeC = new TypeC(65, 50);
        thing.addNode(typeC);
      }

      // Print out each thing.
      // (SEEMS LIKE A NICE PRINTALL() METHOD CALL WOULD WORK HERE)
      // (SEEMS LIKE A toString() METHOD IN THE CLASS WOULD ALSO BE NICE)
      //for( Node T = L; T != null; T = T.next )
        //System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);

      //System.out.println("done");
      //System.out.flush();

      // Move each thing.
      // (SEEMS LIKE A NICE MOVEALL() METHOD CALL WOULD WORK HERE)
      //for( Node T = L; T != null; T = T.next ) {
        //maybeTurn(T.data);
        //step(T.data);
      //}
      thing.printAll();
      thing.moveAll(rand);
      count++;
    }
  }
}