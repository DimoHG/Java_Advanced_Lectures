package christmasRaces.entities.cars;

import christmasRaces.common.ExceptionMessages;

public class MuscleCar extends BaseCar {

    private final static double DEFAULT_CUBIC_CENTIMETERS = 5000;
    private final static int MIN_HORSE_POWER = 400;
    private final static int MAX_HORSE_POWER = 600;

    public MuscleCar(String model, int horsePower) {
        super(model, horsePower, DEFAULT_CUBIC_CENTIMETERS);
    }


    @Override
    protected void checkHorsePower(int horsePower) {
        if (horsePower < MIN_HORSE_POWER || horsePower > MAX_HORSE_POWER) {
            String exceptionMessage = String.format(ExceptionMessages.INVALID_HORSE_POWER, horsePower);
            throw new IllegalArgumentException(exceptionMessage);
        }
    }

//    protected void setHorsePower(int horsePower) {
//        if (horsePower < MIN_HORSE_POWER || horsePower > MAX_HORSE_POWER) {
//            String exceptionMessage = String.format(ExceptionMessages.INVALID_HORSE_POWER, horsePower);
//            throw new IllegalArgumentException(exceptionMessage);
//        }
//        super.setHorsePower(horsePower);
//    }
}
