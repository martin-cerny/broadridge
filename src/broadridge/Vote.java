package broadridge;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martin Černý <cerny.mrtn@gmail.com>
 */
public class Vote {
    
    private String bicCode;
    private String genl;
    private String corp;
    private String seme;
    private String type;
    private String caev;
    private String link;
    private String prev;
    private String link2;
    private String genl2;
    private String usecu;
    private String isin;
    private String acctinfo;
    private String safe;
    private String elig;
    private String acctinfo2;
    private String usecu2;
    private String cainst;
    private String caon;
    private String caop;
    private int quins;
    private String cainst2;
    private String addinfo;
    private String adtx;
    private String addinfo2;
    private String benodet;
    private String ownd;
    private String boOwnerName;
    private String boAddress;
    private String boUrefNumber;
    private int ownedUnit;
    private String benodet2;
    private String proposalOutput;
    private List<Proposals> proposalList = new ArrayList<Proposals>();
    
    private StringBuilder forNum = new StringBuilder();
    private StringBuilder agstNum = new StringBuilder();
    private StringBuilder abstNum = new StringBuilder();
    private StringBuilder cumForNum = new StringBuilder();
    private StringBuilder cumAgstNum = new StringBuilder();
    private StringBuilder cumAbstNum = new StringBuilder();

    public Vote(String[] votes) {
        bicCode = votes[0];
        genl = votes[1];
        corp = votes[2];
        seme = votes[3];
        type = votes[4];
        caev = votes[5];
        link = votes[6];
        prev = votes[7];
        link2 = votes[8];
        genl2 = votes[9];
        usecu = votes[10];
        isin = votes[11];
        acctinfo = votes[12];
        safe = votes[13];
        elig = votes[14];
        acctinfo2 = votes[15];
        usecu2 = votes[16];
        cainst = votes[17];
        caon = votes[18];
        caop = votes[19];
        quins = Integer.parseInt(votes[20]);
        cainst2 = votes[21];
        addinfo = votes[22];
        adtx = votes[23];
        addinfo2 = votes[24];
        benodet = votes[25];
        ownd = votes[26];
        boOwnerName = votes[27];
        boAddress = votes[28];
        boUrefNumber = votes[29];
        ownedUnit = Integer.parseInt(votes[30]);
        benodet2 = votes[31];
    }

    
    
    public String getBicCode() {
        return bicCode;
    }

    public void setBicCode(String bicCode) {
        this.bicCode = bicCode;
    }

    public String getGenl() {
        return genl;
    }

