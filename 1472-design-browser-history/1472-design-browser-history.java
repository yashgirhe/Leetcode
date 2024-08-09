class Node {
    String data;
    Node next;
    Node prev;

    public Node(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class BrowserHistory {
    private Node home;
    private Node curr;

    public BrowserHistory(String homepage) {
        home = new Node(homepage);
        curr = home;
    }

    public void visit(String url) {
        curr.next = null;
        Node newNode = new Node(url);
        curr.next = newNode;
        newNode.prev = curr;
        curr = newNode;
    }

    public String back(int steps) {
        while (steps-- > 0 && curr.prev != null) {
            curr = curr.prev;
        }
        return curr.data;
    }
    public String forward(int steps) {
        while (curr.next != null && steps-- > 0) {
            curr = curr.next;
        }
        return curr.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */