package IRepository.OpenArtist;

import java.util.ArrayList;

import Entity.OpenArtist.OpenArtistImportInputEntity;

public interface OpenArtistImportInterfaceRepository {
	public Boolean OpenArtistJsonDataToDB(ArrayList<OpenArtistImportInputEntity> inputModel);
}
