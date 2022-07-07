package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Computer computer = new Computer("3080Ti:" , 2);
    Computer workhorse = new Computer("3090:" , 3);
    System.out.println("computer screen(s):" + computer.getScreen());
    System.out.println("computer screen(s):" + workhorse.getScreen());
    System.out.println(computer.toString());
    System.out.println(workhorse.toString());
    }

}
