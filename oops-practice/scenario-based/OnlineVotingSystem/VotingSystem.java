package BridgeLabz_Day22_ScenarioBased_OOPS.OnlineVotingSystem;
import java.util.*;

class DuplicateVoteException extends Exception {
    public DuplicateVoteException (String message) {
        super(message);
    }
}
abstract class ElectionService {
    abstract void registerVoter(String name, String id);
    abstract void addCandidate(String name);
    abstract void castVote(String voterId, String candidateName) throws DuplicateVoteException;
}

class Candidate {
    private String name;
    private int voteCount;
    public Candidate(String name) {
        this.name = name;
        this.voteCount = 0;
    }
    public String getName() { return name; }
    public int getVoteCount() { return voteCount; }
    public void incrementVote() {
        this.voteCount++;
    }
}

class Voter {
    private String voterId;
    private String name;
    private boolean hasVoted;

    public Voter(String voterId, String name) {
        this.voterId = voterId;
        this.name = name;
        this.hasVoted = false;
    }

    public String getVoterId() { return voterId; }
    public boolean hasVoted() { return hasVoted; }

    public void markAsVoted() {
        this.hasVoted = true;
    }
}

class VotingSystem extends ElectionService {
    private ArrayList<Candidate> candidates = new ArrayList<>();
    private ArrayList<Voter> voters = new ArrayList<>();

    @Override
    public void addCandidate(String name) {
        candidates.add(new Candidate(name));
        System.out.println("Candidate " + name + " added to ballot.");
    }

    @Override
    public void registerVoter(String name, String id) {
        voters.add(new Voter(id, name));
        System.out.println("Voter " + name + " registered with ID: " + id);
    }

    @Override
    public void castVote(String voterId, String candidateName) throws DuplicateVoteException {
        Voter currentVoter = null;
        for(Voter v : voters) {
            if(v.getVoterId().equals(voterId)) {
                currentVoter = v;
                break;
            }
        }

        if(currentVoter == null) {
            System.out.println("Error: Voter ID not found. Please register first.");
            return;
        }

        if(currentVoter.hasVoted()) {
            throw new DuplicateVoteException("Fraud Alert! Voter ID " + voterId + " has already voted.");
        }

        Candidate selectedCandidate = null;
        for(Candidate c : candidates) {
            if(c.getName().equalsIgnoreCase(candidateName)) {
                selectedCandidate = c;
                break;
            }
        }

        if(selectedCandidate == null) {
            System.out.println("Error: Candidate " + candidateName + " does not exist.");
            return;
        }

        selectedCandidate.incrementVote();
        currentVoter.markAsVoted();
        System.out.println("Success: Vote casted for " + candidateName);
    }

    public void displayResults() {
        System.out.println("\n--- ELECTION RESULTS ---");
        if(candidates.isEmpty()) {
            System.out.println("No candidates found.");
            return;
        }

        Candidate winner = candidates.get(0);
        boolean tie = false;

        for(Candidate c : candidates) {
            System.out.println(c.getName() + " : " + c.getVoteCount() + " votes");
            if(c.getVoteCount() > winner.getVoteCount()) {
                winner = c;
                tie = false;
            }
            else if (c.getVoteCount() == winner.getVoteCount() && c != winner) {
                tie = true;
            }
        }

        System.out.println("------------------------");
        if(tie) System.out.println("Result : It's a Tie!");
        else System.out.println("Winner is : " + winner.getName());
    }
}


