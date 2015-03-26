/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_ws.lib;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Luis
 */
public class Json {
    private HashMap message;
    public Json(){
       message = new HashMap();
    }
    public void set_entry_string(String key, String value){
       message.put(key,value);
    }
    public void set_entry_int(String key, int value){
       message.put(key,value);
    }
    public void set_entry_float(String key, float value){
       message.put(key,value);
    }
    public void set_entry_array(String key, ArrayList value){
       message.put(key,value);
    }
    public void set_entry_array(String key, JSONArray value){
       message.put(key,value);
    }
    public String create(int code){
        this.set_entry_int("COD", code);
        JSONObject message = new JSONObject(this.message);
        return message.toString();
    }

    public HashMap getMessage() {
        return message;
    }

    public void setMessage(HashMap message) {
        this.message = message;
    }
    
}
