/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_ws.lib;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class Broadcast<Data> {
    public Broadcast() {
      arrived = false;
      waiting = 0;
    }
    public synchronized void send(Data message) {
      if(waiting != 0 && !arrived) {
        theMessage = message;
        arrived = true;
        notifyAll();
      }
    }
    public synchronized Data receive()
           throws InterruptedException {
      try {
        while(!arrived) { // wait for a message to arrive
          waiting++;
          wait();
          waiting--;
        }
        if(waiting == 0) {
          // The last thread to receive the message
          // resets the boolean flag.
          arrived = false;
        }
      } catch(InterruptedException ie) {
          if(--waiting == 0)
            arrived = false;
      }
      return theMessage;
    }
    private Data theMessage;
    private boolean arrived;
    private int waiting;
  }
