package com.company;

public class Airplane extends EngineAirTransport {

    Airplane(String sideNumber, int enginePower, String takeOffMode) {
        super(sideNumber, enginePower);
        this.takeOffMode = takeOffMode;
    }

    private String takeOffMode;

    public String getTakeOffMode() {
        return takeOffMode;
    }

    public void setTakeOffMode(String takeOffMode) {
        this.takeOffMode = takeOffMode;
    }

    /*@Override
    public String toString() {
        return "Airplane{" +
                "type='" + getType() + '\'' +
                "sideNumber='" + getSideNumber() + '\'' +
                "enginePower=" + getEnginePower() + '\'' +
                "takeOffMode='" + takeOffMode + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
        return super.toString()
                + "\n\ttakeOffMode: \"" + takeOffMode + "\"\n" +
                "}";
    }
}
