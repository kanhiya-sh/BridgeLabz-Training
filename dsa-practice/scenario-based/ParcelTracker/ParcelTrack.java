package BridgeLabz_Day28_ScenarioBased.ParcelTracker;

class ParcelNode {
    String stage;
    ParcelNode next;

    ParcelNode(String stage) {
        this.stage = stage;
    }
}
class ParcelChain {
    private ParcelNode head;

    void addStage(String stage) {
        ParcelNode node = new ParcelNode(stage);
        if (head == null) {
            head = node;
            return;
        }
        ParcelNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    void addAfter(String after, String stage) {
        ParcelNode temp = head;
        while (temp != null && !temp.stage.equals(after)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Stage not found (Parcel Missing)");
            return;
        }
        ParcelNode node = new ParcelNode(stage);
        node.next = temp.next;
        temp.next = node;
    }

    void track() {
        if (head == null) {
            System.out.println("No Parcel Found");
            return;
        }
        ParcelNode temp = head;
        while (temp != null) {
            System.out.print(temp.stage + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
