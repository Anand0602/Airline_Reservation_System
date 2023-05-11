package Add_Flight_Details;

public class Product {
    
    private int id,price;
    private String name,source,dest,date,arrival,dep; 
    
    
    
    public Product(int fid, String fname,String fsource , String fdest, String fdate,String farrival,String fdep,int fprice)
    {
        this.id = fid;
        this.name = fname;
        this.source = fsource;
        this.dest = fdest;
        this.date = fdate;
        this.arrival = farrival;
        this.dep = fdep;
        this.price = fprice;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getSource()
    {
        return source;
    }
    
    public String getdete()
    {
        return  date;
    }
    
    public String getArrival()
    {
        return arrival;
    }
    public String getDep()
    {
        return dep;
    }
    public int getPrice()
    {
        return price;
    }
    
}


