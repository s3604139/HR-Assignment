package schedualing;

import accounts.*;
//class hold info for a jobs time and place, also when assigned a staff member
public class Job {
	private int _ID;
	private int _Month;
	private int _Day;
	private double _Time;
	private double _Length;
	private String _Room;
	private Staff _Assigned;
	
	public Job(int month,int day,double time,double length,String room) {
		_Month=month;
		_Day=day;
		_Time=time;
		_Length=length;
		_Room=room;
	}

	public Staff get_Assigned() {return _Assigned;}
	public void set_Assigned(Staff _Assigned) {this._Assigned = _Assigned;}
	public String get_Room() {return _Room;}
	public double get_Length() {return _Length;}
	public double get_Time() {return _Time;}
	public int get_Day() {return _Day;}
	public int get_Month() {return _Month;}
	public int get_ID() {return _ID;}
	
}

