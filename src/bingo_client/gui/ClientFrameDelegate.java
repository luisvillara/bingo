/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.gui;

import org.json.JSONObject;

/**
 *
 * @author Luis
 */
public interface ClientFrameDelegate {
    public void exe_client_type_view(int option_value);
    
    public void process_message(JSONObject message, int code);
}
