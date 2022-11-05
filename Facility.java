public class Facility {
    private boolean AC;
    private boolean pool;
    private boolean lunch;
    private boolean breakfast;
    private boolean dinner;
    private boolean wifi;
    private boolean BedType;

    public Facility(boolean AC, boolean pool, boolean breakfast, boolean lunch,
    boolean dinner, boolean wifi) //cons untuk kamar single
    {
        this.AC=AC;
        this.pool=pool;
        this.breakfast=breakfast;
        this.dinner=dinner;
        this.wifi=wifi;
    }

    public Facility(boolean AC, boolean pool, boolean breakfast, boolean lunch,
    boolean dinner, boolean wifi, boolean BedType) //cons untuk kamar double
    {
        this.AC=AC;
        this.pool=pool;
        this.breakfast=breakfast;
        this.dinner=dinner;
        this.wifi=wifi;
        this.BedType=BedType;
    }
    
    public boolean getAC()
    {
        return this.AC;
    }

    public boolean getPool()
    {
        return this.pool;
    }

    public boolean getBreakfast()
    {
        return this.breakfast;
    }

    public boolean getDinner()
    {
        return this.dinner;
    }

    public boolean getWifi()
    {
        return this.wifi;
    }

    public boolean getLunch(){
        return this.lunch;
    }

    public boolean getBedType(){
        return this.BedType;
    }
}
