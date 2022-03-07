public class Book entends TangibleAsset{
	private String isbn;
	publc Book(String name,int price,String color,String isbn){
		super(name,price,color);
		this.isbn = isbn;
	}
	public String getlsbn(){return this.isbn;}
}
