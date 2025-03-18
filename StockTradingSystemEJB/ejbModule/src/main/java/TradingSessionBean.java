package src.main.java;

import java.util.ArrayList;
import java.util.List;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateful;

/**
 * Session Bean implementation class TradingSessionBean
 */
@Stateful
@LocalBean
public class TradingSessionBean {

    /**
     * Default constructor. 
     */
    public TradingSessionBean() {
        // TODO Auto-generated constructor stub
    }
    
    private List<String> watchList = new ArrayList<>();
    private
    

}
