
class ListNode {
    String data;
    ListNode next;

    ListNode(String data) {
        this.data = data;
        this.next = null;
    }
}


class LinkedList {
    ListNode head;

    LinkedList() {
        this.head = null;
    }

    public void add(String data) {
        ListNode newNode = new ListNode(data);
        if(head == null) // erstes Element
        {
            head = newNode;
            return;
        }

        ListNode currentPos = head;
        // suche das letzte Element
        while(currentPos.next != null) {
            currentPos = currentPos.next;
        }

        // setze hinter das letzte node element das neue node element
        currentPos.next = newNode;
    }

    public void show() {
        ListNode currentPos = head;
        while(currentPos != null) {
            System.out.println(currentPos.data);
            currentPos = currentPos.next;
        }
        System.out.println();
    }
}

public class App {
    public static void main(String[] args) {
        LinkedList verketteListe = new LinkedList();

        verketteListe.add("a");
        verketteListe.add("B");
        verketteListe.add("c");
        verketteListe.add("D");

        verketteListe.show();


    }
}