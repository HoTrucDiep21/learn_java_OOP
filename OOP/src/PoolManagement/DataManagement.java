/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoolManagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC TGDD
 */
public class DataManagement {
       private static DataManagement instance = null;
       List<SwimmingPool> swimmingPools = new ArrayList<>();

    public DataManagement() {
    }

    public synchronized static DataManagement getInstance() {
        if (instance == null) {
            instance = new DataManagement();
        }
        return instance;
    }

    public static void setInstance(DataManagement instance) {
        DataManagement.instance = instance;
    }

    public List<SwimmingPool> getSwimmingPools() {
        return swimmingPools;
    }

    public void setSwimmingPools(List<SwimmingPool> swimmingPools) {
        this.swimmingPools = swimmingPools;
    }
       
    
    
}
