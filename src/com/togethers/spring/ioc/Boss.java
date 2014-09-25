package com.togethers.spring.ioc;

public class Boss {

	public void direct() {
		Leader leader = new Li();
		Team team = new Team();
		team.fistMeeting(leader);
	}

}
