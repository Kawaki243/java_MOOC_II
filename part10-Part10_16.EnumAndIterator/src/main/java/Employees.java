import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
	private List<Person> employees;

	public Employees(){
		this.employees = new ArrayList<>();
	}

	public void add(Person personToAdd){
		this.employees.add(personToAdd);
	}

	public void add(List<Person> peopleToAdd){
		for(Person person : peopleToAdd){
			this.employees.add(person);
		}
	}

	public void print(){
		Iterator<Person> iterator = this.employees.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void print(Education education){
		Iterator<Person> iterator = this.employees.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			if(person.getEducation() == education){
				System.out.println(person);
			}
		}
	}

	public void fire(Education education){
		List<Person> listPersonRemove  = new ArrayList<>();
		for(Person person : this.employees){
			if(person.getEducation() == education){
				listPersonRemove.add(person);
			}
		}
		this.employees.removeAll(listPersonRemove);
	}
}
