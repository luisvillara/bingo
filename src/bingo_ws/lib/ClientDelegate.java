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
public interface ClientDelegate {
    public void process_message(JSONObject message, int code);
}
