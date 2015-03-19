/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_ws.lib;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class MD5 {
    public static String MD5(String clear)
    {
        String sb = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update( clear.getBytes() );
            BigInteger hash = new BigInteger( 1, md5.digest() );
            sb = hash.toString(16); // BigInteger strips leading 0's
            while ( sb.length() < 32 ) { sb = "0" + sb; } // pad with leading 0's
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(MD5.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sb;
    }
}
