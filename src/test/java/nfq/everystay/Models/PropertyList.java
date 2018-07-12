package nfq.everystay.Models;

public class PropertyList {
    private final String fields ;
    private final String values ;

    public PropertyList(String fields , String values) {
        this.fields = fields ;
        this.values = values ;

    }

    public final String getFields()
    {
        return fields;

    }

    public final String getValues()
    {
        return values;

    }

}
