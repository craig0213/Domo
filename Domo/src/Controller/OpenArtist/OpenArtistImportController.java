package Controller.OpenArtist;

import java.io.*;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import Service.OpenArtist.OpenArtistImportService;
import ServiceModel.OpenArtist.OpenArtistImportInputModel;

public class OpenArtistImportController {

	public static void main(String[] arg) throws IOException  {
		OpenArtistImportService _openArtistImportService;
		ObjectMapper mapper = new ObjectMapper();
		Boolean result;
		
		String jsonFilePath = System.getProperty("user.dir");
		StringBuffer sb = new StringBuffer();
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream(jsonFilePath + "/../emapOpenDataAction.json"))){
			
			try(BufferedReader br = new BufferedReader(isr)){
				while (br.ready()) {
					sb.append(br.readLine());
				}
				_openArtistImportService = new  OpenArtistImportService();
				ArrayList<OpenArtistImportInputModel> inputData= mapper.readValue(sb.toString(), new TypeReference<ArrayList<OpenArtistImportInputModel>>() {});

				result = _openArtistImportService.ImportJsonData(inputData);
				
				System.out.print(result);
				
			}catch(Exception e) {
				System.out.print(e);
			}
			
		}catch(Exception e) {
			System.out.print(e);
			
		}

	}
}
