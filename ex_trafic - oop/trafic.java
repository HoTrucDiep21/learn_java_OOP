

public abstract class  trafic<manufacturBrand> {
    String tranfortType;
    protected manufactureBrand manuBrand;

    public trafic() {
    }

    public trafic(String tranfortType, manufactureBrand manuBrand) {
        this.tranfortType = tranfortType;
        this.manuBrand = manuBrand;
    }

    public String getTranfortType() {
        return tranfortType;
    }

    public void setTranfortType(String tranfortType) {
        this.tranfortType = tranfortType;
    }

    public manufactureBrand getManuBrand() {
        return manuBrand;
    }

    public void setManuBrand(manufactureBrand manuBrand) {
        this.manuBrand = manuBrand;
    }

    public void start() {
        System.out.println("transport move...");
    }

    public void acceleration() {
        System.out.println("Transport acceleration 200km/h...");
    }

    public void stop() {
        System.out.println("Transport has stop...");
    }

    public abstract void getSpeed();

    
    

    


}
