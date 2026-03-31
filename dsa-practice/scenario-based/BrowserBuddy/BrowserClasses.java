package BridgeLabz_Day28_ScenarioBased.BrowserBuddy;

class HistoryNode {
    String url;
    HistoryNode prev;
    HistoryNode next;

    HistoryNode(String url) {
        this.url = url;
    }
}
class BrowserTab {
    private HistoryNode current;
    void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);
        if (current != null) {
            current.next = null;
            newNode.prev = current;
            current.next = newNode;
        }
        current = newNode;
        System.out.println("Visited: " + url);
    }
    void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        }
        else {
            System.out.println("No Back History");
        }
    }

    void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        }
        else {
            System.out.println("No Forward History");
        }
    }
    String getCurrentPage() {
        if (current == null) {
            return "No Page Open";
        }
        return current.url;
    }
}
