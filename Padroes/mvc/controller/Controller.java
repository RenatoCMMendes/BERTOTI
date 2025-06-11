package mvc.controller;

import mvc.model.Sensor;

public interface Controller {
    void updateSensor(Sensor sensor);
    String format(double t);
}
