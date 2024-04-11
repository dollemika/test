import java.util.Scanner;

public class Name{
	public static void main(String[] args) {
		System.out.println("как тебя зовут?");
		String name;
		Scanner read = new Scanner(System.in);
		name = read.next();
		if 		(name.charAt(name.length()-1) == 'а' ||
				name.charAt(name.length()-1) == 'я' ||
				name.charAt(name.length()-1) == 'и' ||
				name.charAt(name.length()-1) == 'А' ||
				name.charAt(name.length()-1) == 'И' ||
				name.charAt(name.length()-1) == 'Я')
			System.out.println("Приветик!");
		else
			System.out.println("Здарова!");
	}
}