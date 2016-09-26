/**
 * 
 */
package ratecapture;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.io.FileUtils;

/**
 * 
 * Helper methods for Test Cases
 * @author u180362
 *
 */
public class TestCaseUtils {

	public static String readFile(String fileName) throws IOException, URISyntaxException{
		URI uri = TestCaseUtils.class.getClassLoader().getResource(fileName).toURI();
		File file= new File(uri);
		return FileUtils.readFileToString(file);
	}
	
}
