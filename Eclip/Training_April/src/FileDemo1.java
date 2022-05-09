import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File ("resume.txt");
		file.createNewFile();
		
		File file = new File("/home/arulraj/Desktop"); 
		String[] list_of_files = file.list(); 
	for(String st:list_of_files)
	{
		System.out.println(st);
		
		
		mport java.util.*;
		public class JavaReplaceCharExample{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Hi, please enter the String");
		String str = input.nextLine();
		System.out.println("Enter the character to replace");
		char ch = input.next().charAt(0);
		System.out.println("Enter the character to be replaced with");
		char newCh = input.next().charAt(0);
		String newStr = str.replace(ch, newCh);
		//displaying new string after applying replace method
		System.out.println(newStr);
		}
		
		
		import java.util.*;
		public class JavaReplaceCharExample2{
		public static void main(String[] args){
		//second string to replace the character
		String str = "All that glitters is not gold";
		//displaying string before applying replace method
		System.out.println("\n" + str);
		//replacing character p from b
		String newStr = str.replace("g", "b");
		//displaying string after replacing the character
		System.out.println(newStr);
		//second string to replace the character
		String sentence = "A cat has nine lives";
		//displaying string before applying replace method
		System.out.println("\n" + sentence);
		//replacing character n from m
		String newSentence = sentence.replaceFirst("n", "m");
		//displaying new string after applying replace method
		System.out.println(newSentence);
		}
		}
		
		import java.util.*;
		public class JavaReplaceCharExample3{
		public static void main(String[] args){
		//second string to replace the character
		String str = "Alabama|California|Florida|Texas|New Jersey|Arizona";
		//displaying string before applying replace method
		System.out.println("\n" + str);
		//replacing | with the comma
		String newStr = str.replace('|', ',');
		//displaying string after applying replace method
		System.out.println("\n" + newStr);
		//replacing the character A with the i
		String reNewedStr = newStr.replace('A', 'i');
		//displaying string before applying replace method
		System.out.println("\n" + reNewedStr);
		}
		}
		}
	}

	}

}
