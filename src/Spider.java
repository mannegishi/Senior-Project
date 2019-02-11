import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Spider extends bork {

	public static void main(String[] args) throws IOException {
		aSecondChanceLeg();

	}

	public static void aSecondChanceLeg() throws IOException {
		Document doc = Jsoup.connect("https://www.asecondchancerescue.org/animals/list?Species=Dog").get();
		Element table = doc.select("tbody").last(); // select the first table.
		String text = table.text();
		text = text.replace("I WANT TO FOSTER TO ADOPT Dog - Terrier", "");
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

		String[] names;

		System.out.println(text);

		String currentName;
		int nameLocation;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c == '#') {
				nameLocation = i;
				currentName = text.substring(0, nameLocation);
				System.out.println(currentName);

				break;
			}
			//if (c == '#' && i != 0) {

			//}
		}
	}

	public static void leg2() throws IOException {

	}

	public static void leg3() throws IOException {

	}
}
