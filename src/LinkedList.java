public class LinkedList {

    public static void main(String[] args) {

        Node n1 = new Node(1, "one");
        Node n2 = new Node(2, "two");
        Node n3 = new Node(3, "three");
        Node n4 = new Node(4, "four");


        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);


//         Linked list
        Node currentNode = n1;
        while (currentNode != null) {
            System.out.println(currentNode.name);

            if (currentNode.next == null) {
                System.out.println("Last element");
                System.out.println(currentNode.name);
            }


            currentNode = currentNode.next;
        }


        for (Node currentNode1 = n1; currentNode1 != null; currentNode1 = currentNode1.next) {
            System.out.println(currentNode1.name);
        }

    }


}
