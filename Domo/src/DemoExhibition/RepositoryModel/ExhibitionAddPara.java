package DemoExhibition.RepositoryModel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class  ExhibitionAddPara {
	 private String version;
  
	private UUID UID;
     private String title;
     private String category;

     public String getVersion() {
 		return version;
 	}
 	public void setVersion(String version) {
 		this.version = version;
 	}


	public UUID getUID() {
		return UID;
	}
	public void setUID(UUID uID) {
		UID = uID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
     
    public class Test {
    	 public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		private String title;
         private String category;
    }
}
