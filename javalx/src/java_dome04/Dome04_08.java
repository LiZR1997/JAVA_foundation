package java_dome04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dome04_08 {

	/**
	 * @author ������
	 * @category java�����ı�����
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		FileReader fileReader = new FileReader("C:\\Users\\������\\Desktop\\M\\M.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String string = new String();
		for(;(string = bufferedReader.readLine()) != null;) {               //���ж�ȡ
			Matcher matcher = Pattern.compile("\\w+").matcher(string);      //������ʽ
			while(matcher.find())
				if(hashmap.get(matcher.group(0)) == null)
					hashmap.put(matcher.group(0), 1);                       //�����ڣ������ֵ�
				else 
					hashmap.put(matcher.group(0), hashmap.get(matcher.group(0)).intValue()+1); //���ڼ�һ
			System.out.println(string);
		}
		bufferedReader.close();
		Iterator<Entry<String, Integer>> iterator = hashmap.entrySet().iterator();
		for(;iterator.hasNext();) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("���� " + entry.getKey() + "  ����Ƶ��" + entry.getValue());
		}
//		System.out.println(hashmap.get("I"));
	}

}
