package Service.OpenArtist;

import java.util.ArrayList;

import Entity.OpenArtist.OpenArtistImportInputEntity;
import IService.OpenArtist.OpenArtistImportInterfaceService;
import Repository.OpenArtist.OpenArtistImportRepository;
import ServiceModel.OpenArtist.OpenArtistImportInputModel;

public class OpenArtistImportService implements OpenArtistImportInterfaceService {

	private OpenArtistImportRepository _openArtistImportRepository;
	@Override
	public Boolean ImportJsonData(ArrayList<OpenArtistImportInputModel> inputModel) {
		
		_openArtistImportRepository = new OpenArtistImportRepository();
		
		ArrayList<OpenArtistImportInputEntity> inputData = new ArrayList<OpenArtistImportInputEntity>();
		inputModel.forEach(data -> {
			OpenArtistImportInputEntity tempData = new OpenArtistImportInputEntity();
			tempData.setAddress(data.getAddress());
			tempData.setAuthor(data.getAuthor());
			tempData.setBuildingYearName(data.getBuildingYearName());
			tempData.setIntro(data.getIntro());
			tempData.setName(data.getName());
			tempData.setRepresentImage(data.getRepresentImage());
			
			inputData.add(tempData);
		});
		
		return _openArtistImportRepository.OpenArtistJsonDataToDB(inputData);
		
	}

	
}
