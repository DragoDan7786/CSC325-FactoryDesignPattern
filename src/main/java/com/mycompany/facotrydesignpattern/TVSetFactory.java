 
package com.mycompany.facotrydesignpattern;

/**
 *
 * @author MoaathAlrajab
 */
public class TVSetFactory {
    
    public TV getInstance(String str){
        
        switch (str){
            case "4K": return new OledTV();
            case "8K":
            case "16K":
            case "LED": return new LedTV();
            case "LCD": return new LCDTV();
            case "PLASMA": return new PlasmaTV();
            default: return new CRTTV();
            
        }
    }
    
}
