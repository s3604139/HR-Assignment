package schedualing;

import java.util.*;

import accounts.*;

//class contains all jobs, main function will be the formmatting of the schedual
public class Schedual {
	List<Job> jobs;//jobs without staff
	List<Job> assignments;//jobs with staff
	
	//create empty lists for both attributes
	public Schedual(){
		jobs=new ArrayList<Job>();
		assignments=new ArrayList<Job>();
	}
	public void assignStaff(Staff staff,Job job) {
		//assign staff to a job
		//move that job from jobs to assignments
	}

}
