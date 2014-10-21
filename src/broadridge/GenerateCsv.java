package broadridge;

import java.io.IOException;
import java.util.List;

/**
 * 
 * @author Martin Černý <cerny.mrtn@gmail.com>
 */
public class GenerateCsv {
    
    void generateCsv(String file) {
        try {
            CommaFileWriter fw = new CommaFileWriter(file);
            
            fw.append("TAG        ,16R  ,20C             ,20C             ,23G  ,22F  ,16R  ,20C             ,16S  ,16S  ,16R   ,35B         ,16R       ,97A                       ,93B          ,16S       ,16S   ,16R    ,13A   ,22F  ,36B            ,16S    ,16R     ,70E                                                                                                                                                                                                               ,16S     ,16R     ,95V                  ,95V                                                         ,95V                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ,95V                           ,36B                                          ,16S     ");
            fw.append("\n");
            fw.append("BIC CODE   ,GENL ,CORP            ,SEME            ,TYPE ,CAEV ,LINK ,PREV            ,LINK ,GENL ,USECU ,ISIN        ,ACCTINFO  ,SAFE                      ,ELIG         ,ACCTINFO  ,USECU ,CAINST ,CAON  ,CAOP ,QINS           ,CAINST ,ADDINFO ,ADTX                                                                                                                                                                                                              ,ADDINFO ,BENODET ,OWND                 ,BO OWNER NAME                                               ,BO ADDRESS        ");
            fw.append("\n");
            
            List<Vote> voteList = ReadCsv.getVoteList();
            for (Vote savedVote : voteList) {
                savedVote.generateProposalOutput();
                
                fw.appendComma(savedVote.getBicCode());
                fw.appendComma(savedVote.getGenl());
                fw.appendComma(savedVote.getCorp());
                fw.appendComma(savedVote.getSeme());
                fw.appendComma(savedVote.getType());
                fw.appendComma(savedVote.getCaev());
                fw.appendComma(savedVote.getLink());
                fw.appendComma(savedVote.getPrev());
                fw.appendComma(savedVote.getLink2());
                fw.appendComma(savedVote.getGenl2());
                fw.appendComma(savedVote.getUsecu());
                fw.appendComma(savedVote.getIsin());
                fw.appendComma(savedVote.getAcctinfo());
                fw.appendComma(savedVote.getSafe());
                fw.appendComma(savedVote.getElig());
                fw.appendComma(savedVote.getAcctinfo2());
                fw.appendComma(savedVote.getUsecu2());
                fw.appendComma(savedVote.getCainst());
                fw.appendComma(savedVote.getCaon());
                fw.appendComma(savedVote.getCaop());
                fw.appendComma(String.valueOf(savedVote.getQuins()));
                fw.appendComma(savedVote.getCainst2());
                fw.appendComma(savedVote.getAddinfo());
                fw.appendComma(savedVote.getAdtx());
                fw.appendComma(savedVote.getAddinfo2());
                fw.appendComma(savedVote.getBenodet());
                fw.appendComma(savedVote.getOwnd());
                fw.appendComma(savedVote.getBoOwnerName());
                fw.appendComma(savedVote.getBoAddress());
                fw.appendComma(savedVote.getBoUrefNumber());
                fw.appendComma(String.valueOf(savedVote.getOwnedUnit()));
                fw.appendComma(savedVote.getBenodet2());
                fw.append(savedVote.getProposalOutput());
                fw.append("\n");
            }
            
            fw.flush();
            fw.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }        
    }
    
}
