import java.util.HashSet;
import java.util.Iterator;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + "(" + age + "세)";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("이진호", 10));
		hSet.add(new Person("이진", 10));
		hSet.add(new Person("이진", 20));
		hSet.add(new Person("이진f", 10));
		hSet.add(new Person("이진", 10));
		hSet.add(new Person("이진", 10));
		hSet.add(new Person("이진", 10));
		System.out.println("저장된 데이터 수 : " + hSet.size());
		Iterator<Person> itr = hSet.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}
