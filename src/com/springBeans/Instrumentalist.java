package com.springBeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer {

	private String song;
	private Instrument instrument;
	
	@Autowired
	public Instrumentalist() {	
	}
	
	@Override
	public void perform() throws PerformanceException {
		
		System.out.print("Playing " + song + " : ");
		instrument.play();
		
	}
	
	public void setSong( String song ) {
		this.song = song;
	}
	
	public String screamSong() {
		return song;
	}
	
	@Autowired
	public void setInstrument ( Instrument instrument ) {
		this.instrument = instrument;
	}

}
