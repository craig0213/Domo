package IRepository.OpenArtist;

import Entity.OpenArtist.OpenArtistImportInputEntity;

public interface OpenArtistImportInterfaceRepository {
	public Boolean OpenArtistJsonDataToDB(OpenArtistImportInputEntity inputModel);
}
