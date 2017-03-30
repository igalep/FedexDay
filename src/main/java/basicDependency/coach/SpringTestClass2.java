package basicDependency.coach;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by ie54553 on 06/03/2017.
 */
public class SpringTestClass2 {
	private  Map map;

	public SpringTestClass2(Map map) {
		this.map  = map;
	}

	public void print(){
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()){
			String currentKey = iterator.next();
			System.out.println("######### " + map.get(currentKey) + " ____#######");
		}
	}
	public void printMap() {
		print();

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		String s = (String)map.get("1");
		s += "11";
		map.put("1" , s);

		print();

		int i = 0;
	}}
