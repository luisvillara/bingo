/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_ws.lib;

import org.json.JSONObject;

/**
 *
 * @author Luis
 */
public interface ServerDelegate {
    public void process_message(String senderIP, JSONObject message, int code);
}
