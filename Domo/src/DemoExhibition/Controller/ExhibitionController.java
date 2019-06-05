package DemoExhibition.Controller;

import java.io.*;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

import DemoExhibition.RepositoryModel.ExhibitionAddPara;

public class ExhibitionController {

	
	public static void main(String[] arg) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		 
		InputStreamReader isr = new InputStreamReader(new FileInputStream("E:/SearchShowAction.json"), "UTF-8");
		BufferedReader read = new BufferedReader(isr);

		 String line = read.readLine(); 

		 ExhibitionAddPara[] test = mapper.readValue(line, ExhibitionAddPara[].class);

	}
}
