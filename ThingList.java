import java.util.Random;

public class ThingList {
    //Using a queue implementation for this linked list
    private Node head;
    private Node tail;

    private class Node {
        Thing data;
        Node  next;
    }

    public void addNode(Thing data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;

        if(head == null || tail == null){
            head = tail = newNode;
        }
        else if(head != null){
            tail.next = newNode; 
        }
    }

    // Move each thing.
    // (SEEMS LIKE A NICE MOVEALL() METHOD CALL WOULD WORK HERE)
    public void moveAll(Random rand){
        for(Node T = head; T != null; T = T.next){
            T.data.maybeTurn(rand);
            T.data.step();
        } 
    }

    // Print out each thing.
      // (SEEMS LIKE A NICE PRINTALL() METHOD CALL WOULD WORK HERE)
      // (SEEMS LIKE A toString() METHOD IN THE CLASS WOULD ALSO BE NICE)
      public void printAll(){
      for( Node currThing = head; currThing != null; currThing = currThing.next )
        System.out.println(currThing.data);

      System.out.println("done");
      System.out.flush();
      }
}
