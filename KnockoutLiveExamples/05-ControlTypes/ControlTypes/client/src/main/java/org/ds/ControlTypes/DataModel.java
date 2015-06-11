package org.ds.ControlTypes;

import net.java.html.json.Model;
import net.java.html.json.Property;

@Model(className = "Data", targetId = "", properties = {
    @Property(name = "stringValue", type = String.class),
    @Property(name = "passwordValue", type = String.class),
    @Property(name = "booleanValue", type = boolean.class),
    @Property(name = "optionValues", type = String.class, array = true),
    @Property(name = "selectedOptionValue", type = String.class),
    @Property(name = "countryOptionValues", type = Country.class, array = true),
    @Property(name = "selectedCountryOptionValue", type = Country.class),
    @Property(name = "multipleSelectedOptionValues", type = String.class, array = true),
    @Property(name = "radioSelectedOptionValue", type = String.class)
})
final class DataModel {
    
    @Model(className = "Country", targetId = "", properties = {
        @Property(name = "name", type = String.class),
        @Property(name = "population", type = int.class)
    })
    public static final class CountryModel{
    }
}
