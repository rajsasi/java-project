public class Rectangle {
	public int lenght;
	public int width;

	public Rectangle(int length, int width) {
		this.length = lenght;
		this.width = width;

	}

	public int getArea(){
		return length * width;
	}

	public int getPerimeter(){
		return 2 * (lenth + width);
	}
}
