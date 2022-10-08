package com.stratahealth.Demeter.enums;

public enum PhoneNumberLabels {
    pager("Enum.PhoneNumberLabels.Pager"),
    primary("Enum.PhoneNumberLabels.Primary"),
    fax("Enum.PhoneNumberLabels.Fax"),
    alternate1("Enum.PhoneNumberLabels.Alternate1"),
    alternate2("Enum.PhoneNumberLabels.Alternate2");

    private String localization;

    PhoneNumberLabels(String localization) {
        this.localization = localization;
    }

    public static PhoneNumberLabels getPhoneNumberLabel(String phoneNumberLabel) {
        try {
            return valueOf(phoneNumberLabel);
        }
        catch (IllegalArgumentException e) {
            throw new RuntimeException("Phone number label " + phoneNumberLabel + " is invalid!");
        }
    }

    public String getLocalization() {
        return localization;
    }
}
