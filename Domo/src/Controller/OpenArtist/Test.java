package Controller.OpenArtist;

public class Test {
	public  int VowelCount(String[] stringArray) {
		int count = 0;
		
		
		for(String s : stringArray) {
			for(int j = 0; j< s.length(); j++) {
				switch (s.toLowerCase().charAt(j)) {
					case 'a': 
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						count++;
						break;
				}
			}
		}
		
		return count;
		
	}
}
