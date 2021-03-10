package Class1;

import java.util.Comparator;

import objects.Student;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		if (a < b)
			return -1;
		else if (a == b)
			return 0;
	}

}
