package Entity.OpenArtist;

public class OpenArtistImportInputEntity {
	private String name;
	private String representImage;
	private String intro;
	private String address;
	private Integer buildingYearName;
	private String author;
	
	@Override
	public String toString() {
		return "OpenArtistImportInputEntityModel [name=" + name + ", representImage=" + representImage + ", intro="
				+ intro + ", address=" + address + ", buildingYearName=" + buildingYearName + ", author=" + author
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRepresentImage() {
		return representImage;
	}
	public void setRepresentImage(String representImage) {
		this.representImage = representImage;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getBuildingYearName() {
		return buildingYearName;
	}
	public void setBuildingYearName(Integer buildingYearName) {
		this.buildingYearName = buildingYearName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
