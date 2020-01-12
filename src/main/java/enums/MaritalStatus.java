package enums;

import java.io.FileNotFoundException;

/**
 * @author Evgeny Borisov
 */
public enum MaritalStatus {
    SINGLE("רווק", 1, new SingleMaritalStatusHandler()),
    MARRIED("נשוי", 2,new MarriedMaritalStatusHandler()),
    DIVORCED("GARUSH", 5,new DivorcedMaritalStatusHandler());

    private final String hebrewDesc;
    private final int dbCode;
    private final MaritalStatusHandler handler;

    private MaritalStatus(String hebrewDesc, int dbCode, MaritalStatusHandler handler) {
        System.out.println("creating enum: "+hebrewDesc);
        this.hebrewDesc = hebrewDesc;
        this.dbCode = dbCode;
        this.handler = handler;
    }


    public String getHebrewDesc() {
        return hebrewDesc;
    }

    public static MaritalStatus findByDbCode(int dbCode) throws Exception {
        MaritalStatus[] statuses = values();
        for (MaritalStatus status : statuses) {
            if (status.dbCode == dbCode) {
                return status;
            }
        }

        throw new Exception(dbCode+" not supported");

       /* MaritalStatus[] statuses = values();
        return Arrays.stream(statuses)
                .filter(maritalStatus -> maritalStatus.dbCode == dbCode)
                .findAny()
                .get();*/


    }





}





