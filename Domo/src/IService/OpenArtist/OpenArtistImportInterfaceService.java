package IService.OpenArtist;

import java.util.ArrayList;

import ServiceModel.OpenArtist.OpenArtistImportInputModel;

public interface OpenArtistImportInterfaceService {
	
	public Boolean ImportJsonData(ArrayList<OpenArtistImportInputModel> inputModel);
}
