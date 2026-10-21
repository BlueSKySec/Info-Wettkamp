public class Node {

        private Node nextNode;
        private Patient content;
        /**
         * Ein Knoten mit dem Inhalt pObjekt wird erzeugt.
         */

        public Node(Patient pObjekt) {
            content = pObjekt;
            nextNode = null;
        }

        /**
         * Der Verweis wird auf das Objekt, das als Parameter uebergeben wird,
         * gesetzt.
         */
        public void setNext(Node pNode) {
            nextNode = pNode;
        }

        /**
         * Liefert das naechste Element des aktuellen Knotens.
         */
        public Node next() {
            return nextNode;
        }

        /**
         * Liefert das Inhaltsobjekt des Knotens vom Typ Patient.
         */
        public Patient content() {
            return content;
        }

    }
