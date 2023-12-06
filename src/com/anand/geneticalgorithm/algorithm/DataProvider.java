package com.anand.geneticalgorithm.algorithm;
import java.util.*;


import com.anand.geneticalgorithm.domain.*;

public class DataProvider {

	private List<Room> rooms;
	private List<Teacher> teachers;
	private List<Subject> subjects;
	private List<Department> departments;
	private List<TimeSlot> timeslots;
	private int numberOfClasses = 0;

	public DataProvider() {
		super();
		initialize();
	}

	private DataProvider initialize() {
		System.out.println("Enter the number of rooms:");
        Scanner sc = new Scanner(System.in);
        int numberOfRooms = sc.nextInt();
        rooms = new ArrayList<>();

        for (int i = 1; i <= numberOfRooms; i++) {
            System.out.println("Enter capacity for Room R" + i + ":");
            int roomNumber = sc.nextInt();
            Room room = new Room("R" + i, roomNumber);
            rooms.add(room);
        }

		//Room r1 = new Room("R1", 100);
		//Room r2 = new Room("R2", 75);
		//Room r3 = new Room("R3", 80);
		//rooms = new ArrayList<Room>(Arrays.asList(r1, r2, r3));

		// TimeSlot ts1 = new TimeSlot("TS1", "M 9:00 - 10:00");
		// TimeSlot ts2 = new TimeSlot("TS2", "M 10:00 - 11:00");
		// TimeSlot ts3 = new TimeSlot("TS3", "M 11:00 - 12:00");
		// TimeSlot ts4 = new TimeSlot("TS4", "M 12:00 - 1:00");
		// TimeSlot ts5 = new TimeSlot("TS4", "M 1:00 - 2:00");
		// TimeSlot ts6 = new TimeSlot("TS4", "M 2:00 - 3:00");
		// TimeSlot ts7 = new TimeSlot("TS4", "M 3:00 - 4:00");
        System.out.println("Enter the number of time slots:");
        int numberOfTimeSlots = sc.nextInt();
        sc.nextLine();
        timeslots = new ArrayList<>();
        for (int i = 1; i <= numberOfTimeSlots; i++) {
        	System.out.print("Enter a timing : ");
        	String time=sc.nextLine();
            TimeSlot timeSlot = new TimeSlot("TS"+i,time);
            timeslots.add(timeSlot);
        }
         

		//TimeSlot ts1 = new TimeSlot("TS1", "M 9:00 - 10:00");
		//TimeSlot ts2 = new TimeSlot("TS2", "M 10:00 - 11:00");
		//TimeSlot ts3 = new TimeSlot("TS3", "M 11:00 - 12:00");
		//TimeSlot ts4 = new TimeSlot("TS4", "M 12:00 - 1:00");
		//TimeSlot ts5 = new TimeSlot("TS4", "M 1:00 - 2:00");
		//TimeSlot ts6 = new TimeSlot("TS4", "M 2:00 - 3:00");
		//TimeSlot ts7 = new TimeSlot("TS4", "M 3:00 - 4:00");

		//timeslots = new ArrayList<>(Arrays.asList(ts1, ts2, ts3, ts4, ts5, ts6, ts7));
        System.out.println("Enter the number of teachers:");
        int numberOfTeachers = sc.nextInt();
        
        teachers = new ArrayList<>();

        for (int i = 1; i <= numberOfTeachers; i++) {
        	System.out.println("Enter teacher name:");
            String name = sc.next();
            Teacher teacher = new Teacher("T"+i, name);
            teachers.add(teacher);
        }

		//Teacher t1 = new Teacher("T1", "Sandeep");
		//Teacher t2 = new Teacher("T2", "Hitesh");
		//Teacher t3 = new Teacher("T3", "Sonali");
		//Teacher t4 = new Teacher("T4", "Ved prakash");
		//teachers = new ArrayList<Teacher>(Arrays.asList(t1, t2, t3, t4));
        /*Subject s1 = new Subject("S1", "OOPS", 75, new ArrayList<Teacher>(teachers.subList(0, 2)));
        Subject s2 = new Subject("S2", "SEPM", 25, new ArrayList<Teacher>(teachers.subList(0, 3)));
        Subject s3 = new Subject("S3", "Agile", 100, new ArrayList<Teacher>(teachers.subList(0, 2)));
        Subject s4 = new Subject("S4", "DevOPs", 65, new ArrayList<Teacher>(teachers.subList(2, 4)));
        Subject s5 = new Subject("S5", "CN", 90, new ArrayList<Teacher>(Collections.singletonList(teachers.get(3))));
        Subject s6 = new Subject("S6", "JAVA", 70, new ArrayList<Teacher>(Arrays.asList(teachers.get(0), teachers.get(2))));
        Subject s7 = new Subject("S7", "Docker", 80, new ArrayList<Teacher>(Arrays.asList(teachers.get(1), teachers.get(3))));*/

		//Subject s1 = new Subject("S1", "OOPS", 75, new ArrayList<Teacher>(Arrays.asList(t1, t2)));
		//Subject s2 = new Subject("S2", "SEPM", 25, new ArrayList<Teacher>(Arrays.asList(t1, t2, t3)));
		//Subject s3 = new Subject("S3", "Agile", 100, new ArrayList<Teacher>(Arrays.asList(t1, t2)));
		//Subject s4 = new Subject("S4", "DevOPs", 65, new ArrayList<Teacher>(Arrays.asList(t3, t4)));
		//Subject s5 = new Subject("S5", "CN", 90, new ArrayList<Teacher>(Arrays.asList(t4)));
		//Subject s6 = new Subject("S6", "JAVA", 70, new ArrayList<Teacher>(Arrays.asList(t1, t3)));
		//Subject s7 = new Subject("S7", "Docker", 80, new ArrayList<Teacher>(Arrays.asList(t2, t4)));
		//subjects = new ArrayList<Subject>(Arrays.asList(s1, s2, s3, s4, s5, s6, s7));
		
		////////////////////////////////////////////////
		System.out.println("Enter number of subjects");
		int numOfSubject=sc.nextInt();
		subjects = new ArrayList<>();
	    for (int i = 1; i <= numOfSubject; i++) { 
	        
	        System.out.print("Enter subject name: ");
	        String name = sc.next();
	        
	        System.out.print("Enter number of strength: ");
	        int strength = sc.nextInt();
	    
	        List<Teacher> associatedTeachers = new ArrayList<>();
	        System.out.println("Enter number of teachers for this subject: ");
	        int numTeachers = sc.nextInt();
	        sc.nextLine();
	        for (int j = 0; j < numTeachers; j++) {
	            System.out.print("Teacher " + (j + 1) + " name: ");
	            String teacherName = sc.nextLine();
	            for (Teacher teacher : teachers) {
	                if (teacher.getTeacherName().equals(teacherName)) {
	                    associatedTeachers.add(teacher);
	                    break;
	                }
	            }
	  
             }
	        Subject subject = new Subject("S"+i, name, strength, associatedTeachers);

	        subjects.add(subject);
	      }
	     ///////////////////////////////////////////////
	    System.out.println("Enter details of Department");
	    departments = new ArrayList<>();

	    for (int i = 1; i <= 3;i++) {
	        System.out.println("Enter details for Department " + i + ":");
	        
	        System.out.print("Enter department name: ");
	        String name = sc.next();
	        
	        List<Subject> associatedSubjects = new ArrayList<>();
	        System.out.print("Enter number of subjects for this department: ");
	        int numSubjects = sc.nextInt();
	        for (int j = 0; j < numSubjects; j++) {
	            System.out.print("Subject " + (j + 1) + " code: ");
	            String subjectCode = sc.next();
	            for (Subject subject : subjects) {
	                if (subject.getCourseId().equals(subjectCode)) {
	                    associatedSubjects.add(subject);
	                    break;
	                }
	            }
	            Department dept=new Department(name,associatedSubjects);
	            departments.add(dept);
	        }
	    }
		

		//Department d1 = new Department("Cybernetics", new ArrayList<Subject>(Arrays.asList(s1, s3)));
		//Department d2 = new Department("Systemics", new ArrayList<Subject>(Arrays.asList(s2, s4, s5)));
		//Department d3 = new Department("Informatics", new ArrayList<Subject>(Arrays.asList(s6, s7)));
		//departments = new ArrayList<Department>(Arrays.asList(d1, d2, d3));
		departments.forEach(x -> numberOfClasses += x.getSubjects().size());
		return this;
	}


	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public List<TimeSlot> getTimeslots() {
		return timeslots;
	}

	public void setTimeslots(List<TimeSlot> timeslots) {
		this.timeslots = timeslots;
	}

	public int getNumberOfClasses() {
		return numberOfClasses;
	}

	public void setNumberOfClasses(int numberOfClasses) {
		this.numberOfClasses = numberOfClasses;
	}
	

}