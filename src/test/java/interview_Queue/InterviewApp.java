package interview_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class InterviewApp {

	private Queue<Candidate> candidates=new LinkedList<Candidate>();
	int sno=0;
	Timer timer = new Timer();
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		InterviewApp interviewApp=new InterviewApp();
		interviewApp.start();
	}
	public void start() {
		boolean b=true;
		System.out.println("Welcome to Interview");
		start:do {
			System.out.println("1.Add candidate\n2.no of candidates\n3.candidate on interview\n4.end Interview");
			int choice=s.nextInt();
			s.nextLine();
			switch (choice) {
			case 1:{
				candidates.add(addCandidate());
				break;
			}case 4:{
				timer.cancel();
				break start;
			}case 2:{
				if(!candidates.isEmpty()) {
					System.out.println("the candidates in queue : "+(candidates.size()-1));
				}else {
					System.out.println("the candidates in queue : "+candidates.size());
				}
				break;
			}case 3:{
				if(!candidates.isEmpty()) {
					System.out.println("Candidate on interview : "+candidates.peek().getName());
				}else {
					System.out.println("no one in queue");
				}
				break;
			}
			default:
				break;
			}
			if(b&&!candidates.isEmpty()) {
				b=false;
				remove();
			}else if(candidates.isEmpty()) {
				timer.cancel();
				b=true;
			}
		} while (true);
		System.out.println("Thank you for attending interview");
	}
	public Candidate addCandidate() {
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println("Enter your age");
		int age=s.nextInt();
		s.nextLine();
		System.out.println("Enter your Qualification");
		String qualification=s.next();
		System.out.println("Enter your year of Experience");
		int experience=s.nextInt();
		s.nextLine();
		System.out.println("Enter the role you applied for");
		String role=s.next();
		
		return new Candidate(++sno, name, age, qualification, experience, role);
	}
	public void remove() {
       // Create a TimerTask object.
       TimerTask task = new TimerTask() {
           public void run() {
               if(!candidates.isEmpty()) {
            	  candidates.poll(); 
               }
           }
       };

       // Schedule the task to be executed every 1 second.
       timer.schedule(task, 30000, 30000);
	}
}
