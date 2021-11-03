/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciointereses;

/**
 *
 * @author patri
 */
public class RedSocial extends Entretencion {
    private String url;

    public RedSocial( ) {
        this.url = "";
    }
    
    public RedSocial(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "RedSocial{" + ", url=" + url + '}';
    }
    
    
}
