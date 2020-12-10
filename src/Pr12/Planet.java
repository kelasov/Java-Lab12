package Pr12;

public enum Planet {
    Mercury(  2400,3.3*Math.pow(10,23)),
    Venus (6100,4.9*Math.pow(10,24)),
    Earth(6400,6*Math.pow(10,24)),
    Mars (3400,6.4*Math.pow(10,23)),
    Jupiter (7100,1.9*Math.pow(10,27)),
    Saturn (6000,5.7*Math.pow(10,26)),
    Uranus (2600,8.7*Math.pow(10,25)),
    Neptune (2500,1.0*Math.pow(10,26));
    public double radius;
    public double mass;
    Planet(double radius, double mass) {
        this.radius = radius;
        this.mass = mass;
    }
}