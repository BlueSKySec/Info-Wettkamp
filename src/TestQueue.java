public class TestQueue {

    Queue test; 

    public TestQueue() {
        test = new Queue();
    }

    public void testThisQueue() {
        if (!test.isEmpty()) {
            System.out.println("Fehler1");
        }
        test.enqueue(new Patient("5", null));
        if (!test.front().getName().equals("5")) {
            System.out.println("Fehler2");
        }
        test.dequeue();
        if (!test.isEmpty()) {
            System.out.println("Fehler3");
        }
        test.enqueue(new Patient("1", null));
        test.enqueue(new Patient("2", null));
        test.enqueue(new Patient("3", null));
        for (int i = 1; i <= 3; i++) {
            if (!test.front().getName().equals(i+"")) {
                System.out.println("Fehler4");
            }
            test.dequeue();
        }
        test.enqueue(new Patient("4", null));
        test.enqueue(new Patient("5", null));
        test.front();
        if (!test.front().getName().equals("4")) {
            System.out.println("Fehler5");
        }
        System.out.println("Funktioniert alles, wenn vorher kein Fehler angezeigt wurde.");
    }

    public static void main(String[] args) {
        TestQueue test = new TestQueue();
        test.testThisQueue();
    }

}

