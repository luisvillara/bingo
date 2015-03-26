/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_ws.views;

import bingo_client.bingo_client.Settings;
import bingo_ws.lib.RequestDelegate;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Luis
 */
public class Request implements RequestDelegate{
    
    public Request(){}
    
    @Override
    public void process_request(String message) {
        try {
            JSONObject response = new JSONObject(message);

        } catch (JSONException ex) {
            Logger.getLogger(Request.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
