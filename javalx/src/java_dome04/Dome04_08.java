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
	 * @author 李宗润
	 * @category java正则文本分析
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		FileReader fileReader = new FileReader("C:\\Users\\李宗润\\Desktop\\M\\M.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String string = new String();
		for(;(string = bufferedReader.readLine()) != null;) {               //按行读取
			Matcher matcher = Pattern.compile("\\w+").matcher(string);      //正则表达式
			while(matcher.find())
				if(hashmap.get(matcher.group(0)) == null)
					hashmap.put(matcher.group(0), 1);                       //不存在，存入字典
				else 
					hashmap.put(matcher.group(0), hashmap.get(matcher.group(0)).intValue()+1); //存在加一
			System.out.println(string);
		}
		bufferedReader.close();
		Iterator<Entry<String, Integer>> iterator = hashmap.entrySet().iterator();
		for(;iterator.hasNext();) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("单词 " + entry.getKey() + "  出现频率" + entry.getValue());
		}
//		System.out.println(hashmap.get("I"));
	}

}
