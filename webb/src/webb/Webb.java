package webb;
import java.awt.Desktop;
import java.net.URI;
/**
 *
 * @author Moses
 */
public class Webb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception{
      Desktop d = Desktop.getDesktop();
      d.browse(new URI("http://index.html"));
      
      
    }
    
}
