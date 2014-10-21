package broadridge;

/**
 *
 * @author Martin Černý <cerny.mrtn@gmail.com>
 */
public class Proposals {
    
    private final String id;
    private final Boolean cumulative;
    private int votesFor;
    private int votesAgainst;
    private int votesAbstain;

    /**
     * 
     * @param id 
     * @param votesFor
     * @param votesAgainst
     * @param votesAbstain 
     * @param cumulative cumulative proposal
     */
    public Proposals(String id, int votesFor, int votesAgainst, int votesAbstain, Boolean cumulative) {
        this.id = id;
        this.votesFor = votesFor;
        this.votesAgainst = votesAgainst;
        this.votesAbstain = votesAbstain;
        this.cumulative = cumulative;
    }

    public String getId() {
        return id;
    }

    public int getVotesFor() {
        return votesFor;
    }

    public int getVotesAgainst() {
        return votesAgainst;
    }

    public int getVotesAbstain() {
        return votesAbstain;
    }

    public Boolean isCumulative() {
        return cumulative;
    }

    /**
     * 
     * @param votesFor add against votes to grouped proposals
     */
    public void addVotesFor(int votesFor) {
        this.votesFor += votesFor;
    }

    /**
     * 
     * @param votesAgainst add votes against to grouped proposals
     */
    public void addVotesAgainst(int votesAgainst) {
        this.votesAgainst += votesAgainst;
    }

    /**
     * 
     * @param votesAbstain add votes abstain  to grouped proposals
     */
    public void addVotesAbstain(int votesAbstain) {
        this.votesAbstain += votesAbstain;
    }
    
    /**
     * 
     * @return return true if proposal contains votes for
     */
    public Boolean hasVotesFor(){
        return votesFor != 0;
    }
    
    /**
     * 
     * @return return true if proposal contains votes against
     */
    public Boolean hasVotesAgainst(){
        return votesAgainst != 0;
    }
 
    /**
     * 
     * @return return true if propocal contains votes abstain
     */
    public Boolean hasVotesAbstain(){
        return votesAbstain != 0;
    }
     
}
