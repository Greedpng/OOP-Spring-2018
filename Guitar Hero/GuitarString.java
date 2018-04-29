import java.lang.Math;

public class GuitarString {
    private int tics;
    RingBuffer buffer;

    public GuitarString(double frequency) {    // create a guitar string of the given frequency, using a sampling rate of 44,100
        buffer = new RingBuffer((int)(44100.0 / frequency + 0.5));
        tics = 0;
    }  

    public GuitarString(double[] init) {       // create a guitar string whose size and initial values are given by the array
        buffer = new RingBuffer(init.length);
        tics = 0;
		for (int i = 0; i < init.length; i++) {
			buffer.enqueue(init[i]);
		}
    }     

    public void pluck() {                      // set the buffer to white noise
        for (int i = 0; i < buffer.buffer.length; i++) {
			buffer.enqueue(Math.random() - 0.5);
        }
    }   

    public void tic(){                         // advance the simulation one time step
        buffer.enqueue((buffer.dequeue()+buffer.peek())/2*0.994);
		tics++;
    }

    public double sample() {                   // return the current sample
        return buffer.peek();
    }                     
    
    public int time() {                        // return number of tics 
        return tics;
    }
}