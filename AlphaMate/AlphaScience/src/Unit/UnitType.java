/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit;

/**
 *
 * @author frascog
 */
public enum UnitType {

    Acceleration,
    Amount_Of_Substance,
    Angle,
    Angular_Acceleration,
    Angular_Velocity,
    Area,
    Blood_Suger,
    Data_Amount,
    Data_Rate,
    Dimensionless,
    Duration,
    Dynamic_Viscosity,
    Electric_Capacitance,
    Electric_Charge,
    Electric_Conductance,
    Electric_Current,
    Electric_Inductance,
    Electric_Potential,
    Electric_Resistance,
    Energy,
    Force,
    Frequency,
    Illuminance,
    Kinematic_Viscosity,
    Length,
    Luminous_Flux,
    Luminous_Intensity,
    Magnetic_Flux,
    Magnetic_Flux_Density,
    Magnetic_Flux_Density_Strength,
    Magnetomotive_Force,
    Mass,
    Mass_Flow_Rate,
    Metric,
    Molar_Mass,
    Power,
    Pressure,
    Radiation_Dose_Absorbed,
    Radiation_Dose_Effective,
    Radioactive_Activity,
    Solid_Angle,
    Temperature,
    Torque,
    Velocity,
    Volume,
    Volumetric_Density,
    Volumetric_Flow_Rate;

    @Override
    public String toString() {
        String name = super.toString();
        if (name != null) {
            name = name.replace('_', ' ');
            name = capitalizeString(name);
        }
        return name;
    }

    public static String capitalizeString(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '\'') { // You can add other chars here
                found = false;
            }
        }
        return String.valueOf(chars);
    }
}
