package BridgeLabz_Day20_LinkedList;

public class SocialMediaFriendConnections {
    class Node {
        int userId;
        String name;
        int age;
        int[] friends = new int[10];
        int friendCount = 0;

        Node next;
    }

    private Node head;

    // Add User (basic)
    public void addUser(int id, String name, int age) {
        Node nn = new Node();
        nn.userId = id;
        nn.name = name;
        nn.age = age;

        nn.next = head;
        head = nn;
    }

    // Add friend connection
    public void addFriend(int id1, int id2) {
        Node u1 = getUser(id1);
        Node u2 = getUser(id2);

        if (u1 == null || u2 == null) return;

        u1.friends[u1.friendCount++] = id2;
        u2.friends[u2.friendCount++] = id1;
    }

    // Remove friend connection
    public void removeFriend(int id1, int id2) {
        Node u1 = getUser(id1);
        Node u2 = getUser(id2);

        if (u1 == null || u2 == null) return;

        removeFromArray(u1, id2);
        removeFromArray(u2, id1);
    }

    // Find mutual friends
    public void mutualFriends(int id1, int id2) {
        Node u1 = getUser(id1);
        Node u2 = getUser(id2);

        if (u1 == null || u2 == null) return;

        System.out.println("Mutual Friends:");
        for (int i = 0; i < u1.friendCount; i++) {
            for (int j = 0; j < u2.friendCount; j++) {
                if (u1.friends[i] == u2.friends[j]) {
                    System.out.println(u1.friends[i]);
                }
            }
        }
    }

    // Display all friends of a user
    public void displayFriends(int id) {
        Node user = getUser(id);
        if (user == null) return;

        System.out.println("Friends of " + user.name + ":");
        for (int i = 0; i < user.friendCount; i++) {
            System.out.println(user.friends[i]);
        }
    }

    // Search by User ID
    public void searchById(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.userId == id) {
                System.out.println(temp.userId + "\t" + temp.name + "\t" + temp.age);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    // Search by Name
    public void searchByName(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println(temp.userId + "\t" + temp.name + "\t" + temp.age);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    // Count number of friends for each user
    public void countFriends() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.name + " : " + temp.friendCount);
            temp = temp.next;
        }
    }

    private Node getUser(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    private void removeFromArray(Node user, int id) {
        for (int i = 0; i < user.friendCount; i++) {
            if (user.friends[i] == id) {
                for (int j = i; j < user.friendCount - 1; j++) {
                    user.friends[j] = user.friends[j + 1];
                }
                user.friendCount--;
                return;
            }
        }
    }
}