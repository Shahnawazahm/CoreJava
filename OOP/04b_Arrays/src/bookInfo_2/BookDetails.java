package bookInfo_2;

public class BookDetails {
	public String bName, bCode, bAuthor;
	public float bPrice, bQnty;
	
	public BookDetails(String bName, String bCode, String bAuthor, float bPrice, float bQnty){
		this.bName = bName;
		this.bCode = bCode;
		this.bAuthor = bAuthor;
		this.bPrice = bPrice;
		this.bQnty = bQnty;
	}
	public String toString() {
		return "Book name: "+bName+".\nBook code: "+bCode+ ".\nBook author: "+bAuthor
				+".\nBook price: "+bPrice+".\n Book quantity: "+bQnty;
	}
	
}
