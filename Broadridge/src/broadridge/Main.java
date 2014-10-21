package broadridge;

/**
 * přejmenovat proposals
 * Vote.addToGroup přesunout
 * @author Martin Černý <cerny.mrtn@gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // reading data from a csv file
        System.out.println("Reading data from csv");  
        ReadCsv readCsv = new ReadCsv();  
        readCsv.readCsv("src/broadridge/stm.csv"); 
        
        // generating a csv file 
        System.out.println("Generating csv file");  
        GenerateCsv generateCsv = new GenerateCsv();
        generateCsv.generateCsv("src/broadridge/output.csv");
    }
    
}
