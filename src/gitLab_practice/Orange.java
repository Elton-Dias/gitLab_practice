package gitLab_practice;

// RBCA-19-112

public class Orange {
String color;
Orange(String color)
{
	this.color=color;
	
}
String getColor()
	{
		return color;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange greenApple = new Orange("green");
		String color = greenApple.getColor();
		System.out.println("color of apple is " + color);
	}
}