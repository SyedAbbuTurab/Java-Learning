
public class Books {
	
	String title;
	int pages;
	
	Books(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}
	
	String displayInfo() {
		return this.title + " (" + this.pages + " pages)";
	}
}
