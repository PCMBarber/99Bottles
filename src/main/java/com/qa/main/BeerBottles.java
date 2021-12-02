package com.qa.main;

public class BeerBottles {

	public void theSongFor() {
		for(int i = 99; i>=0; i--) {
			if(i==0) {
				System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
				System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
				continue;
			}
			if(i==1) {
				System.out.printf("%d bottle of beer on the wall, %d bottle of beer.\n",i,i);
			} else {
				System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n",i,i);
			}
			if(i==2) {
				System.out.printf("Take one down and pass it around, %d bottle of beer on the wall.\n",i-1);
			} else {
				System.out.printf("Take one down and pass it around, %d bottles of beer on the wall.\n",i-1);
			}
		}
	}

	public void theSongWhile() {
		int i = 99;
		while(i>=0) {
			if(i==0) {
				System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
				System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
				i--;
				continue;
			}
			if(i==1) {
				System.out.printf("%d bottle of beer on the wall, %d bottle of beer.\n",i,i);
			} else {
				System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n",i,i);
			}
			i--;
			if(i==1) {
				System.out.printf("Take one down and pass it around, %d bottle of beer on the wall.\n",i);
			} else {
				System.out.printf("Take one down and pass it around, %d bottles of beer on the wall.\n",i);
			}
		}
	}
}









