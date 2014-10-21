package broadridge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martin Černý <cerny.mrtn@gmail.com>
 */
public class ReadCsv {

    public static final int MANDATORY_NUMBER = 32;
    private static List<Vote> voteList = new ArrayList<Vote>();

    private BufferedReader br = null;
    private int currentLine = 0;
    private String line;
    private final int numOfHeaders = 2;
    private final String separator = ",";

    public static List<Vote> getVoteList() {
        return voteList;
    }
    
    public void readCsv(String file) {
        try {
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                Boolean group = false;
                currentLine++;
                // skip headers
                if (currentLine <= numOfHeaders) {
                    continue;
                }
                // split on comma(',')  
                String[] votes = line.split(separator);
                
                // check if group exist
                for (Vote savedVote : voteList) {
                    if (savedVote.isSimilar(votes)) {
                        savedVote.addToGroup(votes);
                        group = true;
                        break;
                    }
                }
                if (!group) {
                    Vote vote = new Vote(votes);
                    transformProposals(vote, votes);
                    voteList.add(vote);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 
     * @param vote object with mandatory columns
     * @param votes values loaded from csv
     */
    public void transformProposals(Vote vote, String[] votes) {
        int nextColumn = MANDATORY_NUMBER;
        while (votes.length > nextColumn && votes[nextColumn] != null) {
            String proposalId = votes[nextColumn];
            Boolean cumulative = votes[nextColumn++].contains(".");
            int votesFor = Integer.parseInt(votes[nextColumn++]);
            int votesAgainst = Integer.parseInt(votes[nextColumn++]);
            int votesAbstain = Integer.parseInt(votes[nextColumn++]);
            Proposals proposal = new Proposals(proposalId, votesFor, votesAgainst, votesAbstain, cumulative);
            vote.addProposal(proposal);
        }
    }

}
