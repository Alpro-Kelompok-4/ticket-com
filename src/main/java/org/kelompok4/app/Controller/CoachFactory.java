package org.kelompok4.app.Controller;

import org.kelompok4.app.Model.BusinessCoach;
import org.kelompok4.app.Model.Coach;
import org.kelompok4.app.Model.PremiumCoach;

public class CoachFactory {
    public Coach getCoach(String type){
        if(type==null){
            return null;
        }else if(type.equalsIgnoreCase("Business")){
            return new BusinessCoach();
        }else if(type.equalsIgnoreCase("Premium")){
            return new PremiumCoach();
        }
        return null;
    }
}
