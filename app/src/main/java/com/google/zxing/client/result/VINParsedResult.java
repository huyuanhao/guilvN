package com.google.zxing.client.result;

public final class VINParsedResult extends ParsedResult {
    public final String countryCode;
    public final int modelYear;
    public final char plantCode;
    public final String sequentialNumber;
    public final String vehicleAttributes;
    public final String vehicleDescriptorSection;
    public final String vehicleIdentifierSection;
    public final String vin;
    public final String worldManufacturerID;

    public VINParsedResult(String str, String str2, String str3, String str4, String str5, String str6, int i, char c, String str7) {
        super(ParsedResultType.VIN);
        this.vin = str;
        this.worldManufacturerID = str2;
        this.vehicleDescriptorSection = str3;
        this.vehicleIdentifierSection = str4;
        this.countryCode = str5;
        this.vehicleAttributes = str6;
        this.modelYear = i;
        this.plantCode = c;
        this.sequentialNumber = str7;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(this.worldManufacturerID);
        sb.append(' ');
        sb.append(this.vehicleDescriptorSection);
        sb.append(' ');
        sb.append(this.vehicleIdentifierSection);
        sb.append('\n');
        String str = this.countryCode;
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append(this.modelYear);
        sb.append(' ');
        sb.append(this.plantCode);
        sb.append(' ');
        sb.append(this.sequentialNumber);
        sb.append('\n');
        return sb.toString();
    }

    public int getModelYear() {
        return this.modelYear;
    }

    public char getPlantCode() {
        return this.plantCode;
    }

    public String getSequentialNumber() {
        return this.sequentialNumber;
    }

    public String getVIN() {
        return this.vin;
    }

    public String getVehicleAttributes() {
        return this.vehicleAttributes;
    }

    public String getVehicleDescriptorSection() {
        return this.vehicleDescriptorSection;
    }

    public String getVehicleIdentifierSection() {
        return this.vehicleIdentifierSection;
    }

    public String getWorldManufacturerID() {
        return this.worldManufacturerID;
    }
}
