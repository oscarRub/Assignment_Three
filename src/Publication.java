

public class Publication {
	
	String Author,Publication_month;
	int pages;
	
	public Publication(String author1,String publication_m,int pages ) {
		this.Author = author1;
		this.Publication_month = publication_m;
		this.pages = pages;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPublication_month() {
		return Publication_month;
	}

	public void setPublication_month(String publication_month) {
		Publication_month = publication_month;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String Publication() {
		return "";
	}
	
}
