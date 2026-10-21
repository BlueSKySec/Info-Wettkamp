public class Queue {
    public Node head;
    protected Node tail;

    /**
     * Eine leere Schlange wird erzeugt. 
     */
    public Queue() {
        head = null;
        tail = null;

    }

    /**
     * Die Anfrage liefert den Wert true, wenn die Schlange keine Objekte enthaelt, 
     * sonst liefert sie den Wert false.
     * 
     * @return true, falls die Schlange leer ist, sonst false
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Der Patient pObjekt wird an die Schlange angehaengt. 
     * Falls pObjekt gleich null ist, bleibt die Schlange unveraendert.
     * 
     */
    public void enqueue(Patient pObjekt) {
        if (isEmpty()) {
            Node newNode = new Node(pObjekt);
            head = newNode;
            tail = newNode;
        }
        else {
            Node newNode = new Node(pObjekt);
            tail.setNext(newNode);
            tail = newNode;

        }

    }

    /**
     * Das erste Objekt wird aus der Schlange entfernt. 
     * Falls die Schlange leer ist, wird sie nicht veraendert.
     */
    public void dequeue() {
        
    }


    /**
     * Die Anfrage liefert das erste Objekt der Schlange. 
     * Die Schlange bleibt unveraendert. 
     * Falls die Schlange leer ist, wird null zurueckgegeben.
     *
     */
    public Patient front() {
        
    }
}
