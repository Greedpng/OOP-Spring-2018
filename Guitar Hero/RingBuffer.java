import java.lang.Math;

public class RingBuffer {
  //Attributes
  public int start, end, capacity;
  public double [] buffer;

  //---------------------//
  // Default Constructor //
  //---------------------//
  public RingBuffer() {
    start = 0;
    end = 0;
    buffer = null;
  }

  //-------------------------//
  // Overloading Constructor //
  //-------------------------//
  public RingBuffer(int capacity) {
    start = 0;
    end = 0;
    buffer = new double[capacity];
    this.capacity = capacity;
  }

  //------------------------------------------------//
  // Return # of buffer within array (ring buffer) //
  //------------------------------------------------//
  public int size() {
    return Math.abs(end - start) % capacity;
  }

  //-----------------------------------------//
  // Is the buffer empty (size equals zero)? //
  //-----------------------------------------//
  public boolean isEmpty() {
    return size() == 0;
  }

  //---------------------------------------------//
  // Is the buffer full  (size equals capacity)? //
  //---------------------------------------------//
  public boolean isFull() {
    return size() == capacity;
  }

  //-----------------------//
  // Add item x to the end //
  //-----------------------//
  public void enqueue(double x) {		
 		buffer[end] = x;
 		end++;
 		if (end == capacity) {
      end = 0;
    }
  }

  //---------------------------------------//
  // delete and return item from the front //
  //---------------------------------------//
  public double dequeue() {					
 		double temp = buffer[start];
 		buffer[start] = 0;
 		start++;
 		if (start == capacity)
 			start = 0;
 		return temp;
  }

  //------------------------------------------------//
  // Return (but do not delete) item from the front //
  //------------------------------------------------//
  public double peek() {
    return buffer[start];
  }
}
