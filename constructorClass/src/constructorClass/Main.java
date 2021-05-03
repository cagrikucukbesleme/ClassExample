package constructorClass;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Courses course1 =new Courses(1,"Yazýlým Geliþtirici C#",0,"C# training");
		Courses course2 =new Courses(2,"Yazýlým Geliþtirici java",0,"java training");
		Courses course3 =new Courses(3,"Yazýlým Geliþtirici Temel",0,"software training");
		
		Courses[] course= {
				course1,course2,course3
		};
		for (Courses courses : course) {
			System.out.println(courses.name);
		}
		CoursesEducator educator1=new CoursesEducator();
		educator1.id=1;
		educator1.name="Engin";
		System.out.println(educator1.name);
			
		CourseCategory category1= new CourseCategory();
		category1.id=1;
		category1.name="C#";
		System.out.println(category1.name);
		
		CourseCategory category2= new CourseCategory();
		category2.id=2;
		category2.name="java";
		
		CourseCategory category3= new CourseCategory();
		category3.id=3;
		category3.name="general";
		websiteManager websiteManager= new websiteManager();
		websiteManager.includeToProgram(course1);
		websiteManager.includeToProgram(course2);
		websiteManager.includeToProgram(course3);
		
		websiteManager.SSS();
		
		websiteManager.prepForCamp();
		
	}

}
