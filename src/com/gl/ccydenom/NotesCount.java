package com.gl.ccydenom;

public class NotesCount {
	
	public void NotesCountImpl(int[] notes, int amt) {
		int[] noteCounter = new int[notes.length];
		for (int i=0;i<notes.length;i++) {
			noteCounter[i] = amt / notes[i];
			amt = amt - noteCounter[i]*notes[i];
		}
		if (amt == 0) {
			System.out.println(" The payment approach will be as follows");
			for (int i = 0; i<notes.length;i++) {
				System.out.println(notes[i] + " : " + noteCounter[i]);
			}
		}
		else {
			System.out.println("Cannot pay this amount using the available ccy denominations");
		}
	}

}
