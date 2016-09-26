package ratecapture;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;
import org.mule.DefaultMuleMessage;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.transport.DefaultMuleMessageFactory;



public class RateServiceOutBoundCallFunctionalTestCase extends FunctionalTestCase {
	private static final String INPUT_PAYLOAD = "INFILE_TEST.XML";

	@Override
	protected String[] getConfigFiles() {

		String[] configFile = { "ratecapture-outbound.xml" };
		return configFile;
	}

	@Test
	public void testOutboundCall() throws MuleException, IOException, URISyntaxException {
		MuleClient muleClient = muleContext.getClient();
		String payload = readFile(INPUT_PAYLOAD);
		MuleMessage message = new DefaultMuleMessage(payload,muleContext);
//		Map<String, Object> operationOptions = null;
		MuleMessage response = muleClient.send("vm://rateServiceChannel", message,60000);
		Assert.assertNotNull(response);
		Assert.assertNotNull(response.getPayload());
	}
	
	public String readFile(String fileName) throws IOException, URISyntaxException{
		URI uri = this.getClass().getClassLoader().getResource(fileName).toURI();
		File file= new File(uri);
		return FileUtils.readFileToString(file);
	}
}
