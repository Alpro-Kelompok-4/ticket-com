package org.kelompok4.app;

public class RwTrackModel {
    private RwStationModel origin;
    private RwStationModel destination;
    private int duration;

    public RwTrackModel(RwStationModel origin, RwStationModel destination, int duration) {
        this.origin = origin;
        this.destination = destination;
        this.duration = duration;
    }

    public RwTrackModel() {
    }

    public RwStationModel getOrigin() {
        return origin;
    }

    public void setOrigin(RwStationModel origin) {
        this.origin = origin;
    }

    public RwStationModel getDestination() {
        return destination;
    }

    public void setDestination(RwStationModel destination) {
        this.destination = destination;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
