package thread;

import java.io.EOFException;

class ThreadEx2 {
    public static void main(String[] args) {
        ThreadEx2_1 t1 = new ThreadEx2_1();
        t1.start();  
    }    
}

class ThreadEx2_1 extends Thread {
    public void run() {
        throwException();
    }

    public void throwException () {
        try {
            throw new EOFException();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}


