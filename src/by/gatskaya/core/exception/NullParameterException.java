package by.gatskaya.core.exception;

import by.gatskaya.core.enums.Location;

public class NullParameterException extends RuntimeException {
    public NullParameterException(String par1, Location par2, String par3) {
        super("No parameter can be null. par1 = " + par1 + "par2 = " + par2 + "par3 = " + par3);
    }
}
