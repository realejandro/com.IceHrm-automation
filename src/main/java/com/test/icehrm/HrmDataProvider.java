package com.test.icehrm;

import org.testng.annotations.DataProvider;

public class HrmDataProvider {

    @DataProvider(name="CompanyInformationData")
    public Object[][] geCompanyInformationProvider(){
        return new Object[][]{//String name, String details, String type, String country, String timeZone
                { "Diaverum", "Dialysis Testing Group", "Company" , "Venezuela", "America/Caracas" },
                { "Oxoft", "Software Development", "Head Office" , "Colombia", "America/Bogota" },
                { "PDVSA", "Oil", "Company" , "Venezuela", "America/Caracas" }
        };
    }
}
