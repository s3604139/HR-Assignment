package request;

import accounts.*;
import schedualing.*;

//used to notify staff of a assignment
public class Request {
	
	private int _Id;//unique ID to identify this object
	private Job _Job;//assigned job
	private Staff _Staff;//destined staff account
	private Coordinator _Issuer;//record the coordinator that issued the request
	
	public Request(Job job,Staff staff) {
		_Job = job;
		_Staff = staff;
		_Id = generateId();
	}
	
	//public getters
	public Coordinator get_Issuer() {
		return _Issuer;
	}
	public int get_Id() {
		return _Id;
	}
	public Staff get_Staff() {
		return _Staff;
	}
	public Job get_Job() {
		return _Job;
	}
	//
	private int generateId() {
		int result = 0;
		//method to generate unique ID
		return result;
	}
	
}