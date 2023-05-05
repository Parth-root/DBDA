package wordfreqq;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Myfreq {

	public static void main(String[] args) throws IOException {
		HashMap<String,Integer>wordtocount=new HashMap<String, Integer>();
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(new FileReader("file.txt"));
		String line="";
		while((line=br.readLine())!=null){
			String [] words=line.split(" ");
			for(String word:words) {
				if(wordtocount.containsKey(word)) {
					int count=wordtocount.get(word);
					count=count+1;
					wordtocount.put(word, count);
				}
				else {
					wordtocount.put(word, 1);
				}
			}
			
		}
		
System.out.println(wordtocount);
	}

}
