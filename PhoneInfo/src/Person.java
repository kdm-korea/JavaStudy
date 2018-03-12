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
		return name + "(" + age + "��)";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("����ȣ", 10));
		hSet.add(new Person("����", 10));
		hSet.add(new Person("����", 20));
		hSet.add(new Person("����f", 10));
		hSet.add(new Person("����", 10));
		hSet.add(new Person("����", 10));
		hSet.add(new Person("����", 10));
		System.out.println("����� ������ �� : " + hSet.size());
		Iterator<Person> itr = hSet.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}