    public void setGenl(String genl) {
        this.genl = genl;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    public String getSeme() {
        return seme;
    }

    public void setSeme(String seme) {
        this.seme = seme;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCaev() {
        return caev;
    }

    public void setCaev(String caev) {
        this.caev = caev;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }
    
    public String getLink2() {
        return link2;
    }
    
    public void setLink2(String link2) {
        this.link2 = link2;
    }

    public String getGenl2() {
        return genl2;
    }

    public void setGenl2(String genl2) {
        this.genl2 = genl2;
    }

    public String getUsecu() {
        return usecu;
    }

    public void setUsecu(String usecu) {
        this.usecu = usecu;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getAcctinfo() {
        return acctinfo;
    }

    public void setAcctinfo(String acctinfo) {
        this.acctinfo = acctinfo;
    }

    public String getSafe() {
        return safe;
    }

    public void setSafe(String safe) {
        this.safe = safe;
    }

    public String getElig() {
        return elig;
    }

    public void setElig(String elig) {
        this.elig = elig;
    }

    public String getAcctinfo2() {
        return acctinfo2;
    }

    public void setAcctinfo2(String acctinfo2) {
        this.acctinfo2 = acctinfo2;
    }

    public String getUsecu2() {
        return usecu2;
    }

    public void setUsecu2(String usecu2) {
        this.usecu2 = usecu2;
    }

    public String getCainst() {
        return cainst;
    }

    public void setCainst(String cainst) {
        this.cainst = cainst;
    }

    public String getCaon() {
        return caon;
    }

    public void setCaon(String caon) {
        this.caon = caon;
    }

    public String getCaop() {
        return caop;
    }

    public void setCaop(String caop) {
        this.caop = caop;
    }

    public int getQuins() {
        return quins;
    }

    public void setQuins(int quins) {
        this.quins = quins;
    }

    public String getCainst2() {
        return cainst2;
    }

    public void setCainst2(String cainst2) {
        this.cainst2 = cainst2;
    }

    public String getAddinfo() {
        return addinfo;
    }

    public void setAddinfo(String addinfo) {
        this.addinfo = addinfo;
    }

    public String getAdtx() {
        return adtx;
    }

    public void setAdtx(String adtx) {
        this.adtx = adtx;
    }

    public String getAddinfo2() {
        return addinfo2;
    }

    public void setAddinfo2(String addinfo2) {
        this.addinfo2 = addinfo2;
    }

    public String getBenodet() {
        return benodet;
    }

    public void setBenodet(String benodet) {
        this.benodet = benodet;
    }

    public String getOwnd() {
        return ownd;
    }

    public void setOwnd(String ownd) {
        this.ownd = ownd;
    }

    public String getBoOwnerName() {
        return boOwnerName;
    }

    public void setBoOwnerName(String boOwnerName) {
        this.boOwnerName = boOwnerName;
    }

    public String getBoAddress() {
        return boAddress;
    }

    public void setBoAddress(String boAddress) {
        this.boAddress = boAddress;
    }

    public String getBoUrefNumber() {
        return boUrefNumber;
    }

    public void setBoUrefNumber(String boUrefNumber) {
        this.boUrefNumber = boUrefNumber;
    }

    public int getOwnedUnit() {
        return ownedUnit;
    }

    public void setOwnedUnit(int ownedUnit) {
        this.ownedUnit = ownedUnit;
    }

    public String getBenodet2() {
        return benodet2;
    }

    public void setBenodet2(String benodet2) {
        this.benodet2 = benodet2;
    }

    public String getProposalOutput() {
        return proposalOutput;
    }

    public void setProposalOutput(String proposalOutput) {
        this.proposalOutput = proposalOutput;
    }
    
    public void addProposal(Proposals proposal){
        proposalList.add(proposal);
    }


    /**
    *
    * @param votes values loaded from csv
    * @return return true if similar line found
    */
    public boolean isSimilar(String[] votes) {
        boolean similar = false;
        if (safe.equals(votes[13]) 
                && seme.substring(0,6).equals(votes[3].substring(0,6))
                && caop.equals(votes[19]) 
                && corp.equals(votes[2])) {
            int nextColumn = ReadCsv.MANDATORY_NUMBER;
            while (votes.length > nextColumn + 4 && votes[nextColumn] != null) {
                for (Proposals proposal : proposalList) {
                    String proposalId = votes[nextColumn++];
                    int votesFor = Integer.parseInt(votes[nextColumn++]);
                    int votesAgainst = Integer.parseInt(votes[nextColumn++]);
                    int votesAbstain = Integer.parseInt(votes[nextColumn++]);  
                    if (proposalId.equals(proposal.getId())
                        && ((votesFor == 0 && proposal.getVotesFor() == 0) || (votesFor != 0 && proposal.getVotesFor() != 0))
                        && ((votesAgainst == 0 && proposal.getVotesAgainst() == 0) || (votesAgainst != 0 && proposal.getVotesAgainst()!= 0))
                        && ((votesAbstain == 0 && proposal.getVotesAbstain() == 0) || (votesAbstain != 0 && proposal.getVotesAbstain()!= 0))) {
                        similar = true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return similar;  
    }

    /*
    * 
    * @param votes values loaded from csv
    */
    public void addToGroup(String[] votes) {
        quins += Integer.parseInt(votes[20]);
        ownedUnit += Integer.parseInt(votes[30]);
        int nextColumn = ReadCsv.MANDATORY_NUMBER;
        for (Proposals proposal : proposalList) {
            nextColumn++;
            int votesFor = Integer.parseInt(votes[nextColumn++]);
            int votesAgainst = Integer.parseInt(votes[nextColumn++]);
            int votesAbstain = Integer.parseInt(votes[nextColumn++]);
            proposal.addVotesFor(votesFor);
            proposal.addVotesAgainst(votesAgainst);
            proposal.addVotesAbstain(votesAbstain);
        }
    }
    
    /**
    *
    * Create last column for output depending on the information from proposalsW
    */
    public void generateProposalOutput(){
        boolean hasCumulative = false;
        boolean hasFor = false;
        boolean hasAgainst = false;
        boolean hasAbstain = false;
        for (Proposals proposal : proposalList) {
            if (proposal.isCumulative()){
                hasCumulative = true;
                if (proposal.hasVotesFor()) {
                    appendToProposalOutput(cumForNum, proposal.getId());
                } 
                if (proposal.hasVotesAgainst()) {
                    appendToProposalOutput(cumAgstNum, proposal.getId());
                } 
                if (proposal.hasVotesAbstain()) {
                    appendToProposalOutput(cumAbstNum, proposal.getId());
                }
            } else {
                if (proposal.hasVotesFor()) {
                    appendToProposalOutput(forNum, proposal.getId());
                    hasFor = true;
                }
                if (proposal.hasVotesAgainst()) {
                    appendToProposalOutput(agstNum, proposal.getId());
                    hasAgainst = true;
                }
                if (proposal.hasVotesAbstain()) {
                    appendToProposalOutput(abstNum, proposal.getId());
                    hasAbstain = true;
                }
            }            
        }
		// check that there is no cumulative proposal, and all proposals are same
        if (!hasCumulative && ((hasFor ^ hasAgainst ^ hasAbstain) ^ (hasFor && hasAgainst && hasAbstain))) {
            if (hasFor) {
                proposalOutput = "ALL FAV";
            } 
            if (hasAgainst) {
                proposalOutput = "ALL AGST";
            }
            if (hasAbstain) {
                proposalOutput = "ALL ABST";
            }
        } else {
        proposalOutput = 
                ((forNum.toString().isEmpty()) ? "" : "FAV " + forNum.toString())
              + ((agstNum.toString().isEmpty()) ? "" : " AGST " + agstNum.toString())
              + ((abstNum.toString().isEmpty()) ? "" : " ABST " + abstNum.toString())
              + ((cumForNum.toString().isEmpty()) ? "" : " CU_FAV " + cumForNum.toString())
              + ((cumAgstNum.toString().isEmpty()) ? "" : " CU_AGST " + cumAgstNum.toString())
              + ((cumAbstNum.toString().isEmpty()) ? "" : " CU_ABST " + cumAbstNum.toString());
        }
    }
    
    /**
    * append id of proposals to buffer readers 
    *
    * @param sb type of voice to which the proposal will be added
    * @param proposalId id of proposal to be added to output
    */
    private void appendToProposalOutput(StringBuilder sb, String proposalId){
        if (!sb.toString().isEmpty()) {
            sb.append(",");
        }
        sb.append(proposalId);
    }
}
