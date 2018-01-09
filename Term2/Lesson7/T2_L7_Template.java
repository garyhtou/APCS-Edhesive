package Lesson7;
/*
 * Lesson 7 - Unit 6 - Inheritance
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

import Lesson5.Book;

class t2_lesson07_template extends Book{
	private String illustrator;
	
	public t2_lesson07_template() {
		this("none", "unknown", "unknown", 1900);
	}
	public t2_lesson07_template (String t, String a, String i, int y) {
		super(t, a, y);
		illustrator = i;
	}
}
