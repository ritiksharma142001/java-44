package com.mentors;

public class KodNest {
	public static void main(String[] args) {
		Mentors mentor = new JavaMentor();
		Classroom cr = new Classroom(mentor);
		cr.conductSession();
	}
}
