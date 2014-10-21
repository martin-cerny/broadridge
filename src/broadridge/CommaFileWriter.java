package broadridge;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Martin Černý <cerny.mrtn@gmail.com>
 */
public class CommaFileWriter extends FileWriter{
    
    public CommaFileWriter(String fileName) throws IOException {
        super(fileName);
    }
    
    public CommaFileWriter appendComma(String c) throws IOException {
        super.append(c + ",");
        return this;
    }
}
