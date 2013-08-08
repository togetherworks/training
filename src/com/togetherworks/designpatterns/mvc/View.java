package com.togetherworks.designpatterns.mvc;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class View extends JFrame{

	private Model model;

	public View(Model model) throws HeadlessException {
		super("MVC Demo");
		this.model = model;
	}
	

}
