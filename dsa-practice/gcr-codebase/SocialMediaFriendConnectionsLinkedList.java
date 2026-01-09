package BridgeLabz_Day20_LinkedList;

public class SocialMediaFriendConnectionsLinkedList {
    public static void main(String[] args) {
        SocialMediaFriendConnections sm = new SocialMediaFriendConnections();

        sm.addUser(1, "Naman", 20);
        sm.addUser(2, "Bhavy", 21);
        sm.addUser(3, "Radhika", 19);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);

        sm.displayFriends(1);

        sm.mutualFriends(1, 2);

        sm.searchById(3);
        sm.searchByName("Bhavy");

        sm.countFriends();

        sm.removeFriend(1, 2);

        System.out.println("After Removal : ");
        sm.displayFriends(1);
    }
}
