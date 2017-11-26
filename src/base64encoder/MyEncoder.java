/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base64encoder;

import java.util.Base64;

/**
 *
 * @author Zahangir Alam
 */
public class MyEncoder {
    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getEncoder();
        String encoding = encoder.encodeToString(("Zahangir:Alam").getBytes());
        System.out.println(encoding);
        Base64.Decoder decoder = Base64.getDecoder();
        String decord = new String(decoder.decode(encoding));
        System.out.println(decord);
    }
}
