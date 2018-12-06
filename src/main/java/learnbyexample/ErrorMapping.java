package learnbyexample;

public enum ErrorMapping {

    T101("Unable to handle request!"),
    T102("No request template was recognized!"),
    T103("Access denied!"),
    T201("No valid request was recognized!"),
    T202("The pickup date can't be later than the return date!"),
    T203("The reservation needs to be for 1 or more days!"),
    T204("Pickup date needs to be later than 24 hours from now!"),
    T205("Internal server error!"),
    T206("Invalid partner code!"),
    T207("Invalid reservation number!"),
    T208("Reservation number already exists!");

    private String errorDescription;

    ErrorMapping(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getErrorDescription() {
        return errorDescription;
    }
}
