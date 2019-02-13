import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Spider {

	public static void main(String[] args) throws IOException {
		//aSecondChanceLeg();
		leg2();

	}

	public static void aSecondChanceLeg() throws IOException {
		Document doc = Jsoup.connect("https://www.asecondchancerescue.org/animals/list?Species=Dog").get();
		Element table = doc.select("tbody").last(); // select the first table.
		String text = table.text();
		text = text.replace("I WANT TO FOSTER TO ADOPT Dog - Terrier ", "");
		text = text.replace(" / ", "/");
		text = text.replace(" Dog - ", "#");
		if (text.contains("Female")) {
			text = text.replace(" Female ", "@Female*\n");
		}
		if (text.contains("Male")) {
			text = text.replace(" Male ", "@Male*\n");
		}
		if (text.contains("adoption pending")) {
			text = text.replace(" (adoption pending)", "");
		}
		if (text.contains(" Female")) {
			text = text.replace(" Female", "@Female*\n");
		}
		if (text.contains(" Male")) {
			text = text.replace(" Male", "@Male*\n");
		}

		String[] names;

		System.out.println(text);

		String currentName;
		int lNameLocation = 0;
		int fNameLocation = 0;
		int starLocation = 0;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (text.charAt(i) == '*') {
				starLocation = i;
			}
			if (c == '#' && fNameLocation == 0) {
				fNameLocation = lNameLocation;
				lNameLocation = i;

				currentName = text.substring(fNameLocation, lNameLocation);
				System.out.println(currentName);

				fNameLocation = 1;
				
				checkForName(currentName, 1);
				
			} else if (c == '#') {
				fNameLocation = starLocation + 2;
				lNameLocation = i;

				currentName = text.substring(fNameLocation, lNameLocation);
				System.out.println(currentName);

			}

		
		}
	}

	public static void leg2() throws IOException {
		Document doc = Jsoup.connect("https://www.justinbartlettanimalrescue.org/animals/list?Species=Dog").get();
		Element table = doc.select("tbody").last(); // select the first table.
		String text = table.text();
		text = text.replace("General Sponsorship Option Dog - Terrier / Mixed ", "");
		text = text.replace(" / ", "/");
		text = text.replace(" Dog - ", "#");
		if (text.contains("Female")) {
			text = text.replace(" Female ", "@Female*\n");
		}
		if (text.contains("Male")) {
			text = text.replace(" Male ", "@Male*\n");
		}
		if (text.contains("adoption pending")) {
			text = text.replace(" (adoption pending)", "");
		}
		if (text.contains(" Female")) {
			text = text.replace(" Female", "@Female*\n");
		}
		if (text.contains(" Male")) {
			text = text.replace(" Male", "@Male*\n");
		}
		//if(text.contains("Ropie#Labrador Retriever/Mixed")) {
		//	text = text.replace("Ropie#Labrador Retriever/Mixed", "");
		//Layne#Chihuahua/Mixed@Male*
		//Lilly#Chihuahua/Miniature Pinscher/Mixed (short coat)@Female*
		//}
		System.out.println(text);


		int firstPlace = 0;
		int lastPlace = 0;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if(c == '#') {
				firstPlace = lastPlace;
				lastPlace = i;
				String tempText = text.substring(firstPlace, lastPlace);
				System.out.println(tempText);
				if (!(tempText).contains("@")){
					text = text.replace(text.substring(firstPlace, tempText.indexOf("\n")), "");
				}
				
			}
		}
		String[] names;

		System.out.println(text);
		
		String currentName;
		int lNameLocation = 0;
		int fNameLocation = 0;
		int starLocation = 0;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (text.charAt(i) == '*') {
				starLocation = i;
			}
			if (c == '#' && fNameLocation == 0) {
				fNameLocation = lNameLocation;
				lNameLocation = i;

				currentName = text.substring(fNameLocation, lNameLocation);
				System.out.println(currentName);

				fNameLocation = 1;
				
				checkForName(currentName, 1);
				
			} else if (c == '#') {
				fNameLocation = starLocation + 2;
				lNameLocation = i;

				currentName = text.substring(fNameLocation, lNameLocation);
				System.out.println(currentName);

			}

		
		}
		
	}

	public static void leg3() throws IOException {

	}
	
	public static void checkForName(String name, int id) {
		if(id == 1) {
			
		}
		
		if(id == 2) {
			
		}
		
		if(id == 3) {
			
		}
	}
}
