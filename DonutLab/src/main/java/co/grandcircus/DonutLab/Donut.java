package co.grandcircus.DonutLab;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Donut {
	private int id;
	private String ref;
	private String name;
	private int calories;
	private String[] extras;
	private String photo;
	@JsonProperty("photo_attribution")
	private String photoAttribution;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public String[] getExtras() {
		return extras;
	}
	public void setExtras(String[] extras) {
		this.extras = extras;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getPhotoAttribution() {
		return photoAttribution;
	}
	public void setPhotoAttribution(String photoAttribution) {
		this.photoAttribution = photoAttribution;
	}
	
}
