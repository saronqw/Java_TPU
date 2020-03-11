package com.company;

public class Glider extends AirTransport {

     public Glider(String sideNumber, int planningRange) {
          super(sideNumber);
          this.planningRange = planningRange;
     }

     private int planningRange;

     public int getPlanningRange() {
          return planningRange;
     }

     public void setPlanningRange(int planningRange) {
          this.planningRange = planningRange;
     }

     @Override
     public String showInfo() {
          return super.showInfo() +
                  ", sideNumber = " + getSideNumber() +
                  ", planningRange = " + planningRange;
     }
}
