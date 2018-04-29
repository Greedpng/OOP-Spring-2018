import java.lang.Math;

public class GuitarString {

	private int tics; 
	RingBuffer buffer;

	GuitarString(double frequency) {				// create a guitar string of the given frequency, using a sampling rate of 44,100
		buffer = new RingBuffer((int) (44100.0 / frequency + 0.5)); 	
		tics = 0;
	}

	GuitarString(double[] init) {					// create a guitar string whose size and initial values are given by the array
		buffer = new RingBuffer(init.length);
		for (int i = 0; i < init.length; i++) {
			buffer.enqueue(init[i]);
		}
		tics = 0;
	}

	void pluck() {									// pluck the guitar string by replacing the buffer with white noise
		for (int i = 0; i < buffer.buffer.length; i++) {
			buffer.enqueue(Math.random() - 0.5);
		}
	}

	void mute() {
		for (int i = 0; i < buffer.buffer.length; i++) {
			buffer.dequeue();
		}
	}

	void tic() {									// advance the simulation one time step
		buffer.enqueue((buffer.dequeue()+buffer.peek())/2*0.996);
		tics++;
	}

	double sample() { 								// return the current sample
		return buffer.peek();
	}

	int time() {									// return number of times tic was called so far
		return tics;
    }
}