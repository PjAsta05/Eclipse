package id.ac.undiksha.siak;
import id.ac.undiksha.siak.entities.Student;
import id.ac.undiksha.siak.entities.Lecturer;
import id.ac.undiksha.siak.entities.Staff;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student std1 = new Student();
		//std1.setName("Puja");
		//std1.setAddress("Singaraja");
		
		//std1.printAll();
		
//		Student std2 = new Student(
//				"2115101005",
//				"Puja Astawa",
//				"Singaraja",
//				true,
//				"Computer Sience",
//				"Informatics",
//				"FTK"
//				);
//		std2.printAll();
		
//		Lecturer std3 = new Lecturer(
//				"1015101001",
//				"Puji Arti",
//				"Singaraja",
//				false,
//				"Informatics",
//				"FTK"
//				);
//		std3.printAll();
//		
//		Staff std4 = new Staff(
//				"01010505",
//				"Mamank Garox",
//				"Singaraja",
//				true,
//				"FTK"
//				);
//		std4.printAll();
		
//		Student std1 = new Student();
//		std1.setName("Puja");

		Student siA = new Student("Puja", "Singaraja", true,
				"2115101005", "ILKOM", "TI", "FTK"
				);
		siA.printAll();
		
		Lecturer siB = new Lecturer("10101010", "Puji", "Singaraja", false, "TI",
				"FTK");
		siB.printAll();
		
		Staff siC = new Staff("20202020", "Puja", "Singaraja", true, "FTK");
		siC.printAll();
	}
}
